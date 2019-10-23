package br.com.secrel.model;

import java.util.ArrayList;
import java.util.List;

public class Cargo {

	private Long id;
	private String nome;
	
	private Departamento depto;
	private List<Funcionario> funcionarios = new ArrayList<>();
	
	public Cargo() {
	}

	public Cargo(Long id, String nome, Departamento depto) {
		super();
		this.id = id;
		this.nome = nome;
		this.depto = depto;
	}

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

	public Departamento getDepto() {
		return depto;
	}

	public void setDepto(Departamento depto) {
		this.depto = depto;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	//Metodos
	public void cadastrarCargo() {
		
	}
}
