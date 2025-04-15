package org.serrate.aula07.modelos;

public abstract  class Animal {
	private String nome;

	public Animal(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Animal: " + nome ;
	}
	
	public abstract void emitirSom();

}
