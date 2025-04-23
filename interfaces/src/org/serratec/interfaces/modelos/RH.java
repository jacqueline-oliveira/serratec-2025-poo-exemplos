package org.serratec.interfaces.modelos;

public class RH implements GeradorRelatorio {
	private String setor;
	private int totalFuncionarios;
	
	public RH(String setor, int totalFuncionarios) {
		this.setor = setor;
		this.totalFuncionarios = totalFuncionarios;
	}

	@Override
	public void gerar() {
		System.out.println("Relatório RH - setor: " + setor + 
				" | total de colaboradores: " + totalFuncionarios);
		
	}
}
