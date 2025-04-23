package org.serratec.interfaces.modelos;

public class Financeiro implements GeradorRelatorio{
	private String despesa;
	private double valor;
	
	public Financeiro(String conta, double valor) {
		this.despesa = conta;
		this.valor = valor;
	}

	@Override
	public void gerar() {
		System.out.println("Relatório financeiro - despesa: " + despesa + 
				" | valor: R$ " + valor);	
	}
	
}
