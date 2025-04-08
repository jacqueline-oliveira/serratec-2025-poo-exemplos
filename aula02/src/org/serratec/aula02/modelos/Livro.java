package org.serratec.aula02.modelos;

public class Livro {
	//atributo nome privado, não pode ser visto ou alterado por outra classe, por exemplo TestaLivro
	private String nome;
	private String autor;
	private String editora;
	private int numEdicao;
	
	
	public int getNumEdicao() {
		if (numEdicao == 0) {
			numEdicao = 1;
		}
		return numEdicao;
	}

	public void setNumEdicao(int numEdicao) {
		if (this.numEdicao + 1 != numEdicao) {
			System.err.println("O número de edição informado não é válido");
		} else {
			this.numEdicao = numEdicao;
		}
		
	}

	//Método getter é um método acessor que vai me permitir ver o conteúdo do atributo nome
	public String getNome() {
		return nome;
	}
	
	//Construtor já cria o objeto alocando espaço na memória e obrigando que os dados essenciais como
	//nome, autor e editora sejam preenchidos
	public Livro(String nome, String autor, String editora) {
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
	}
	
	//princípio de polimorfismo que vai me permitir imprimirs de forma personalizada os dados da 
	//classe livro quando eu usar System.out.println
	@Override
	public String toString() {
		return "Nome: " + nome + "\nAutor: " + autor + "\nEditora: " + editora;
	}

}
