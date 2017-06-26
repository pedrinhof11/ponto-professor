package br.facape.ponto.controller;

import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.facape.ponto.model.Professor;

@Named
@SessionScoped
public class ProfessorLogado implements Serializable {

	private static final long serialVersionUID = 8106353620624167777L;
	
	private Long id;
	
	private String nome;
	
	private Date dataLogado;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataLogado() {
		return dataLogado;
	}

	public void setDataLogado(Date dataLogado) {
		this.dataLogado = dataLogado;
	}
	
	public boolean isLogado(){
		return this.id != null;
	}
	
	public void limpar(){
		id = null;
		nome = null;
		dataLogado = null;
	}
	
	public void preencheLogado(Professor professor) {
		setId(professor.getId());
		setNome(professor.getNome());
		setDataLogado(new Date());
	}
	
}
