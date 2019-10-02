package Relatorios;

public class Teste {
	public static void main(String[] args) {
		
		Conta conta = new Conta("Itau","47-3028-9391","Rua albino kolbach, 51","marcelo.r@gmail.com","Marcelo Nunes",500.00,"9599","00587-9");
		
		RelatorioSimples simples = new RelatorioSimples();
		simples.imprime(conta);
		
		
		System.out.println("***********************");
		
		RelatorioComplexo complexo = new RelatorioComplexo();
		complexo.imprime(conta);
		
	}
}
