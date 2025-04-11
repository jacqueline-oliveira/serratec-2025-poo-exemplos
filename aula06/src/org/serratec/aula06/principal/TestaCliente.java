package org.serratec.aula06.principal;

import java.time.LocalDate;

import org.serratec.aula06.modelos.Cliente;
import org.serratec.aula06.modelos.ClientePessoaFisica;
import org.serratec.aula06.modelos.ClientePessoaJuridica;

public class TestaCliente {
	public static void main(String[] args) {
		Cliente pf = new ClientePessoaFisica("Jacqueline", "8877-6666", "345.667.999-00");
		Cliente pj = new ClientePessoaJuridica("AutoCar", "5566-7788", "21547987/0001-99", "Carros Ltda SA");
				
		((ClientePessoaFisica) pf).setDataNascimento(LocalDate.parse("2000-10-15"));  
		((ClientePessoaFisica) pf).setRg("12459678-9");
		((ClientePessoaJuridica) pj).setInscricaoEstadual("123455");
		
		Cliente[] clientes = {pf, pj};  
		
		for (int i = 0; i < clientes.length; i++) {
			System.out.println(clientes[i]);
		}
		
	}
	
}
