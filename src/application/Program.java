package application;

import services.ServicoDeSalario;

public class Program {

	public static void main(String[] args) {
		
		ServicoDeSalario salario = new ServicoDeSalario();		
		
		System.out.println(String.format("R$ %.2f",salario.salarioLiquido(6000)));
		System.out.println(String.format("R$ %.2f",salario.salarioLiquido(7000)));
		System.out.println("Salário Líquido é " + String.format("R$ %.2f",salario.salarioLiquido(10000)));

	}

}
