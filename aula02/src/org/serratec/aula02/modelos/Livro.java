package org.serratec.aula02.modelos;

public class Livro {
	public String nome;
	public String autor;
	public String editora;
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nAutor: " + autor + "\nEditora: " + editora;
	}

}
