package org.serratec.aula08.ecommerce.modelos;

public abstract class Produto {
	private String nome;
	private double preco;
	private int estoque;

	public Produto(String nome, double preco, int estoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public abstract void exibirInformacoes();

	public boolean vender(int quantidade) {
		if(quantidade <= estoque) {
			estoque -= quantidade;
			return true;
		}

		return false;
	}

	public void aumentarEstoque(int quantidade) {
		if (quantidade > 0) {
			estoque += quantidade;
			System.out.println("Estoque atualizado com sucesso!");
		} else {
			System.out.println("Quantidade inválida. Estoque não alterado.");
		}
	}
}
