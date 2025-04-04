package org.serratec.aula02.principal;

public class PrincipalNumerosParesImpares {
	public static void main(String[] args) {
		//Faça um programa que percorra números entre 0 e 30 
		//e exiba a quantidade de números
		// pares e impares.
		
		int numeroPar = 0, numeroImpar = 0;
		
		for (int i = 0; i <= 30; i++) {
			if (i % 2 == 0) {
				numeroPar++;
			} else {
				numeroImpar++;
			}
		}
		
		System.out.println("Total números pares: " + numeroPar);
		System.out.println("Total números ímpares: " + numeroImpar);
	}
}
