package org.serratec.aula02.principal;

import org.serratec.aula02.modelos.CalculoInss;

public class TestaInss {

	public static void main(String[] args) {
		CalculoInss calculo = new CalculoInss();
		calculo.nome = "Marlos";
		calculo.salario = 1517;
		calculo.exibeSalario();
		
		System.out.println(calculo);
		
		CalculoInss calculo2 = new CalculoInss();
		calculo2.nome = "Marlos";
		calculo2.salario = 1517;
		calculo2.exibeSalario();
		
		System.out.println(calculo2);
		
		if (calculo == calculo2) {
			System.out.println("são idênticas");
		} else {
			System.out.println("são diferentes");
		}
		
		calculo = calculo2; //perco a referência do primeiro endereço
		System.out.println("Igualei as duas");
		System.out.println(calculo);
		System.out.println(calculo2);
		
		//Como passam a apontar pro mesmo endereço, agora sim são "idênticas"
		if (calculo == calculo2) {
			System.out.println("são idênticas");
		} else {
			System.out.println("são diferentes");
		}
		
		//Altero na calculo2 e reflete na calculo pois ambas apontam p/ mesmo endereço
		calculo2.nome = "Marlos 2.0";
		System.out.println(calculo.nome);
		System.out.println(calculo2.nome);
		
		//Altero na cálculo e reflete na calculo2 pois ambas apontam p/ mesmo endereço
		calculo.salario = 50000;
		System.out.println(calculo.salario);
		System.out.println(calculo2.salario);

	}

}
