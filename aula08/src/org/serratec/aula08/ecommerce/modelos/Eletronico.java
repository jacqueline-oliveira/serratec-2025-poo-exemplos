package org.serratec.aula08.ecommerce.modelos;

public class Eletronico extends Produto {
	private String marca;
	private int mesesGarantia;
	
	public Eletronico(String nome, double preco, int estoque, String marca, int mesesGarantia) {
		super(nome, preco, estoque);
		this.marca = marca;
		this.mesesGarantia = mesesGarantia;
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("Eletrônico: " + getNome() + 
				" | Marca: " + marca + 
				" | Garantia: " + mesesGarantia + " mês(es)" +
				" | Preço: R$ " + getPreco() +
				" | Estoque: " + getEstoque());	
	}
	
}
