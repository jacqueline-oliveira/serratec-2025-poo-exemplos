package org.serrate.aula07.classes_abstratas.principal;

import org.serrate.aula07.classes_abstratas.modelos.Assistente;
import org.serrate.aula07.classes_abstratas.modelos.Diretor;
import org.serrate.aula07.classes_abstratas.modelos.Funcionario;
import org.serrate.aula07.classes_abstratas.modelos.Gerente;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario assistente = new Assistente("123", "Iara", 2000, "Manhã");
		((Assistente) assistente).setAdicional(300);
		
		Funcionario gerente = new Gerente("456", "Julya", 10000, "Noite");
		
		Funcionario diretor = new Diretor("789", "Carlos", 20000, "Integral");
		
		assistente.aumentarSalario();
		gerente.aumentarSalario();
		diretor.aumentarSalario();
	}

}
