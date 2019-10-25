package br.com.pontosel.model;

public class Expediente {

	private Long id;
	private Integer horario;
	private String turno;
	
	public Expediente() {
	}

	public Expediente(Long id, Integer horario, String turno) {
		super();
		this.id = id;
		this.horario = horario;
		this.turno = turno;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getHorario() {
		return horario;
	}

	public void setHorario(Integer horario) {
		this.horario = horario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	
}
