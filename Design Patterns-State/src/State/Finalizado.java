package State;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void descontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamento Finalizado não pode receber desconto");

	}

	@Override
	public void aprovado(Orcamento orcamento) {
		throw new RuntimeException("Orçamento Finalizado não pode ser aprovado");

	}

	@Override
	public void reprovado(Orcamento orcamento) {
		throw new RuntimeException("Orçamento Finalizado não pode ser reprovado");

	}

	@Override
	public void finalizado(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está finalizado");

	}

}
