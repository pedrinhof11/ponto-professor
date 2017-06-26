package br.facape.ponto.controller;

import java.io.Serializable;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import org.omnifaces.util.Faces;
import org.omnifaces.util.Messages;

import br.facape.ponto.model.Disciplina;
import br.facape.ponto.model.DisciplinaHorario;
import br.facape.ponto.model.Frequencia;
import br.facape.ponto.model.Professor;
import br.facape.ponto.repository.ProfessorRepository;
import br.facape.ponto.service.RegistroService;

@Named
@ViewScoped
public class RegistroBean implements Serializable {

	private static final long serialVersionUID = 9193196491396402972L;

	@Inject
	private RegistroService registroService;
	@Inject
	private ProfessorRepository professorRepository;
	@Inject
	private ProfessorLogado professorLogado;

	private Set<Disciplina> disciplinas;
	private Set<DisciplinaHorario> horarios;
	private Set<DisciplinaHorario> disciplinaHorarios;

	private Frequencia frequencia;
	private Disciplina disciplina;

	@NotNull
	private String senha;
	@NotNull
	private String login;

	@PostConstruct
	public void init() {

		if (professorLogado.isLogado()) {
			novaFrequencia();
			Faces.navigate("pm:registro?transition=slide");
		}

	}
	
	public String sair() {
		
		professorLogado.limpar();
		Faces.invalidateSession();
		
		return "pm:login?transition=slide";
	}

	public String autenticar() {

		String r = "";

		Professor professor = professorRepository.autenticar(login.trim(), senha.trim());

		if (professor != null && professor.getId() != null) {

			professorLogado.preencheLogado(professor);
			
			novaFrequencia();			

			r = "pm:registro?transition=slide";

		} else {
			
			Messages.addFlashGlobalError("auth.erro");
		}

		return r;
	}

	public void novaFrequencia() {
		
		frequencia = new Frequencia();
		listarDisciplinas();
		listarHorariosDoProfessor();

	}

	public void listarDisciplinas() {
		
		disciplinas = registroService.diciplinasPorProfessor(professorLogado);
	}

	public void listarHorarios() {
	
		horarios = registroService.horariosPorDiciplina(disciplina);
	}

	public void listarHorariosDoProfessor() {
		
		disciplinaHorarios = registroService.horariosPorProfessor(professorLogado);
	}
	
	public void registrar() {

		if (registroService.verificaRegistro(frequencia)) {
			
			Messages.addFlashGlobalError("registro.erro");
		
		} else {
			
			registroService.salvar(frequencia);
			disciplina = null;
			novaFrequencia();
			
			Messages.addFlashGlobalInfo("registro.sucesso");
			
		}

	}

	// Getters and Setters
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Set<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public Set<DisciplinaHorario> getHorarios() {
		return horarios;
	}
	
	public Set<DisciplinaHorario> getDisciplinaHorarios() {
		return disciplinaHorarios;
	}

	public Frequencia getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(Frequencia frequencia) {
		this.frequencia = frequencia;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

}
