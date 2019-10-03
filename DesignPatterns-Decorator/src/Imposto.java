
public abstract class Imposto {
	protected final Imposto outroImposto;
		
	public Imposto() {
		this.outroImposto = null;
	}

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public abstract double CalcularImposto(Orcamento orcamento);
	
	protected double calculoDoOutroImposto(Orcamento orcamento) {
		if (this.outroImposto == null) {
			return 0;
		} else {
			return outroImposto.CalcularImposto(orcamento);
		}
			
	}
}
