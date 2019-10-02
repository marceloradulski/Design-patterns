package ExecicioInvestimento;

import java.util.Random;

public class Moderado implements TipoInvestimento {
	private Random random;
	
	 public Moderado() {
         this.random = new Random();
       }
	
	@Override
	public double calcularInvestimento(Conta conta) {
		if(random.nextInt(2) == 0) return conta.getValor() * 0.025;
        else return conta.getValor() * 0.007;			
		
	}

}
