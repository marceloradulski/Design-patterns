package ContaBancaria;

enum Formato{
	XML,
	CSV,
	PORCENTO,
	IMAGEM
}

public class RequisicaoExpotacao {
	private final Formato formato;

	public RequisicaoExpotacao(Formato formato) {
		this.formato = formato;
	}

	public Formato getFormato() {
		return formato;
	}
	
}
