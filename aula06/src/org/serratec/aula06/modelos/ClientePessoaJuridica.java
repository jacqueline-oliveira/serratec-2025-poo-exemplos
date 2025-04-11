package org.serratec.aula06.modelos;

public class ClientePessoaJuridica extends Cliente {
	private String cnpj;
	private String razaoSocial;
	private String inscricaoEstadual;
	
	public ClientePessoaJuridica(String nome, String telefone, String cnpj, String razaoSocial) {
		super(nome, telefone);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("\nCNPJ: %s Razão social: %s Inscrição estadual: %s", 
				cnpj, razaoSocial, inscricaoEstadual);
	}
	
	

	

}
