
public class CalculadorDeDesconto {
	public double calcularDesconto(Orcamento orcamento) {
		DescontoPorValorMaiorQuinhentos desc1 = new DescontoPorValorMaiorQuinhentos();
		DescontoQtdItensMaior2 desc2 = new DescontoQtdItensMaior2();
		FimDesconto descfim = new FimDesconto();
		
		desc1.proximoDesconto(desc2);
		desc2.proximoDesconto(descfim);
		
		return desc1.descontar(orcamento);
	}
}
