package State;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void descontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amento Finalizado n�o pode receber desconto");

	}

	@Override
	public void aprovado(Orcamento orcamento) {
		throw new RuntimeException("Or�amento Finalizado n�o pode ser aprovado");

	}

	@Override
	public void reprovado(Orcamento orcamento) {
		throw new RuntimeException("Or�amento Finalizado n�o pode ser reprovado");

	}

	@Override
	public void finalizado(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� est� finalizado");

	}

}
