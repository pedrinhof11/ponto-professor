package br.facape.ponto.repository;

import br.facape.ponto.model.Frequencia;

public class FrequenciaRepository extends AbstractRepository<Frequencia, Long> {

	public FrequenciaRepository() {
		super(Frequencia.class);
	}

	private static final long serialVersionUID = 7245386374132643221L;


}
