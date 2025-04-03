package aula0;

import java.util.Scanner;

public class SegundoProjeto {
	public static void main(String[] args) {
		//Declara o tipo, o nome, depois a atribuição de valor
		
		int idade = 30;  //tipo inteiro
		double altura = 1.80; //tipo real
		char sexo = 'F'; //tipo caracter
		String nome = "Maurício";  //tipo cadeia;
		boolean ehAtleta = true; //tipo lógico (true ou false)
		
		Scanner leitura = new Scanner(System.in); //preciso criar essa estrutura para fazer leitura do teclado
		
		System.out.println("Digite seu nome: "); //similar ao escreva
		nome = leitura.nextLine();   //similar ao leia, mas com nextLine pra especificar que é texto
		System.out.println("Digite sua altura: ");
		altura = leitura.nextDouble(); //leia, mas especificando que é um valor real (double)
	    System.out.println("Nome: " + nome + " - altura: " + altura + "m. ");
	    
	    if (altura < 1.5) {  //condicional (similar ao se, senao se e senao)
	    	System.out.println("Estatura baixa.");
	    } else if (altura < 1.9) {
	    	System.out.println("Estatura média.");
	    } else {
	    	System.out.println("Estatura de gigante!");
	    }	
	}
}
