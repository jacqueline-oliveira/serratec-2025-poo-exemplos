package org.serratec.aula10.interfaces.modelo;

public class Aluno implements Situacao {
	private String nome;
	private int ano;
	
	
	public Aluno(String nome, int ano) {
		super();
		this.nome = nome;
		this.ano = ano;
	}


	@Override
	public String verificarSituacao() {
		return "O aluno " + nome + " está matriculado";
	}
}
