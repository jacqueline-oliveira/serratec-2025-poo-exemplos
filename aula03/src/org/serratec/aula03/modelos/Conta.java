package org.serratec.aula03.modelos;

public class Conta {
	private String agencia;
	private String conta;
	private String titular;
	private double saldo;

	public Conta(String agencia, String conta, String titular, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		this.saldo = saldo;
	}

	
	public String getAgencia() {
		return agencia;
	}

	public String getConta() {
		return conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		if (!titular.trim().isBlank() ) {
			this.titular = titular;
		} 
	}

	public void exibirDados() {
		System.out.println("Agência: " + agencia);
		System.out.println("Conta:   " + conta);
		System.out.println("Titular: " + titular);
		System.out.println("Saldo:   " + saldo);
	}

	public void depositar(double valor) {
		saldo += valor;
		exibirSaldo();
	}

	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			exibirSaldo();
		} else {
			System.out.println("Saldo insuficiente para saque. ");
		}
	}

	private void exibirSaldo() {
		System.out.println("Cta: " + conta + " - Saldo atualizado: " + saldo);
	}


	public void transferir(double valor, Conta conta) {
		if (valor <= saldo) {
			sacar(valor);
			conta.depositar(valor);
		} else {
			System.out.println("Saldo insuficiente para realizar essa transferência");
		}
	}
}
