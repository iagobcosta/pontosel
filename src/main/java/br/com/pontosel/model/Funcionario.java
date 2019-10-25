package br.com.pontosel.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Funcionario implements Serializable{

	
	private static final long serialVersionUID = 5270682864264378277L;
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)	
	private Long id;
	
	
	private Date dataNascimento;
	
	private String nome;
	
	@Column(unique = true, name = "cpf", nullable = true, length = 13 )
	private Long cpf;
	
	private Long matricula;
	
	private Long telefone;
	
	private String senha;
	
	private Integer coFuncionario;
	
	private Date admissao;
	
	@OneToOne
	private Cargo cargo;
	
	private Endereco endereco;
	
	public Funcionario() {
	}

	public Funcionario(Long id, Date dataNascimento, String nome, Long cpf, Long matricula, Long telefone, String senha,
			Integer coFuncionario, Date admissao, Cargo cargo, Endereco endereco) {
		super();
		this.id = id;
		this.dataNascimento = dataNascimento;
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.telefone = telefone;
		this.senha = senha;
		this.coFuncionario = coFuncionario;
		this.admissao = admissao;
		this.cargo = cargo;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getCoFuncionario() {
		return coFuncionario;
	}

	public void setCoFuncionario(Integer coFuncionario) {
		this.coFuncionario = coFuncionario;
	}

	public Date getAdmissao() {
		return admissao;
	}

	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
