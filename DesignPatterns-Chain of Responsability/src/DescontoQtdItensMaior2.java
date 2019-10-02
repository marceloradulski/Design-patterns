
public class DescontoQtdItensMaior2 implements Desconto{
	private Desconto proximoDesconto;
	@Override
	public double descontar(Orcamento orcamento) {
		if (orcamento.getItens().size()> 2) {
			return orcamento.getValor()*0.07;
		}
		return proximoDesconto.descontar(orcamento);
	}

	@Override
	public void proximoDesconto(Desconto proximoDesconto) {
		this.proximoDesconto=proximoDesconto;		
	}

}
