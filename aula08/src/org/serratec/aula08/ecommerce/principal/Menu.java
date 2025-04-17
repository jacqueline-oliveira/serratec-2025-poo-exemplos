package org.serratec.aula08.ecommerce.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.serratec.aula08.ecommerce.modelos.Alimento;
import org.serratec.aula08.ecommerce.modelos.Eletronico;
import org.serratec.aula08.ecommerce.modelos.Produto;
import org.serratec.aula08.ecommerce.modelos.UnidadeMedida;

public class Menu {
	private Scanner leitura = new Scanner(System.in);
	private List<Produto> produtos = new ArrayList<>();

	public void iniciar() {
		int opcao;

		do {
			String menu = """
					\n ---- Menu SerraCommerce ---- 
					1. Cadastrar produto
					2. Listar produtos
					3. Realizar venda
					4. Aumentar estoque
					5. Sair
					Escolha uma opção: \n
					""";
			System.out.println(menu);
			opcao = leitura.nextInt();
			leitura.nextLine();

			switch (opcao) {
			case 1 -> cadastrarProduto();
			case 2 -> listarProdutos();
			case 3 -> realizarVenda();
			case 4 -> aumentarEstoque();
			case 5 -> System.out.println("Encerrando a aplicação... ");
			default -> System.out.println("Opção inválida!");
			}	
		} while (opcao != 5);
	}

	private void aumentarEstoque() {
		if (verificaListaVazia()) {
			return;
		}
		
		int indice = escolherProduto();

		if (indice == -1) {
			return;
		}

		System.out.println("Quantidade a aumentar no estoque: ");
		int quantidade = leitura.nextInt();
		produtos.get(indice).aumentarEstoque(quantidade);

	}

	private void realizarVenda() {
		if (verificaListaVazia()) {
			return;
		}
		
		int indice = escolherProduto();

		if (indice == -1) {
			return;
		}

		System.out.println("Quantidade a vender: ");
		int quantidade = leitura.nextInt();
		if (produtos.get(indice).vender(quantidade)) {
			System.out.println("Venda realizada com sucesso.");
		} else {
			System.out.println("Estoque insuficiente. Operação não realizada.");
		}
	}

	private int escolherProduto() {
		listarProdutos();
		System.out.println("\nEscolha o número do produto: ");
		int indice = leitura.nextInt() - 1;

		if (indice < 0 || indice > produtos.size()) {
			System.out.println("Produto inválido");
			return -1;
		}
		return indice;
	}

	private void listarProdutos() {
		if (verificaListaVazia()) {
			return;
		}
		
		for (int i = 0; i < produtos.size(); i++) {
			System.out.print((i + 1) + ". ");
			produtos.get(i).exibirInformacoes();
		}

	}

	private boolean verificaListaVazia() {
		if (produtos.isEmpty()) {
			System.out.println("Você ainda não cadastrou nenhum alimento ou eletrônico.");
			return true;
		}
		
		return false;
	}

	private void cadastrarProduto() {
		int tipo;
		do {
			System.out.println("\nTipo do produto: ");
			System.out.println("1. Alimento");
			System.out.println("2. Eletrônico");
			System.out.println("Escolha a opção desejada: ");
			tipo = leitura.nextInt();
			leitura.nextLine();

			if (tipo != 1 && tipo != 2 ) {
				System.out.println("Tipo de produto inválido.");
			}

		} while (tipo != 1 && tipo != 2);


		/* uma das abordagens, voltando ao menu principal
		if (tipo != 1 && tipo != 2 ) {
			System.out.println("Tipo de produto inválido.");
			return;
		} */

		System.out.println("\nNome do produto: ");
		String nome = leitura.nextLine();
		System.out.println("Preço: ");
		double preco = leitura.nextDouble();
		System.out.println("Quantidade em estoque: ");
		int estoque = leitura.nextInt();
		leitura.nextLine();

		if (tipo == 1) {
			System.out.println("Quantidade por item: ");
			int quantidadePorItem = leitura.nextInt();
			leitura.nextLine();
			System.out.println("Unidade de medida (KG, G, L, ML, UN): ");
			String unidade = leitura.nextLine().toUpperCase();
			UnidadeMedida unidadeMedida = UnidadeMedida.valueOf(unidade);
			produtos.add(new Alimento(nome, preco, estoque, quantidadePorItem, unidadeMedida));
		} 


		if (tipo == 2) {
			System.out.println("Marca: ");
			String marca = leitura.nextLine();
			System.out.println("Meses de garantia: ");
			int mesesGarantia = leitura.nextInt();
			leitura.nextLine();
			produtos.add(new Eletronico(nome, preco, estoque, marca, mesesGarantia));
		}

		System.out.println("Produto cadastrado com sucesso. ");
	}

}
