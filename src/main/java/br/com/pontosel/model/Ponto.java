package br.com.pontosel.model;

import java.util.Date;

public class Ponto {

	private Long id;
	private Integer hora;
	private Date data;
	
	public Ponto() {
	}

	public Ponto(Long id, Integer hora, Date data) {
		super();
		this.id = id;
		this.hora = hora;
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	//Metodos
	
	public void registrarPonto() {
		
	}
	
	
	public void consultarPonto() {
		
	}
}
