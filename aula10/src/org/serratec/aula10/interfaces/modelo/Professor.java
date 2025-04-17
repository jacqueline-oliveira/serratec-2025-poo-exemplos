package org.serratec.aula10.interfaces.modelo;

public class Professor implements Situacao {
	private String nome;
	private String disciplina;
	
	public Professor(String nome, String disciplina) {
		this.nome = nome;
		this.disciplina = disciplina;
	}

	@Override
	public String verificarSituacao() {
		return "O professor " + nome + " que ministra a disciplina " + disciplina +
				" teve seu contrato renovado. ";
	}
}
