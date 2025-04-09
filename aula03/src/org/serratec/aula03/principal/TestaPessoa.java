package org.serratec.aula03.principal;

import org.serratec.aula03.modelos.Pessoa;

public class TestaPessoa {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("João Pedro B. Dias", 82, 1.78);
		Pessoa pessoa2 = new Pessoa("José Victor B. Dias", 100, 1.82);
		Pessoa pessoa3 = new Pessoa("Maria Clara F. Costa", 75, 1.65);
		Pessoa pessoa4 = new Pessoa("Carlos Eduardo M. Silva", 90, 1.85);
		
		pessoa1.exibirDados();
		pessoa2.exibirDados();
		System.out.println(pessoa3);
		System.out.println(pessoa4);
		
		Pessoa[] pessoas = {pessoa1, pessoa2, pessoa3, pessoa4};
		
		double somaAltura = 0, somaPeso = 0; 
		int indiceMaiorAltura = 0, indiceMaiorPeso = 0; 
		
		for (int i = 0; i < pessoas.length; i++) {
			somaAltura += pessoas[i].getAltura();
			somaPeso += pessoas[i].getPeso();
			
			if (pessoas[i].getAltura() > pessoas[indiceMaiorAltura].getAltura()) {
				indiceMaiorAltura = i;  
			}
			
			if (pessoas[i].getPeso() > pessoas[indiceMaiorPeso].getPeso()) {
				indiceMaiorPeso = i;  
			}
		}
		
		System.out.println("O nome da pessoa com maior peso é: " + pessoas[indiceMaiorPeso].getNome());
		System.out.println("O nome da pessoa com maior altura é: " + pessoas[indiceMaiorAltura].getNome());
		System.out.println("Média de alturas: " + (somaAltura / pessoas.length));
		System.out.println("Média de pesos: " + (somaPeso / pessoas.length));	
		
		Pessoa pessoa5 = new Pessoa("Carlos Eduardo M. Silva", 90, 1.85);
		
	
		
		System.out.println("Total de pessoas instanciadas = " + Pessoa.getTotalPessoas());
	}

}
