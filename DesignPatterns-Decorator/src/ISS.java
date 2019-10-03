
public class ISS extends Imposto {
	
	public ISS() {
		super();
	}

	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double CalcularImposto(Orcamento orcamento) {
		return orcamento.getValor()*0.05 + super.calculoDoOutroImposto(orcamento);
		
	}
	
	

}
