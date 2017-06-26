package br.facape.ponto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="disciplina")
public class Disciplina extends AbstractModel {

	private static final long serialVersionUID = -5283667011015245358L;
	
	@ManyToOne
	@JoinColumn(name="curso_id", nullable=false)
	private Curso curso;
	
	@Enumerated(EnumType.STRING)
	private Turno turno;
	
	@ManyToOne
	@JoinColumn(name="professor_id", nullable=false)
	private Professor professor;
	
	@Column(nullable=false, length=80)
	private String descricao;

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	
}
