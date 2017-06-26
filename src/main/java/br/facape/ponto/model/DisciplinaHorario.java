package br.facape.ponto.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="disciplina_horario")
public class DisciplinaHorario extends AbstractModel{

	private static final long serialVersionUID = 4754198138627165041L;
	
	@ManyToOne
	@JoinColumn(name="disciplina_id", nullable=false)
	private Disciplina disciplina;
	
	@Enumerated(EnumType.ORDINAL)
	private Dia dia;
	
	@Column(name = "inicio")
	@Temporal(TemporalType.TIME)
	private Date inicio;

	@Column(name = "fim")
	@Temporal(TemporalType.TIME)
	private Date fim;

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Dia getDia() {
		return dia;
	}

	public void setDia(Dia dia) {
		this.dia = dia;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}
	
	
	
	
}
