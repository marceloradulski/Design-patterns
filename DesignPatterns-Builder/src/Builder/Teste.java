package Builder;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BuilderNotaFiscal nf = new BuilderNotaFiscal();
		 NotaFiscal nota = nf.paraEmpresa("TOTVS")
		 .paraCNPJ("89545474557/0001")
		 .paraDataAtual()
		 .comObservacao("Observacao nf")
		 .comItem(new ItemNota("item 1", 40.00))
		 .comItem(new ItemNota("Item 2", 60.00))
		 .gravarNota();		 
		 
		 System.out.println(nota.getValorBruto());
		 System.out.println(nota.getImpostos());
		 
		 nota.getItens().forEach(l->System.out.println(l));
	}

}
/*Sempre que tivermos um objeto complexo de ser criado, que possui diversos atributos, ou que possui uma lógica 
de criação complicada, podemos esconder tudo isso em um Builder.
Além de centralizar o código de criação e facilitar a manutenção, ainda facilitamos a vida das classes 
que precisam criar essa classe complexa, afinal a interface do Builder tende a ser mais clara e fácil de ser usada.*/