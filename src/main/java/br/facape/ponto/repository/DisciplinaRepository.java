package br.facape.ponto.repository;

import br.facape.ponto.model.Disciplina;

public class DisciplinaRepository extends AbstractRepository<Disciplina, Long>{

	public DisciplinaRepository() {
		super(Disciplina.class);
	}

	private static final long serialVersionUID = -560678121601387819L;

}
