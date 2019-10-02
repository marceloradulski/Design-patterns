package Relatorios;

public abstract class TemplateRelatorio {
	protected abstract void ImprimeCabecalho(Conta conta);
	protected abstract void ImprimeCorpo(Conta conta);
	protected abstract void ImprimeRodape(Conta conta);
	
	public void imprime(Conta conta){
		ImprimeCabecalho(conta);
		ImprimeCorpo(conta);
		ImprimeRodape(conta);
	}
}
