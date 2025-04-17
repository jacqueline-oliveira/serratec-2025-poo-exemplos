package org.serratec.aula10.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pix extends Pagamento implements Pagavel {
	private String chave;

	public Pix(double valor, LocalDate dataVencimento, String chave) {
		super(valor, dataVencimento);
		this.chave = chave;
	}

	@Override
	public void realizarPagamento() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Pagamento com pix para a chave: " + chave);
		System.out.println("Data de vencimento: " + getDataVencimento().format(df));
		System.out.println("Valor original: " + getValor());
		System.out.println("Valor da multa + juros: " + calcularMultaEAtraso());
	}

	@Override
	public void informarOrigemPagamento(TipoOrigem origem) {
		System.out.println("O pix de R$ " + getValor() + " foi feito a partir de " + origem);
		
	}
	
}
