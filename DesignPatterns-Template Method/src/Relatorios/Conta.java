package Relatorios;

public class Conta {
	private String nomeBanco;
	private String nrTelefone;
	private String endereco;
	private String email;
	private String titular;
	private double saldo;
	private String agencia;
	private String numero;
	public Conta(String nomeBanco, String nrTelefone, String endereco, String email, String titular, double saldo,
			String agencia, String numero) {
		this.nomeBanco = nomeBanco;
		this.nrTelefone = nrTelefone;
		this.endereco = endereco;
		this.email = email;
		this.titular = titular;
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
	}
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public String getNrTelefone() {
		return nrTelefone;
	}
	public void setNrTelefone(String nrTelefone) {
		this.nrTelefone = nrTelefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
