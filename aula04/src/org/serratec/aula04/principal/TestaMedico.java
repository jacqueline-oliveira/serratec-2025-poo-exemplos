package org.serratec.aula04.principal;

import org.serratec.aula04.modelos.Medico;

public class TestaMedico {
	public static void main(String[] args) {
		Medico medico1 = new Medico("Dr. Bernardo Ennes", "CRM-12345", 15000.00, 250.00);
        Medico medico2 = new Medico("Dra. Julya Werneck", "CRM-54321", 18000.00, 300.00);
        Medico medico3 = new Medico("Dra. Karen Lessa", "CRM-78901", 20000.00, 350.00);
        Medico medico4 = new Medico("Dr. Nikola Wintter", "CRM-10987", 16500.00, 280.00);
        
   
        
        medico4.realizarConsulta(true);
        medico4.realizarConsulta(false);
        medico1.realizarConsulta(true);
        
        System.out.println("Total valores a pagar para o plano: " + Medico.getValorPlanoSaude());
        System.out.println(medico4);
        System.out.println(medico1);
        
	}

}
