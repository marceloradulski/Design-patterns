package ExecicioInvestimento;

public class Consevador implements TipoInvestimento {

	@Override
	public double calcularInvestimento(Conta conta) {
		return conta.getValor()*0.008;
	}

}
