package services;

public class ServicoDeSalario {
	
	
	// declarando uma dependência e instanciado de maneira INADEQUADA
	// Componentes devem ser instanciados
	private ServicoDeImposto servicoImposto = new ServicoDeImposto();	
	private ServicoDePrevidencia servicoPrevidencia = new ServicoDePrevidencia();	
	private ServicoDeSindicato servicoSindicato = new ServicoDeSindicato();	
	
	public double salarioLiquido (double salarioBruto) {
		
		//total de 36,5% de descoto = SalarioBruto * 0,635
		double salarioLiquido = salarioBruto - servicoImposto.imposto(salarioBruto) - servicoPrevidencia.previdencia(salarioBruto) - servicoSindicato.contribuicaoSindical(salarioBruto);
			
		return salarioLiquido ;		
	}

}
