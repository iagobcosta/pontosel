package br.com.pontosel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gerente extends Funcionario {

	private static final long serialVersionUID = 2565728163488440738L;
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
