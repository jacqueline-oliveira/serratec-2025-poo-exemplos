package org.serratec.aula10.interfaces.modelo;

public class Coordenador {
	private String nome;
	private String turno;
	
	
	public Coordenador(String nome, String turno) {
		super();
		this.nome = nome;
		this.turno = turno;
	}
	
	public void exibirDados() {
		System.out.println("O cordenador " + nome + " trabalha no seguinte turno: " + turno);
	}
}
	