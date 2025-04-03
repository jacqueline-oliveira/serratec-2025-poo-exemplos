package org.serratec.aula01;

import java.util.Scanner;

public class Matematica {
	public static void main(String[] args) {
		double numero1, numero2;
		int opcao;
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite o primeiro número: ");
		numero1 = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		numero2 = sc.nextDouble();
		System.out.println("Digite a operação desejada (1-Somar 2-Subtrair): ");
		opcao = sc.nextInt();
		
		if (opcao == 1) {
			somar(numero1, numero2);
		} else if (opcao == 2) {
			subtrair(numero1, numero2);
		} else {
			System.out.println("Opção inválida. Verifique");
		}
		
		sc.close();
		
	}
	
	static void somar(double n1, double n2) {
		System.out.println("Soma: " + (n1 + n2));
	}
	
	
	static void subtrair(double n1, double n2) {
		System.out.println("Subtração: " + (n1 - n2));
	}
	
	
	
	

}
