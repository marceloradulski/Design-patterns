package ContaBancaria;

public class ExportacaoContaXML implements InterfaceExportacaoConta {
	private InterfaceExportacaoConta outraExportacao;
	
	@Override
	public String retornaExportacao(Conta conta, RequisicaoExpotacao requisicao) {
		if (requisicao.getFormato() == Formato.XML) {
			return ""+conta.getTitular()+"</titular><valor>"+conta.getValor()+"</valor>";
		}
		return outraExportacao.retornaExportacao(conta, requisicao);
	}

	@Override
	public void setProximo(InterfaceExportacaoConta outraExportacao) {
		this.outraExportacao = outraExportacao;

	}

}
