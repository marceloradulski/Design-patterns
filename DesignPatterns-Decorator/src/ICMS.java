
public class ICMS extends Imposto {
		
	public ICMS() {
		super();
	}

	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double CalcularImposto(Orcamento orcamento) {
		return orcamento.getValor()*0.12 +super.calculoDoOutroImposto(orcamento);	
	}

}
