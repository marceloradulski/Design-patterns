package State;

public class EmAprovacao implements EstadoDeUmOrcamento {
	private boolean descontojaaplicado = false;
	
	@Override
	public void descontoExtra(Orcamento orcamento) {
		if (this.descontojaaplicado==false) {		
			orcamento.valor -= orcamento.valor*0.05;
			this.descontojaaplicado = true;
		} else {
			throw new RuntimeException("Desconto já aplicado");
		}
	}

	@Override
	public void aprovado(Orcamento orcamento) {
		orcamento.estado = new Aprovado();		
	}

	@Override
	public void reprovado(Orcamento orcamento) {
		orcamento.estado = new Reprovado();
	}

	@Override
	public void finalizado(Orcamento orcamento) {		
		throw new RuntimeException("Orçamento em aprovação não pode ser finalizado");
	}


}
