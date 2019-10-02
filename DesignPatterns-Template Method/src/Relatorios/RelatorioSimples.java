package Relatorios;

public class RelatorioSimples extends TemplateRelatorio {

	@Override
	protected void ImprimeCabecalho(Conta conta) {
		System.out.println("---Cabecalho---");
		System.out.println("nomeBanco:"+conta.getNomeBanco());
	}

	@Override
	protected void ImprimeCorpo(Conta conta) {
		System.out.println("---Corpo---");
		System.out.println("Titular:"+conta.getTitular());
		System.out.println("Saldo:"+conta.getSaldo());
	}

	@Override
	protected void ImprimeRodape(Conta conta) {
		System.out.println("---Rodape---");
		System.out.println("Telefone:"+conta.getNrTelefone());
	}

}
