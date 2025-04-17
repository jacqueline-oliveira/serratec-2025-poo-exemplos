package org.serratec.modelos;

public class Palestrante extends Pessoa {
	private String temaPalestra;

	public Palestrante(String nome, String cpf, String temaPalestra) {
		super(nome, cpf);
		this.temaPalestra = temaPalestra;
	}

	@Override
	public void exibirDados() {
		System.out.println("Palestrante : " + getNome() + 
				" | " + "CPF: " + getCpf() + 
				" | " + "Tema palestra: " + temaPalestra);
	}
}
