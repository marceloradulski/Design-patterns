package ContaBancaria;

public class ExportacaoConta {
	public void exportarConta(Conta conta, RequisicaoExpotacao requisicao) {
		ExportacaoContaCSV csv = new ExportacaoContaCSV();
		ExportacaoContaXML xml = new ExportacaoContaXML();
		ExportacaoContaPorcento porcento = new ExportacaoContaPorcento();
		EportacaoContaFinal expfinal = new EportacaoContaFinal();
		
		csv.setProximo(xml);
		xml.setProximo(porcento);
		porcento.setProximo(expfinal);
		
		System.out.println(csv.retornaExportacao(conta, requisicao));
		
	}
}
