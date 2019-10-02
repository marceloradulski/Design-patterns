package ExecicioInvestimento;

public class Teste {

	public static void main(String[] args) {
		Conta conta = new Conta(100);
		
		Investimento investimento = new Investimento();
		investimento.realizarInvestimento(conta, new Moderado());		
		System.out.println("Saldo final conta: "+conta.getValor());

	}

}
