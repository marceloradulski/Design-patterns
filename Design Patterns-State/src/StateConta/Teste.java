package StateConta;

public class Teste {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.depositar(100.00);
		conta.sacar(100.00);
		conta.depositar(100);
		System.out.println(conta.saldo);
	}

}
