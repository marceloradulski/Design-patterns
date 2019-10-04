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
/*Sempre que tivermos um objeto complexo de ser criado, que possui diversos atributos, ou que possui uma l�gica 
de cria��o complicada, podemos esconder tudo isso em um Builder.
Al�m de centralizar o c�digo de cria��o e facilitar a manuten��o, ainda facilitamos a vida das classes 
que precisam criar essa classe complexa, afinal a interface do Builder tende a ser mais clara e f�cil de ser usada.*/