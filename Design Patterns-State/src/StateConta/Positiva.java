package StateConta;

public class Positiva implements SituacaoConta {

	@Override
	public void saque(Conta conta, double valor) {
		conta.saldo -= valor;
		if (conta.saldo<0) {
			conta.situacao = new Negativa();
		}
	}

	@Override
	public void deposito(Conta conta,double valor) {
		conta.saldo += valor*0.98;		
	}

}
