package StateConta;

public class Negativa implements SituacaoConta {

	@Override
	public void saque(Conta conta,double valor) {
		throw new RuntimeException("Não é possivel sacar. Conta negativa");	
	}

	@Override
	public void deposito(Conta conta, double valor) {
		conta.saldo += valor*0.95;
		if (conta.saldo>=0) {
			conta.situacao = new Positiva();
		}
	}

}
