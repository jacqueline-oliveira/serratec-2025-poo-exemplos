package org.serratec.aula02.principal;

import org.serratec.aula02.modelos.Livro;

public class TestaLivro {

	public static void main(String[] args) {
		Livro livro = new Livro("O pequeno príncipe", "Alexandre Dumas", "Abril");
		System.out.println(livro);
		
	    System.out.println("\nO meu livro preferido é: " + livro.getNome());
	    System.out.println("Número da edição " + livro.getNumEdicao());
	    livro.setNumEdicao(200);
	    System.out.println("Número da edição " + livro.getNumEdicao());
		
	}

	
	
}
