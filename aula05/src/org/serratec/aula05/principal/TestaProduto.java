package org.serratec.aula05.principal;

import java.util.Scanner;

import org.serratec.aula05.modelos.Produto;

public class TestaProduto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcao = "N";
				
		while (!opcao.equalsIgnoreCase("S")) {
			System.out.println("Digite o nome do produto: ");
			String nome = sc.nextLine();
			System.out.println("Digite o valor do produto: ");
			double valor = sc.nextDouble();
			System.out.println("Digite a quantidade do produto: ");
			int quantidade = sc.nextInt();
			sc.nextLine();
			
			Produto produto = new Produto(nome, valor, quantidade);
			produto.calcularIcms();
			System.out.println(produto);
			System.out.println("Deseja encerrar o programa? (S/N) ");
			opcao = sc.nextLine();
		}
	}

}
