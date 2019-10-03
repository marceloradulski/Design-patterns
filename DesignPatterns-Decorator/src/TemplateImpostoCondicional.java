
public abstract class TemplateImpostoCondicional extends Imposto {
		
	public TemplateImpostoCondicional() {
		super();
	}

	public TemplateImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double CalcularImposto(Orcamento orcamento) {
		if (deveUtilizarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento)+super.calculoDoOutroImposto(orcamento);
		} else {
			return minimaTaxacao(orcamento)+super.calculoDoOutroImposto(orcamento);
		}
			
	}
	
	protected abstract boolean deveUtilizarMaximaTaxacao(Orcamento orcamento);
	protected abstract double maximaTaxacao(Orcamento orcamento);
	protected abstract double minimaTaxacao(Orcamento orcamento);

}
