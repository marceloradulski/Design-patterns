package ExecicioInvestimento;

public class Investimento{
	public void realizarInvestimento(Conta conta, TipoInvestimento qualquerInvestimento) {
		double lucro = qualquerInvestimento.calcularInvestimento(conta);
		conta.depositar(lucro*0.75);
		
	}
}
