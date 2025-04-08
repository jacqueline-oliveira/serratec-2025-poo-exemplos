package org.serratec.aula03.principal;

import org.serratec.aula03.modelos.Conta;

public class TestaConta {
	public static void main(String[] args) {
		Conta conta1 = new Conta("0001", "0001-0", "Maria", 0);
		Conta conta2 = new Conta("0002", "0002-0", "João", 100.00);
		
		conta1.depositar(2500);
		conta1.transferir(500, conta2);

		System.out.println("Conta 1:");
		conta1.exibirDados();

		System.out.println("");
		System.out.println("Conta 2:");
		conta2.exibirDados();
		conta2.sacar(1000);
		System.out.println("Titular da conta 2: " + conta2.getTitular());
		
	}

}
