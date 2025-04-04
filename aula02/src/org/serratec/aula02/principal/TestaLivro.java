package org.serratec.aula02.principal;

import org.serratec.aula02.modelos.Livro;

public class TestaLivro {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.nome = "O pequeno príncipe";
		livro.autor = "Alexandre Dumas";
		livro.editora = "Abril";
		
		System.out.println(livro);
		
		
		

	}

	
	
}
