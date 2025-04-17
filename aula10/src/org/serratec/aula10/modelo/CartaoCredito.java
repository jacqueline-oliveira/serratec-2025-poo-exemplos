package org.serratec.aula10.modelo;

import java.time.LocalDate;

public class CartaoCredito extends Pagamento {
	private String numeroCartao;
	private int totalParcelas;
	
	
	public CartaoCredito(double valor, LocalDate dataVencimento, String numeroCartao, int totalParcelas) {
		super(valor, dataVencimento);	
		this.numeroCartao = numeroCartao;
		this.totalParcelas = totalParcelas;
	}
	
	
	public String getNumeroCartao() {
		return numeroCartao;
	}

	public int getTotalParcelas() {
		return totalParcelas;
	}


	@Override
	public void realizarPagamento() {
		System.out.println("Número do cartão: " + numeroCartao);
		System.out.println("Data de vencimento: " + getDataVencimento());
		System.out.println("Valor original: " + getValor());
		System.out.println("Valor da multa + juros: " + calcularMultaEAtraso());
		System.out.println("Em quantas parcelas deseja pagar? (1 até 12) " + totalParcelas);
		double valorParcelas = getValor() / totalParcelas;
		System.out.println("O valor das parcelas é: " + valorParcelas);
	}
	
}
