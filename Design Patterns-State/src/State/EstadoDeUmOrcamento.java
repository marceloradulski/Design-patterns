package State;

public interface EstadoDeUmOrcamento {
	public void descontoExtra(Orcamento orcamento);
	public void aprovado(Orcamento orcamento);
	public void reprovado(Orcamento orcamento);
	public void finalizado(Orcamento orcamento);
		
}
