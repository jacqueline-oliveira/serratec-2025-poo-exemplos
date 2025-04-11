package org.serratec.aula05.modelos;

public class Consumidor {
	private String nome;
	private String cpf;
	private Endereco endereco;
	
	public Consumidor(String nome, String cpf, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public Endereco getEndereco() {
		return endereco;
	}



	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}



	@Override
	public String toString() {
		return "Consumidor: " + nome + ", cpf: " + cpf + ", " + endereco;
	}
}
