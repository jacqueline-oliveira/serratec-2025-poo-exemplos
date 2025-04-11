package org.serratec.aula05.principal;

import org.serratec.aula05.modelos.Consumidor;
import org.serratec.aula05.modelos.Endereco;

public class TestaConsumidor {
	public static void main(String[] args) {
		
		Endereco endereco = new Endereco("Rua B", 12, "apto 3", "Centro", "12345-999", "Petrópolis", "Rj");
		Consumidor consumidor = new Consumidor("João", "789.456.123-88", endereco);
		
		
		Consumidor consumidor2 = new Consumidor("Jacqueline", "123.456.789-88", 
				new Endereco("Rua A", 123, "apto 5", "Tijuca", "25888-789", "Teresopolis", "RJ"));
		
		System.out.println(consumidor);
		System.out.println(consumidor2);
		System.out.println(endereco);
		System.out.println(consumidor.getEndereco());
		System.out.println(consumidor2.getEndereco());
	}

}
