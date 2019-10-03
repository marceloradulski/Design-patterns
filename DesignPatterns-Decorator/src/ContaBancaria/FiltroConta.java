package ContaBancaria;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class FiltroConta {
	protected final FiltroConta proximoFiltro;

	protected FiltroConta() {
		this.proximoFiltro = null;
	}
	
	protected FiltroConta(FiltroConta proximoFiltro) {
		this.proximoFiltro = proximoFiltro;
	}
	
	public abstract Stream<Conta> filtroEspecifico(Set<Conta> listaContas);
		
	public Set<Conta> filtrarProxima(Set<Conta> listaContas){
		if (this.proximoFiltro == null){
			return new LinkedHashSet<Conta>();
		} else {
			return proximoFiltro.filtrar(listaContas) ;
		}
	}
	
	public Set<Conta> filtrar(Set<Conta> listaContas) {		 
		Stream<Conta> stream = filtroEspecifico(listaContas);		  
		Set<Conta> resultado = new LinkedHashSet<>();
		resultado = stream.collect(Collectors.toSet());
		resultado.addAll(filtrarProxima(listaContas));
		return resultado;
	}
	
}
