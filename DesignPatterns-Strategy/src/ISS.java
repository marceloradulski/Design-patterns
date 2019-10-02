
public class ISS implements Imposto {

	@Override
	public double CalcularImposto(Orcamento orcamento) {
		return orcamento.getValor()*0.05;	
		
	}

}
