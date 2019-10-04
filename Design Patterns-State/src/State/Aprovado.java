package State;

public class Aprovado implements EstadoDeUmOrcamento {
	private boolean decontojaaplicado = false;
	@Override
	public void descontoExtra(Orcamento orcamento) {
		if (this.decontojaaplicado == false){
			orcamento.valor -= orcamento.valor*0.02;
		} else {
			throw new RuntimeException("Or�amento j� aplicado");
		}
	}

	@Override
	public void aprovado(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� est� em estado de aprova��o");
	}

	@Override
	public void reprovado(Orcamento orcamento) {
		throw new RuntimeException("Or�amento aprovado n�o pode ser reprovado");
	}

	@Override
	public void finalizado(Orcamento orcamento) {
		orcamento.estado = new Finalizado();
	}

}
