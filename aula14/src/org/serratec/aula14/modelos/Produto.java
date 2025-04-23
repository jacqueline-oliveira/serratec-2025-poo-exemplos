package org.serratec.aula14.modelos;

public class Produto {
	private String nome;
	private double valor;
	
	
	public Produto(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}


	public String getNome() {
		return nome;
	}


	public double getValor() {
		return valor;
	}


	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valor=" + valor + "]";
	}
}
