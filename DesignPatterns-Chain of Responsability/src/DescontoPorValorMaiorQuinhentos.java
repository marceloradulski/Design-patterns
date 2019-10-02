
public class DescontoPorValorMaiorQuinhentos implements Desconto {
	private Desconto proximoDesconto;
	@Override
	public double descontar(Orcamento orcamento) {
		if (orcamento.getValor()>= 500.00) {
			return orcamento.getValor()*0.1;
		}
		return proximoDesconto.descontar(orcamento);
	}

	@Override
	public void proximoDesconto(Desconto proximoDesconto) {
		this.proximoDesconto=proximoDesconto;
	}

}
