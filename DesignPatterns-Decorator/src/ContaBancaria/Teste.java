package ContaBancaria;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Teste {
	public static void main(String[] args) {
		
		Set<Conta> listacontas = new LinkedHashSet<>();
				
		Conta con1 = new Conta("Marcelo");
		con1.deposita(500.00);
		con1.setDataAbertura(LocalDate.now().minusMonths(2));		
		
		Conta con2 = new Conta("Marcelo");
		con2.deposita(40.00);
		con2.setDataAbertura(LocalDate.now().minusMonths(3));
		
		Conta con3 = new Conta("Marcelo");
		con3.deposita(600000.00);
		con3.setDataAbertura(LocalDate.now().minusMonths(4));
		
		Conta con4 = new Conta("Marcelo");
		con4.deposita(250.00);
		con4.setDataAbertura(LocalDate.now());
		
		listacontas.add(con1);
		listacontas.add(con2);
		listacontas.add(con3);
		listacontas.add(con4);
		
		for (Conta conta : listacontas) {
			System.out.println(conta);
		}	
		
		System.out.println("----Filtrando Contas Suspeitas-----");
		
		Set<Conta> contasSuspeitas = new LinkedHashSet<>();	
		FiltroConta filtroConta = new FiltroMaiorQuinhetosMil(new FiltroMenorCem(new FiltroAbertoUltimosTrintaDias()));
		contasSuspeitas = filtroConta.filtrar(listacontas);
				
		for (Conta conta : contasSuspeitas) {
			System.out.println(conta);
		}	
	}
	
}
