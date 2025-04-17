package org.serratec.aula10.principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.serratec.aula10.modelo.CartaoCredito;
import org.serratec.aula10.modelo.Pagamento;
import org.serratec.aula10.modelo.Pagavel;
import org.serratec.aula10.modelo.PayPal;
import org.serratec.aula10.modelo.Pix;
import org.serratec.aula10.modelo.TipoOrigem;

public class Principal {
	public static void main(String[] args) {
		Pagamento pix = new Pix(1000, LocalDate.parse("2025-04-10"), "2144556677");
		pix.realizarPagamento();
		
		System.out.println("\n ========== \n");
		
		Pagamento cartao = new CartaoCredito(1000, LocalDate.parse("2025-04-10"), "123456789", 10);
		cartao.realizarPagamento();
		
		System.out.println("\n ========== \n");
		
		Pagamento paypal = new PayPal(1000, LocalDate.parse("2025-04-10"), "jacqueline@gmail.com");
		cartao.realizarPagamento();
		
		List<Pagavel> origemPagamento = new ArrayList<>();
		origemPagamento.add((Pix) pix);
		origemPagamento.add((PayPal) paypal);
		
		for (int i = 0; i < origemPagamento.size(); i++) {
			origemPagamento.get(i).informarOrigemPagamento(TipoOrigem.CONTA_CORRENTE);
		}
		
	}

}
