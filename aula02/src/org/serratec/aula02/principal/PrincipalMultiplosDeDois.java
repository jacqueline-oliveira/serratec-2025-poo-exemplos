package org.serratec.aula02.principal;

public class PrincipalMultiplosDeDois {

	public static void main(String[] args) {
		// Faça um programa que percorra todos os número de 1 até 22. 
		// Para os números múltiplos de 2, imprima a palavra “Java”, e 
		// mostre o total de múltiplos de 2 encontrado.
		int contador = 0;

		for (int i = 1; i <= 22; i++) {
			if (i % 2 == 0) {
				contador++;
				System.out.println(contador + " - Java");
			}
		}
		System.out.println("Total de múltiplos de 2: " + contador);
	}
}