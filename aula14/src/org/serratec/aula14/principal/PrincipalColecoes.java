package org.serratec.aula14.principal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import org.serratec.aula14.modelos.Pessoa;

public class PrincipalColecoes {
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Marlos", 45));
		pessoas.add(new Pessoa("Julya", 20));
		pessoas.add(new Pessoa("Mateus", 23));
		pessoas.add(new Pessoa("Leticia", 25));
		pessoas.add(new Pessoa("Mateus", 18));
		System.out.println("\nImprimindo em ordem alfabética:\n");
		pessoas.sort(Comparator.comparing(Pessoa::getNome));
		pessoas.forEach(System.out::println);
		System.out.println("\nImprimindo em ordem de idade:\n");
		pessoas.sort(Comparator.comparing(Pessoa::getIdade));
		pessoas.forEach(System.out::println);
		
		pessoas.forEach(System.out::println);
		System.out.println(pessoas.get(0));
		
		System.out.println("\nImprimindo só a galera que começa com M\n");
		pessoas.stream().filter(p -> p.getNome().startsWith("M")).forEach(System.out::println);
		
		System.out.println("\nImprimindo só a galera acima de 25 anos M\n");
		pessoas.stream().filter(p -> p.getIdade() >= 25).forEach(System.out::println);
		
		System.out.println("\nImprimindo todo mundo novamente\n");
		pessoas.forEach(System.out::println);
		
		System.out.println("\nImprimindo novas pessoas com novo sobrenome\n");
		List<Pessoa> novasPessoas = pessoas.stream()
				.filter(p -> p.getNome().contains("Marlos"))
				.peek(p -> p.setNome(p.getNome() + " Oliveira"))
				.toList();
		novasPessoas.forEach(System.out::println);
				
		IntSummaryStatistics estatisticas = pessoas.stream()
				.collect(Collectors.summarizingInt(Pessoa::getIdade));
		
		System.out.println("Total das idades: " + estatisticas.getSum());
		System.out.println("Média das idades: " + estatisticas.getAverage());
		System.out.println("Menor idade: " + estatisticas.getMin());
		System.out.println("Maior idade: " + estatisticas.getMax());		
	}

}
