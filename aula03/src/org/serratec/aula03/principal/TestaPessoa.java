package org.serratec.aula03.principal;

import org.serratec.aula03.modelos.Pessoa;

public class TestaPessoa {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("João Pedro B. Dias", 82, 1.78);
		Pessoa pessoa2 = new Pessoa("José Victor B. Dias", 80, 1.82);
		Pessoa pessoa3 = new Pessoa("Maria Clara F. Costa", 75, 1.65);
		Pessoa pessoa4 = new Pessoa("Carlos Eduardo M. Silva", 90, 1.85);
		
		pessoa1.exibirDados();
		pessoa2.exibirDados();
		System.out.println(pessoa3);
		System.out.println(pessoa4);
		
	}

}
