package org.serratec.aula02.modelos;

public class CalculoInss {
	public String nome;
	public double salario;
	
	
	public void exibeSalario() {
		calculaDesconto();
		System.out.println("Salário com desconto é: " + salario);
		
	}
	
	private void calculaDesconto() {
		if (salario <= 1518) {
			return;
		}
		
		if (salario > 1518 && salario <= 2793.88) {
			salario -= salario * 9 / 100;
		} else if (salario <= 4190.83) {
			salario -= salario * 12 / 100;
		} else if (salario <= 8157.41) {
			salario -= salario * 14 / 100;
		} else if (salario > 8157.41) {
			salario -= 1142.03;
		}	
	}

}
