package br.com.pontosel.model;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

	private Long id;
	private String nome;
	
	private List<Cargo> cargos = new ArrayList<>();
}
