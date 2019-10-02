
public abstract class TemplateImpostoCondicional implements Imposto {

	@Override
	public double CalcularImposto(Orcamento orcamento) {
		if (deveUtilizarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}
			
	}
	
	protected abstract boolean deveUtilizarMaximaTaxacao(Orcamento orcamento);
	protected abstract double maximaTaxacao(Orcamento orcamento);
	protected abstract double minimaTaxacao(Orcamento orcamento);

}
