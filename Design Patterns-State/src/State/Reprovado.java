package State;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void descontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamento reprovado não pode receber desconto");
	}

	@Override
	public void aprovado(Orcamento orcamento) {
		throw new RuntimeException("Orçamento reprovado não pode ser aprovado");
	}

	@Override
	public void reprovado(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está reprovado");

	}

	@Override
	public void finalizado(Orcamento orcamento) {
		orcamento.estado = new Finalizado();

	}

}
