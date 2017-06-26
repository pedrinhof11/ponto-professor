package br.facape.ponto.model;

import java.io.Serializable;

public enum Turno implements Serializable{
	MATUTINO("Matutino"),
	VESTERTINO("Vestertino"),
	NOTURNO("Noturno");
	
	private String descricao;
	
	private Turno(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	
}
