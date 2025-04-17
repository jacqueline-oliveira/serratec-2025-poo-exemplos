package org.serratec.aula10.modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Pagamento {
	public static final double PERCENTUAL_MULTA = 2;
	public static final double JUROS_POR_DIA = 0.15;
	
	private double valor;
	private LocalDate dataVencimento;
	
	public Pagamento(double valor, LocalDate dataVencimento) {
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}

	public double getValor() {
		return valor;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}
	
	public long calcularDiasEmAtraso() {
		LocalDate hoje = LocalDate.now();
		if (hoje.isAfter(dataVencimento)) {
			return ChronoUnit.DAYS.between(dataVencimento, hoje);
		}
		
		return 0;
	}

	public final double calcularMultaEAtraso() {
		double valorMulta = valor / 100 * PERCENTUAL_MULTA;
		long diasAtraso = calcularDiasEmAtraso();
		System.out.println("Dias em atraso: " + diasAtraso);
		double jurosAtraso = diasAtraso * JUROS_POR_DIA; 
		return valorMulta + jurosAtraso;
	}
	
	public abstract void realizarPagamento();
}
