package org.serratec.aula06.modelos;

import java.time.LocalDate;

public class Cliente {
	private String nome;
	private String telefone;
	private LocalDate dataCadastro;
	
	
	public Cliente(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
		this.dataCadastro = LocalDate.now();
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s Telefone: %s Data cadastro: %s", nome,
				telefone, dataCadastro);
	}
}
