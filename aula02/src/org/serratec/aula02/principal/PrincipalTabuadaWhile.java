package org.serratec.aula02.principal;

import java.util.Scanner;

public class PrincipalTabuadaWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, i = 1;

		System.out.println("Insira um número para fazer a tabuada: ");
		num = sc.nextInt();

		while(i <= 10){
			System.out.println(num + " * " + i + " = " + (i * num));
			i++;
		}

		sc.close();
	}

}
