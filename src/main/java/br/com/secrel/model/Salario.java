package br.com.secrel.model;

public class Salario {

	private Long id;
	private Double totalSalario;
	
	public Salario() {
	}

	public Salario(Long id, Double totalSalario) {
		super();
		this.id = id;
		this.totalSalario = totalSalario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getTotalSalario() {
		return totalSalario;
	}

	public void setTotalSalario(Double totalSalario) {
		this.totalSalario = totalSalario;
	}
	
	
}
