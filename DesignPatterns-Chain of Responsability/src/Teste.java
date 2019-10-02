
public class Teste {

	public static void main(String[] args) {
		
		Orcamento orc1 = new Orcamento(280.59);		
		orc1.adicionaItem(new Item("SSD",280.59));
		System.out.println(new CalculadorDeDesconto().calcularDesconto(orc1));
		
		Orcamento orc2 = new Orcamento(900.80);
		orc2.adicionaItem(new Item("CPU",900.80));
		System.out.println(new CalculadorDeDesconto().calcularDesconto(orc2));
		
		Orcamento orc3 = new Orcamento(410.67);
		orc3.adicionaItem(new Item("SSD",280.59));
		orc3.adicionaItem(new Item("MEM",100.09));
		orc3.adicionaItem(new Item("FON",29.99));
		System.out.println(new CalculadorDeDesconto().calcularDesconto(orc3));
		
	}

}

/*O padr�o Chain of Responsibility cai como uma luva quando temos uma lista de comandos a serem executados de acordo com algum cen�rio em espec�fico, 
  e sabemos tamb�m qual o pr�ximo cen�rio que deve ser validado, caso o anterior n�o satisfa�a a condi��o. 
  Nesses casos, o Chain of Responsibility nos possibilita a separa��o de responsabilidades em classes pequenas e enxutas, e ainda prov� uma maneira 
  flex�vel e desacoplada de juntar esses comportamentos novamente.*/