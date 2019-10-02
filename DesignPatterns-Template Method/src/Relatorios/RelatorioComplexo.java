package Relatorios;

import java.time.Instant;

public class RelatorioComplexo extends TemplateRelatorio {

	@Override
	protected void ImprimeCabecalho(Conta conta) {
		System.out.println("---Cabecalho---");
		System.out.println("NomeBanco:"+conta.getNomeBanco());
		System.out.println("Endereço:"+conta.getEndereco());
		System.out.println("Telefone:"+conta.getNrTelefone());
	}

	@Override
	protected void ImprimeCorpo(Conta conta) {
		System.out.println("---Corpo---");
		System.out.println("Titular:"+conta.getTitular());
		System.out.println("Agencia:"+conta.getAgencia());
		System.out.println("Conta:"+conta.getNumero());
		System.out.println("Saldo:"+conta.getSaldo());
	}

	@Override
	protected void ImprimeRodape(Conta conta) {
		System.out.println("---Rodape---");
		System.out.println("Email:"+conta.getEmail());
		System.out.println(Instant.now());
	}


}
