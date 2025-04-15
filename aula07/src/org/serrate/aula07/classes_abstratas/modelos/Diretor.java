package org.serrate.aula07.classes_abstratas.modelos;

public class Diretor extends Funcionario {
	private String categoria;

	public Diretor(String cpf, String nome, double salario, String turno) {
		super(cpf, nome, salario, turno);
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return " categoria: " + categoria ;
	}

	@Override
	public void aumentarSalario() {
		salario = salario * 1.1 + 1000;
		System.out.println("Novo salário do diretor: " + salario);
		
	}
	
}
