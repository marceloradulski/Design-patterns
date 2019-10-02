
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
/*Quando temos diferentes algoritmos que possuem estruturas parecidas, o Template Method � uma boa solu��o. 
Com ele, conseguimos definir, em um n�vel mais macro, a estrutura do algoritmo e deixar "buracos", que 
ser�o implementados de maneira diferente por cada uma das implementa��es espec�ficas.
Dessa forma, reutilizamos ao inv�s de repetirmos c�digo, e facilitamos poss�veis evolu��es, tanto do 
algoritmo em sua estrutura macro, quanto dos detalhes do algoritmo, j� que cada classe tem sua responsabilidade bem separada.*/