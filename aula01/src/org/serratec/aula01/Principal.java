package org.serratec.aula01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carro carro1 = new Carro();
		
		System.out.println("Informe o modelo do carro: ");
		carro1.modelo = sc.nextLine();
		System.out.println("Informe o ano do carro: ");
		carro1.ano = sc.nextInt();
		sc.nextLine();
		System.out.println("Informe a cor: ");
		carro1.cor = sc.nextLine();
		System.out.println("Informe o valor ");
		carro1.valor = sc.nextDouble();
		
		double avaliacao = 0.0;
		String textoAvaliacao = "";
		
		do {
			System.out.println("Digite uma avaliação de 0 a 10 ou número negativo para encerrar. ");
			avaliacao = sc.nextDouble();
			
			if (textoAvaliacao.isBlank()) {
				textoAvaliacao = "" + avaliacao;
			} else if (avaliacao >= 0) {
				textoAvaliacao = textoAvaliacao + ", " + avaliacao;	
			}
			
		} while(avaliacao >= 0);
		
		carro1.imprimeDados();
		System.out.println("\nAvaliações: " + textoAvaliacao);
		sc.close();
	}
}
