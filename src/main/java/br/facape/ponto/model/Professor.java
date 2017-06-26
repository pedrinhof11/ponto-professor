package br.facape.ponto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="professor")
public class Professor extends AbstractModel{
		

	private static final long serialVersionUID = -2272347706786120539L;
	
	@Column(nullable=false, length=80)
	private String nome;
	
	@Column(nullable=false, length=8)
	private String login;
	
	@Column(nullable=false, length=60)
	private String senha;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
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
	
	
	
}
