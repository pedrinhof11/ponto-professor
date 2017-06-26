package br.facape.ponto.repository;

import br.facape.ponto.model.DisciplinaHorario;

public class DisciplinaHorarioRepository extends AbstractRepository<DisciplinaHorario, Long>{

	private static final long serialVersionUID = -8664105262607754689L;

	public DisciplinaHorarioRepository() {
		super(DisciplinaHorario.class);
	}

}
