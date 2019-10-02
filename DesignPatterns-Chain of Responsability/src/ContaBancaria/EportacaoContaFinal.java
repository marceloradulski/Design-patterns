package ContaBancaria;

public class EportacaoContaFinal implements InterfaceExportacaoConta {

	@Override
	public String retornaExportacao(Conta conta, RequisicaoExpotacao requisicao) {
		// TODO Auto-generated method stub
		return "Formato não suportado";
	}

	@Override
	public void setProximo(InterfaceExportacaoConta outraExportacao) {
		// TODO Auto-generated method stub

	}

}
