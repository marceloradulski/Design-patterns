package ContaBancaria;

import java.math.BigDecimal;

public class Conta {
	private final String titular;
	private double valor;	
	
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
	
	
}
