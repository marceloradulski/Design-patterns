
public class ICPP extends TemplateImpostoCondicional {
			
	public ICPP() {
		super();
	}

	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}

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
