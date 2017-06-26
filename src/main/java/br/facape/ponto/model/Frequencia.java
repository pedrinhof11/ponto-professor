package br.facape.ponto.model;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table
@Entity(name="frequencia")
public class Frequencia extends AbstractModel{

	private static final long serialVersionUID = 1915074354213364037L;
		
	@ManyToOne
	@JoinColumn(name="disciplina_horario_id", nullable=false)
	private DisciplinaHorario disciplinaHorario;
	
	@Lob
	@Column(name="conteudo_programado")
	private String conteudoProgramado;
	
	@Column(name = "data_resgistro", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataResgitro;


	public DisciplinaHorario getDisciplinaHorario() {
		return disciplinaHorario;
	}

	public void setDisciplinaHorario(DisciplinaHorario disciplinaHorario) {
		this.disciplinaHorario = disciplinaHorario;
	}
	
	public String getConteudoProgramado() {
		return conteudoProgramado;
	}
	
	public void setConteudoProgramado(String conteudoProgramado) {
		this.conteudoProgramado = conteudoProgramado;
	}

	public Date getDataResgitro() {
		return dataResgitro;
	}
	
	public void setDataResgitro(Date dataResgitro) {
		this.dataResgitro = dataResgitro;
	}
	
	public Date getDia(){       
        final Calendar c = Calendar.getInstance();
        c.setTime(dataResgitro);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }
	
}
