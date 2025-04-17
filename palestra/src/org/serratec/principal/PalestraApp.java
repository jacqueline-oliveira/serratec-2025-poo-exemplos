package org.serratec.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.serratec.modelos.Palestrante;
import org.serratec.modelos.Participante;
import org.serratec.modelos.Pessoa;

public class PalestraApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();
		int opcao;
		
		do {
			String menu = """
					
					==== Palestras Serratec ===
					1. Incluir palestrantes e participantes
					2. Listar todos
					3. Sair
					
					Informe a opção desejada: 
					
					""";
			System.out.println(menu);
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
			case 1 -> {
				System.out.println("\n1. Cadastrar palestrante");
				System.out.println("2. Cadastrar participante");
				System.out.println("Escolha a opção desejada: ");
				int tipo = sc.nextInt();
				sc.nextLine();
				if (tipo != 1 && tipo != 2) {
					System.out.println("\nOpção inválida.");
					continue;
				}
				System.out.println("Informe o nome: ");
				String nome = sc.nextLine();
				System.out.println("Informe o CPF: ");
				String cpf = sc.nextLine();
				if (tipo == 1) {
					System.out.println("Informe o tema da palestra: ");
					String palestra = sc.nextLine();
					pessoas.add(new Palestrante(nome, cpf, palestra));
					System.out.println("\nPalestrante " + nome + " cadastrado com sucesso!" );
				} else if (tipo == 2) {
					System.out.println("Informe o e-mail: ");
					String email = sc.nextLine();
					pessoas.add(new Participante(nome, cpf, email));
					System.out.println("\nParticipante " + nome + " cadastrado com sucesso!" );
				}		
			}
			case 2 ->  pessoas.forEach(p -> p.exibirDados());
			case 3 -> System.out.println("Encerrando a aplicação");
			default -> System.out.println("Opção inválida. Verifique.");
			}	
			
		} while (opcao != 3);
		sc.close();
	}

}
