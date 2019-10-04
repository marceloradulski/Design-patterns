package StateConta;

public class Conta {
	protected double saldo;
	protected SituacaoConta situacao;
	
	public Conta() {
		this.situacao = new Positiva();
	} 
	
	public void depositar(double valor) {
		situacao.deposito(this,valor);
	}
	
	public void sacar(double valor) {
		situacao.saque(this,valor);
	}
}
