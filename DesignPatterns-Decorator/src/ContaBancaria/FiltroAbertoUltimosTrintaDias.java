package ContaBancaria;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Stream;

public class FiltroAbertoUltimosTrintaDias extends FiltroConta {

	public FiltroAbertoUltimosTrintaDias() {
		super();
	}

	public FiltroAbertoUltimosTrintaDias(FiltroConta proximoFiltro) {
		super(proximoFiltro);
	}

	@Override
	public Stream<Conta> filtroEspecifico(Set<Conta> listaContas) {
		return listaContas.stream().filter(conta -> conta.getDataAbertura().isAfter(LocalDate.now().minusMonths(1)));
	}
	
}
