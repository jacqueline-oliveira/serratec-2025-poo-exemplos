package org.serratec.interfaces.principal;

import java.util.List;

import org.serratec.interfaces.modelos.Financeiro;
import org.serratec.interfaces.modelos.GeradorRelatorio;
import org.serratec.interfaces.modelos.RH;

public class Principal {

	public static void main(String[] args) {
		List<GeradorRelatorio> relatorios = List.of(new Financeiro("Luz", 380),
				new Financeiro("Água", 500), new Financeiro("Aluguel", 1800),
				new RH("Desenvolvimento", 6), new RH("Marketing", 2));
		
		for (GeradorRelatorio r : relatorios) {
			r.gerar();
		}
	}
}

