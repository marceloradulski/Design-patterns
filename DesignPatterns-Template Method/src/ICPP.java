
public class ICPP extends TemplateImpostoCondicional {

	@Override
	protected boolean deveUtilizarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()>500.00;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.07;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.05;
	}

}
