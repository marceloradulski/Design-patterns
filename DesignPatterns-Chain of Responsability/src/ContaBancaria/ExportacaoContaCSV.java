package ContaBancaria;

public class ExportacaoContaCSV implements InterfaceExportacaoConta {
	private InterfaceExportacaoConta outraExportacao;
	@Override
	public String retornaExportacao(Conta conta, RequisicaoExpotacao requisicao) {
		if (requisicao.getFormato() == Formato.CSV) {
			return "titular:"+conta.getTitular()+";valor:"+conta.getValor();
		}
		return outraExportacao.retornaExportacao(conta, requisicao);
	}

	@Override
	public void setProximo(InterfaceExportacaoConta outraExportacao) {
		this.outraExportacao = outraExportacao;

	}

}
