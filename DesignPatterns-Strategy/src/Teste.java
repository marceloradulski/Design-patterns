
public class Teste {

	public static void main(String[] args) {
		Orcamento orc1 = new Orcamento(500.00);
		
		CalculadorDeImpostos calcimp = new CalculadorDeImpostos();
		calcimp.calcularImposto(orc1, new ICMS());
		calcimp.calcularImposto(orc1, new ISS());
		
		
	}

}
/*O padr�o Strategy � muito �til quando temos um conjunto de algoritmos similares, e precisamos alternar entre eles em diferentes 
  peda�os da aplica��o. No exemplo do v�deo, temos diferentes maneiras de calcular o imposto, e precisamos alternar entre elas. 
  O Strategy nos oferece uma maneira flex�vel para escrever diversos algoritmos diferentes, e de passar esses algoritmos para classes 
  clientes que precisam deles. Esses clientes desconhecem qual � o algoritmo "real" que est� sendo executado, e apenas mandam o algoritmo rodar. 
  Isso faz com que o c�digo da classe cliente fique bastante desacoplado das implementa��es concretas de algoritmos, possibilitando assim com que 
  esse cliente consiga trabalhar com N diferentes algoritmos sem precisar alterar o seu c�digo.*/