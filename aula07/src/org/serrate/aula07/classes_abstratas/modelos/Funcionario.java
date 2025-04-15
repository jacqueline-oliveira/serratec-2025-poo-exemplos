package org.serrate.aula07.classes_abstratas.modelos;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	protected double salario;
	private String turno;
	
	
	public Funcionario(String cpf, String nome, double salario, String turno) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.turno = turno;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public abstract void aumentarSalario();


	@Override
	public String toString() {
		return "Funcionario: " + nome + ", cpf=" + cpf + ", salario=" + salario + ", turno=" + turno ;
	}
	
}
