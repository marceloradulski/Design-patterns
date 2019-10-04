package State;

public class Teste {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(100.00);
		orcamento.descontoExtra();
		//orcamento.descontoExtra();
		System.out.println(orcamento.valor);
		orcamento.aprovar();
		orcamento.descontoExtra();
		System.out.println(orcamento.valor);
		orcamento.finalizar();
		
		System.out.println(orcamento.estado);
	}

}
/*A principal situação que faz emergir o Design Pattern State é a necessidade de 
implementação de uma máquina de estados. Geralmente, o controle das possíveis 
transições são vários e complexos, fazendo com que a implementação não seja simples. 
O State auxilia a manter o controle dos estados simples e organizados através da 
criação de classes que representem cada estado e saiba controlar as transições.*/