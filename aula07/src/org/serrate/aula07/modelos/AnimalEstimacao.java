package org.serrate.aula07.modelos;

import java.time.LocalDate;

public class AnimalEstimacao extends Animal {
	private LocalDate dataVacinacao;
	private TipoAnimalEstimacao tipo;

	public AnimalEstimacao(String nome, LocalDate dataVacinacao) {
		super(nome);
		this.dataVacinacao = dataVacinacao;
	}

	@Override
	public String toString() {
		return super.toString() + " data vacinação: " + dataVacinacao ;
	}

	@Override
	public void emitirSom() {
		System.out.println("Som que o animal de estimação faz...");
		
	}
	
	

}
