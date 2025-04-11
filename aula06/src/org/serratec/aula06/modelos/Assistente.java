package org.serratec.aula06.modelos;

public class Assistente extends Funcionario {
	private double adicional;

	public Assistente(String nome, double salario, double adicional) {
		super(nome, salario);
		this.adicional = adicional;
	}

	@Override
	public String toString() {
		return super.toString() + " adicional: " + adicional ;
	}
	
	@Override
	public void aumentaSalario() {
		super.aumentaSalario();
		salario += adicional;
	}
}
