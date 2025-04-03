package aula0;

import java.util.Scanner;

public class TerceiroProjeto {
	public static void main(String[] args) {
		//crio o leitor, que vai capturar valores do teclado
		Scanner leitura = new Scanner(System.in);
		//variável acumuladora que vai somar todas as notas;
		double soma = 0;
		//vetor de notas, com 3 posições.
		double notas[] = new double[3]; 
		
		
		// Loop para receber as notas. Similar ao para do Portugol
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = leitura.nextDouble();
            soma += notas[i];
        }
        
        // Calcula a média
        double media = soma / notas.length;
        
        System.out.println("\nNotas inseridas:");
        
        //crio uma nova variável para controlar o loop While
        int contador = 0;
        
        while (contador < 3) {
            System.out.println("Nota " + (contador + 1) + ": " + notas[contador]);
            contador++;
        }
        
        System.out.println("Média: " + media);
        
        //fecho o scanner pois não haverá mais leitura
        leitura.close();
    }
}
