package ContaBancaria;

import java.time.LocalDate;

public class Conta {
	private final String titular;
	private double valor;	
	private LocalDate dataAbertura;
	
	public Conta(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void deposita(double valor) {
		this.valor += valor;
	}
	
	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	@Override
	public String toString() {
		return "[Titular="+this.titular+";Valor="+this.valor+";DataAbertura="+this.dataAbertura+"]"; 
	}
	
}
