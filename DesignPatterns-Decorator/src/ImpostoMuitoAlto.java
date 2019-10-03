
public class ImpostoMuitoAlto extends Imposto {
	
	public ImpostoMuitoAlto() {
		super();
	}

	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double CalcularImposto(Orcamento orcamento) {
		return orcamento.getValor()*0.2+super.calculoDoOutroImposto(orcamento);
	}

}
