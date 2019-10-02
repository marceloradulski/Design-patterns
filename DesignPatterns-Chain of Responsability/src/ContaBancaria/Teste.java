package ContaBancaria;

import java.math.BigDecimal;

public class Teste {
	public static void main(String[] args) {
		Conta con1 = new Conta("Marcelo");
		con1.deposita(500.59);
		
		ExportacaoConta exp = new ExportacaoConta();
		exp.exportarConta(con1, new RequisicaoExpotacao(Formato.IMAGEM));		
	}
}
