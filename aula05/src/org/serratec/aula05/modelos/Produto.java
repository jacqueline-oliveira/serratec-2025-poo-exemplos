package org.serratec.aula05.modelos;

public class Produto {
	private String descricao;
	private double valor;
	private int quantidade;
	private double icms;
	
	public Produto(String descricao, double valor, int quantidade) {
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "\nProduto: " + descricao + "\nValor: " + valor + ", "
				+ "\nTotal: " + (quantidade * valor) +  "\nICMS: " + icms;
	}

	public void calcularIcms() {
		icms = (valor * quantidade) * 0.12;
		
	}
	
}
