package org.serratec.aula14.modelos;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private int idade;
	
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}
	
	


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " - idade: " + idade;
	}


	@Override
	public int compareTo(Pessoa o) {
		// se quisermos usar uma ordenação por padrão. 
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		// para definir se um item já existe na lista ou não, se vai comparar por 1 ou mais atrubutos
		return super.equals(obj);
	}
}
