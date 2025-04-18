package org.serratec.aula03.modelos;

public class Pessoa {
	private String nome;
	private double peso;
	private double altura;
	private static int totalPessoas = 0;
	
	public Pessoa(String nome, double peso, double altura) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		totalPessoas++;	
	}
	
	//Para esse, será necessário chamar pessoa1.exibirDados();
	public void exibirDados() {
		System.out.println("Nome: " + nome + "\nAltura: " + altura + "\nPeso: " + peso + "\n");
	}
	
	//Para esse, ao chamar o System.out.println(pessoa1) já vai mostrar dessa forma
	@Override
	public String toString() {
		return "Nome: " + nome + "\nAltura: " + altura + "\nPeso: " + peso + "\n";
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}
	
	
	public static int getTotalPessoas() {
		return totalPessoas;
	}
}
