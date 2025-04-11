package org.serratec.aula06.principal;

import org.serratec.aula06.modelos.Assistente;
import org.serratec.aula06.modelos.Funcionario;
import org.serratec.aula06.modelos.Gerente;

public class TestaFuncionarios {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("João", 3000);
		Funcionario gerente = new Gerente("Marlos", 6000, "Desenvolvimento");
		Funcionario assistente = new Assistente("Maria", 2500, 500);
		
		System.out.println(funcionario);
		System.out.println(gerente);
		System.out.println(assistente);
		
		funcionario.aumentaSalario();
		funcionario.exibirSalarioAtualizado();
		gerente.aumentaSalario();
		gerente.exibirSalarioAtualizado();
		assistente.aumentaSalario();
		assistente.exibirSalarioAtualizado();
		
		
		
	}
	

}
