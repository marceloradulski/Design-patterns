package ContaBancaria;

public interface InterfaceExportacaoConta {
	String retornaExportacao(Conta conta,RequisicaoExpotacao requisicao);
	void setProximo(InterfaceExportacaoConta outraExportacao);
}
