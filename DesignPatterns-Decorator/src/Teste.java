
public class Teste {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(100.00);		
		Imposto iss = new ISS();		
		Imposto icms = new ICMS();
		System.out.println("ISS: "+iss.CalcularImposto(orcamento)); 
		System.out.println("ICMS: "+icms.CalcularImposto(orcamento));
		
		Imposto issComposto = new ISS(new ICMS());
		System.out.println("ISS+ICMS: "+issComposto.CalcularImposto(orcamento));
		
		Imposto muitalto = new ImpostoMuitoAlto(new ICMS(new ISS()));
		System.out.println("Imposto Muito Alto: "+muitalto.CalcularImposto(orcamento));
		
		
		orcamento.adicionaItem(new Item("CPU",400.00));
		orcamento.adicionaItem(new Item("MEM",100.00));
		orcamento.adicionaItem(new Item("HDD",100.00));
		ICKV ickv = new ICKV();
		System.out.println("ICKV: "+ickv.CalcularImposto(orcamento));
		ICPP icpp = new ICPP();
		System.out.println("ICPP: "+icpp.CalcularImposto(orcamento));
		
		ICKV ickvcomp = new ICKV(new ICPP());
		System.out.println("ICKV+ICPP: "+ickvcomp.CalcularImposto(orcamento));
		
		
		
	}

}
/*Sempre que percebemos que temos comportamentos que podem ser compostos por comportamentos de outras classes 
envolvidas em uma mesma hierarquia, como foi o caso dos impostos, que podem ser composto por outros impostos. 
O Decorator introduz a flexibilidade na composição desses comportamentos, bastando escolher no momento da 
instanciação, quais instancias serão utilizadas para realizar o trabalho.*/