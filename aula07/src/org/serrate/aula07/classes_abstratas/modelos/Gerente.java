package org.serrate.aula07.classes_abstratas.modelos;

public class Gerente extends Funcionario {
	private String nivel;
	
	public Gerente(String cpf, String nome, double salario, String turno) {
		super(cpf, nome, salario, turno);
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return " nível: " + nivel;
	}

	@Override
	public void aumentarSalario() {
		salario = salario * 1.15 + 500;
		System.out.println("Novo salário do gerente: " + salario);
	}

}
