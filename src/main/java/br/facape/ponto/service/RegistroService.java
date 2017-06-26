package br.facape.ponto.service;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import java.util.function.Predicate;

import javax.inject.Inject;

import br.facape.ponto.controller.ProfessorLogado;
import br.facape.ponto.model.Disciplina;
import br.facape.ponto.model.DisciplinaHorario;
import br.facape.ponto.model.Frequencia;
import br.facape.ponto.repository.DisciplinaHorarioRepository;
import br.facape.ponto.repository.DisciplinaRepository;
import br.facape.ponto.repository.FrequenciaRepository;
import br.facape.ponto.util.Transacional;
import br.facape.ponto.util.Util;

public class RegistroService implements Serializable {

	private static final long serialVersionUID = -6627938505486127322L;

	@Inject
	private FrequenciaRepository frequenciaRepository;

	@Inject
	private DisciplinaRepository disciplinaRepository;

	@Inject
	private DisciplinaHorarioRepository disciplinaHorarioRepository;

	@Transacional
	public boolean salvar(Frequencia frequencia) {
		boolean r = false;

		try {

			frequenciaRepository.persist(frequencia);
			r = true;

		} catch (Exception e) {
		}

		return r;
	}
	
	@Transacional
	public Set<DisciplinaHorario> horariosPorProfessor(ProfessorLogado professorLogado) {
		
		Predicate<DisciplinaHorario> porProfessor = h -> h.getDisciplina().getProfessor().getId().equals(professorLogado.getId());
		
		return disciplinaHorarioRepository.get(porProfessor);		
	}

	@Transacional
	public Set<Disciplina> diciplinasPorProfessor(ProfessorLogado professorLogado) {

		Predicate<Disciplina> porProfessor = d -> d.getProfessor().getId().equals(professorLogado.getId());

		return disciplinaRepository.get(porProfessor);
	}

	@Transacional
	public Set<DisciplinaHorario> horariosPorDiciplina(Disciplina disciplina) {

		Predicate<DisciplinaHorario> porDisciplina = h -> h.getDisciplina().getId().equals(disciplina.getId());

		return disciplinaHorarioRepository.get(porDisciplina);
	}

	@Transacional
	public boolean verificaRegistro(Frequencia frequencia) {

		Predicate<Frequencia> registroNoDia = f -> (f.getDisciplinaHorario().equals(frequencia.getDisciplinaHorario())
				&& f.getDia().equals(Util.somenteData(new Date())));
		
		Set<Frequencia> frequencias = frequenciaRepository.get(registroNoDia);
		return frequencias.size() >= 1;

	}

}
