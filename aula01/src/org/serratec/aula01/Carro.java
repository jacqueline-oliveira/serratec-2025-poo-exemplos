package org.serratec.aula01;

public class Carro {
	String modelo;
	int ano;
	String cor;
	double valor;
	
	
	void imprimeDados() {
		System.out.println("Carro: " + modelo);
		System.out.println("Ano: " + ano);
		System.out.println("Cor: " + cor);
		System.out.println("Valor: " + valor);
	}
	
	void calcularDesconto(double percentual) {
		double valorComDesconto = valor * (percentual / 100);
		System.out.println("Valor com desconto do carro: " + modelo + " = " + valorComDesconto);
	}

}
