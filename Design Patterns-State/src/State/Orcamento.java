package State;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	protected double valor;
	private List<Item> itens;
	protected EstadoDeUmOrcamento estado;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<>();
		this.estado = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}	
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(this.itens);
	}
	
	public void adicionaItem(Item item){
		this.itens.add(item);
	}
	
	public void descontoExtra() {
		estado.descontoExtra(this);
	}
	
	public void aprovar() {
		estado.aprovado(this);
	}
	
	public void reprovar() {
		estado.reprovado(this);
	}
	
	public void finalizar() {
		estado.finalizado(this);
	}
}
