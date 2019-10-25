package br.com.pontosel.model;

public class Relatorio {

	private Long id;
	
	private Funcionario funcionario;
	
	
	public Relatorio() {
	}


	public Relatorio(Long id, Funcionario funcionario) {
		super();
		this.id = id;
		this.funcionario = funcionario;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	//Metodos
	
	public void gerarRelatorio() {
		
	}
	
	public void gerarHistorico() {
		
	}
	
}
