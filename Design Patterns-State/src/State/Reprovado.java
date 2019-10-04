package State;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void descontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amento reprovado n�o pode receber desconto");
	}

	@Override
	public void aprovado(Orcamento orcamento) {
		throw new RuntimeException("Or�amento reprovado n�o pode ser aprovado");
	}

	@Override
	public void reprovado(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� est� reprovado");

	}

	@Override
	public void finalizado(Orcamento orcamento) {
		orcamento.estado = new Finalizado();

	}

}
