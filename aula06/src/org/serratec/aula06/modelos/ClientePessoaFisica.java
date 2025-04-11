package org.serratec.aula06.modelos;

import java.time.LocalDate;

public class ClientePessoaFisica extends Cliente {
	private String cpf;
	private String rg;
	private LocalDate dataNascimento;
	

	public ClientePessoaFisica(String nome, String telefone, String cpf) {
		super(nome, telefone);
		this.cpf = cpf;
	}
	
	
	
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}



	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	public String getCpf() {
		return cpf;
	}



	@Override
	public String toString() {
		return super.toString() + String.format("\nCpf: %s RG: %s Data Nascimento: %s",
				cpf, rg, dataNascimento);
	}

}
