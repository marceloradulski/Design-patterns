package ContaBancaria;

import java.util.Set;
import java.util.stream.Stream;

public class FiltroMenorCem extends FiltroConta{

	public FiltroMenorCem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FiltroMenorCem(FiltroConta proximoFiltro) {
		super(proximoFiltro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Stream<Conta> filtroEspecifico(Set<Conta> listaContas) {
		return listaContas.stream().filter(conta -> conta.getValor()<100.00);
	}
	
}
