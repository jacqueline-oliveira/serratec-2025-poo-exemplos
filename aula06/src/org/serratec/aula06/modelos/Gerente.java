package org.serratec.aula06.modelos;

public class Gerente extends Funcionario {
	private String setor;

	public Gerente(String nome, double salario, String setor) {
		super(nome, salario);
		this.setor = setor;
	}

	@Override
	public String toString() {
		return super.toString() + " setor: " + setor;
	}

	
	@Override
	public void aumentaSalario() {
		super.aumentaSalario();
		salario += 200;
	}
	
}
