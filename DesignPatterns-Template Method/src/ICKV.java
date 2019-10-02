
public class ICKV extends TemplateImpostoCondicional {

	@Override
	protected boolean deveUtilizarMaximaTaxacao(Orcamento orcamento) {
		return ( (orcamento.getValor()>500) && (orcamento.getItens().size()>2) );
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.10;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.06;
	}

}
