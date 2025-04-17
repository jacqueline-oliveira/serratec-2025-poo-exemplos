package org.serratec.modelos;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	
	
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public abstract void exibirDados(); 
	
	

}
