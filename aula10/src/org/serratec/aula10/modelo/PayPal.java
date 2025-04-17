package org.serratec.aula10.modelo;

import java.time.LocalDate;

public class PayPal extends Pagamento implements Pagavel {
	private String email;

	public PayPal(double valor, LocalDate dataVencimento, String email) {
		super(valor, dataVencimento);
		this.email = email;
	}

	@Override
	public void realizarPagamento() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void informarOrigemPagamento(TipoOrigem origem) {
		System.out.println("O pagamento via PayPal de R$ " + getValor() + " foi feito a partir de " + origem);
	}
	
	
	

}
