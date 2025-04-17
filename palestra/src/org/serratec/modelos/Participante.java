package org.serratec.modelos;

public class Participante extends Pessoa {
	private String email;

	public Participante(String nome, String cpf, String email) {
		super(nome, cpf);
		this.email = email;
	}

	@Override
	public void exibirDados() {
		System.out.println("Participante: " + getNome() + 
				" | " + "CPF: " + getCpf() + 
				" | " + "E-mail: " + email);
		
	}
	
}
