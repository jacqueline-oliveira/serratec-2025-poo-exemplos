package org.serratec.aula08.ecommerce.modelos;

public class Alimento extends Produto {
	private int quantidadePorItem;
	private UnidadeMedida unidadeMedida;
	
	public Alimento(String nome, double preco, int estoque, int quantidade, UnidadeMedida unidadeMedida) {
		super(nome, preco, estoque);
		this.quantidadePorItem = quantidade;
		this.unidadeMedida = unidadeMedida;
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("Alimento: " + getNome() +
				" | Preço: R$ " + getPreco() + 
				" | Estoque: " + getEstoque() +
				" | Descrição: " + quantidadePorItem + " " + unidadeMedida);	
	}

	
	
	
	

}
