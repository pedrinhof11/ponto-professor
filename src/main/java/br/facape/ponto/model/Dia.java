package br.facape.ponto.model;

import java.io.Serializable;

public enum Dia implements Serializable{
	SEG("Segunda-feira"),
    TER("Terça-feira"),
    QUA("Quarta-feira"),
	QUI("Quinta-feira"),
	SEX("Sexta-feira"),
	SAB("Sábado"),
	DOM("Domingo");
	
	private Dia(String descricao) {
		this.descricao = descricao;
	}
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	
   
    
}
