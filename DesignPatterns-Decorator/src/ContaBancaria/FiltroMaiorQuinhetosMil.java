package ContaBancaria;

import java.util.Set;
import java.util.stream.Stream;

public class FiltroMaiorQuinhetosMil extends FiltroConta{

	public FiltroMaiorQuinhetosMil() {
		super();
	}

	public FiltroMaiorQuinhetosMil(FiltroConta proximoFiltro) {
		super(proximoFiltro);
	}

	@Override
	public Stream<Conta> filtroEspecifico(Set<Conta> listaContas) {		
		return listaContas.stream().filter(conta -> conta.getValor()>500000.00);
	}
	
}
