package org.serrate.aula07.classes_abstratas.modelos;

public class Assistente extends Funcionario {
	private double adicional;

	public Assistente(String cpf, String nome, double salario, String turno) {
		super(cpf, nome, salario, turno);
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	@Override
	public String toString() {
		return " adicional: " + adicional;
    }

	@Override
	public void aumentarSalario() {
		salario = salario * 1.15 + adicional;
		System.out.println("Novo salario do assistente: " + salario);
	}
	
	
	
	

}
