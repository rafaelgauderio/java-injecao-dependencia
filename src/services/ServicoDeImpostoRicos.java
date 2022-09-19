package services;

public class ServicoDeImpostoRicos extends ServicoDeImposto {

	@Override
	public double imposto(double valor) {
		return 0.30 * valor; 
	}
}
