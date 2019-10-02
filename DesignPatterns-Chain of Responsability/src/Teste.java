
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

/*O padrão Chain of Responsibility cai como uma luva quando temos uma lista de comandos a serem executados de acordo com algum cenário em específico, 
  e sabemos também qual o próximo cenário que deve ser validado, caso o anterior não satisfaça a condição. 
  Nesses casos, o Chain of Responsibility nos possibilita a separação de responsabilidades em classes pequenas e enxutas, e ainda provê uma maneira 
  flexível e desacoplada de juntar esses comportamentos novamente.*/