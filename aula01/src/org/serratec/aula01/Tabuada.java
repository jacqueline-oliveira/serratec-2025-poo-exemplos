package org.serratec.aula01;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		//Tabuada de um número de 1 a 10
		//se o usuário digitar 11, por exemplo, tenho que ficar
		//solicitando outro número até atender a condição acima
		
		Scanner sc = new Scanner(System.in);
		
		boolean opcaoValida;
		int numero;

		do {
			System.out.println("Digite um número de 1 a 10: ");
			numero = sc.nextInt();

			if (numero > 0 && numero <= 10) {
				opcaoValida = true;
				for (int i = 1; i <= 10; i++) {
					System.out.println("\n" + i + " X " + numero + " = " + (i * numero));
				}
			} else {
				opcaoValida = false;
				System.out.println("Número inválido. Digite outro número.");
			}

		} while (!opcaoValida);

		sc.close();
	}
}
