package br.facape.ponto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="curso")
public class Curso extends AbstractModel {

	private static final long serialVersionUID = -311777165242302544L;
	
	@Column(nullable=false, length=30)
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
