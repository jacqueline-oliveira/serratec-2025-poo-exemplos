package org.serrate.aula07.modelos;

public class AnimalExtincao extends Animal {
	private String numeroIdentificacaoIbama;

	public AnimalExtincao(String nome, String numeroIdentificacaoIbama) {
		super(nome);
		this.numeroIdentificacaoIbama = numeroIdentificacaoIbama;
	}

	@Override
	public String toString() {
		return super.toString() + " número identificação Ibama: " + numeroIdentificacaoIbama;
	}

	@Override
	public void emitirSom() {
		System.out.println("Som que o animal em extinção faz");
		
	}
	
	
	
	
	

}
