
public class Teste {

	public static void main(String[] args) {
		Orcamento orc1 = new Orcamento(600.00);
		orc1.adicionaItem(new Item("CPU",400.00));
		orc1.adicionaItem(new Item("MEM",100.00));
		orc1.adicionaItem(new Item("HDD",100.00));
		CalculadorDeImpostos calcimp = new CalculadorDeImpostos();
		calcimp.calcularImposto(orc1, new ICPP());
		calcimp.calcularImposto(orc1, new ICKV());
		
	}

}
/*Quando temos diferentes algoritmos que possuem estruturas parecidas, o Template Method é uma boa solução. 
Com ele, conseguimos definir, em um nível mais macro, a estrutura do algoritmo e deixar "buracos", que 
serão implementados de maneira diferente por cada uma das implementações específicas.
Dessa forma, reutilizamos ao invés de repetirmos código, e facilitamos possíveis evoluções, tanto do 
algoritmo em sua estrutura macro, quanto dos detalhes do algoritmo, já que cada classe tem sua responsabilidade bem separada.*/