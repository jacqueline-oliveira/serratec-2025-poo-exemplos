package org.serratec.aula10.interfaces.principal;

import java.util.ArrayList;
import java.util.List;

import org.serratec.aula10.interfaces.modelo.Aluno;
import org.serratec.aula10.interfaces.modelo.Coordenador;
import org.serratec.aula10.interfaces.modelo.Professor;
import org.serratec.aula10.interfaces.modelo.Situacao;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Adriana", 9);
		Professor professor1 = new Professor("Jacque", "POO");
		Coordenador coordendor1 = new Coordenador("Livia", "Manhã");
		
		List<Situacao> situacaoPessoas = new ArrayList<>();
		situacaoPessoas.add(aluno1);
		situacaoPessoas.add(professor1);
		
		for (Situacao p : situacaoPessoas) {
			System.out.println(p.verificarSituacao());
		}
		
		coordendor1.exibirDados();

	}

}
