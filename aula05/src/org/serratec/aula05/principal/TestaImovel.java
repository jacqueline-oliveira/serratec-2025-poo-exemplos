package org.serratec.aula05.principal;

import org.serratec.aula05.modelos.Endereco;
import org.serratec.aula05.modelos.Imovel;
import org.serratec.aula05.modelos.Pessoa;
import org.serratec.aula05.modelos.TipoImovel;

public class TestaImovel {
	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua B", 12, "apto 3", "Centro", "12345-999", "Petrópolis", "Rj");
		Pessoa pessoa = new Pessoa("Jacqueline", "123.456.789-99", "5555-9999");
		Imovel imovel = new Imovel(endereco, TipoImovel.APTO, 58000, pessoa);
		System.out.println(imovel);
		
		Imovel imovel2 = new Imovel(new Endereco("Rua a", 444, "", "Centro", "12345-999", "Petrópolis", "Rj"),
				TipoImovel.CASA, 70000, new Pessoa("Mario", "789.456.123-88", "4444-7777"));
		System.out.println(imovel2);		
	}
	

}
