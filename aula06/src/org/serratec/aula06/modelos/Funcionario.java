package org.serratec.aula06.modelos;

public class Funcionario {
	private String nome;
	private String cpf;
	protected double salario;
	private String turno;
	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
		
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}




	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}

	
	public void aumentaSalario() {
		salario += salario * 0.02;
	}
	
	public void exibirSalarioAtualizado() {
		System.out.printf("\nSalario de %s atualizado para %.2f", nome, salario);
	}


	@Override
	public String toString() {
		return "Funcionario: " + nome + ", cpf=" + cpf + ", salario=" + salario + ", turno=" + turno ;
	}
	
}
