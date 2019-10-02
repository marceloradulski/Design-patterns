
public class CalculadorDeImpostos {
	
	public void calcularImposto(Orcamento orcamento, Imposto impostoQualquer) {
		double valor = impostoQualquer.CalcularImposto(orcamento);
		System.out.println("Valor imposto: "+valor);
	}
	
}
