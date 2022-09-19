package services;

public class ServicoDeSalario {
	
	
	// declarando uma dependência e instanciado de maneira INADEQUADA
	// Componentes devem ser instanciados
	private ServicoDeImposto servicoImposto;	
	private ServicoDePrevidencia servicoPrevidencia;	
	private ServicoDeSindicato servicoSindicato;	
	
	
	
	public ServicoDeSalario(ServicoDeImposto servicoImposto, ServicoDePrevidencia servicoPrevidencia, ServicoDeSindicato servicoSindicato) {
		super();
		this.servicoImposto = servicoImposto;
		this.servicoPrevidencia = servicoPrevidencia;
		this.servicoSindicato = servicoSindicato;
		
	}

	public double salarioLiquido (double salarioBruto) {
		
		//total de 36,5% de descoto = SalarioBruto * 0,635
		double salarioLiquido = salarioBruto - servicoImposto.imposto(salarioBruto) - servicoPrevidencia.previdencia(salarioBruto) - servicoSindicato.contribuicaoSindical(salarioBruto);
			
		return salarioLiquido ;		
	}

}
