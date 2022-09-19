package application;

import services.ServicoDeImposto;
import services.ServicoDeImpostoRicos;
import services.ServicoDePrevidencia;
import services.ServicoDeSalario;
import services.ServicoDeSindicato;

public class Program {

	public static void main(String[] args) {
		
		ServicoDeImposto servicoImposto = new ServicoDeImposto();
		ServicoDePrevidencia servicoPrevidencia = new ServicoDePrevidencia();
		ServicoDeSindicato servicoSindicato = new ServicoDeSindicato();
		ServicoDeImposto servicoImpostoRico = new ServicoDeImpostoRicos();
		
		ServicoDeSalario salario = new ServicoDeSalario(servicoImposto,servicoPrevidencia,servicoSindicato);
		ServicoDeSalario salario2 = new ServicoDeSalario(servicoImpostoRico,servicoPrevidencia,servicoSindicato);
		
		System.out.println(String.format("R$ %.2f",salario.salarioLiquido(6000)));
		System.out.println(String.format("R$ %.2f",salario.salarioLiquido(7000)));
		System.out.println(String.format("R$ %.2f",salario.salarioLiquido(8500)));
		System.out.println("Salário Líquido é " + String.format("R$ %.2f",salario.salarioLiquido(10000)));
		
		//rico é um pouco mais tributado
		System.out.println("Salário Líquido de um rico " + String.format("R$ %.2f",salario2.salarioLiquido(10000)));
		
		
		
		

	}

}
