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
/*A principal situa��o que faz emergir o Design Pattern State � a necessidade de 
implementa��o de uma m�quina de estados. Geralmente, o controle das poss�veis 
transi��es s�o v�rios e complexos, fazendo com que a implementa��o n�o seja simples. 
O State auxilia a manter o controle dos estados simples e organizados atrav�s da 
cria��o de classes que representem cada estado e saiba controlar as transi��es.*/