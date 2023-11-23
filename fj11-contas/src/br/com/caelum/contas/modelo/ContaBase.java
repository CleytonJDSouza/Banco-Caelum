package br.com.caelum.contas.modelo;

public abstract class ContaBase implements ContaInterface {
	
	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;
	
	public ContaBase(String titular, String agencia, int numero, double saldo) {
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Titular: " + titular + "\nNúmero: " + numero + "\nAgência: " + agencia + "\nSaldo: R$" + saldo + "\nTipo: " + getTipo();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		ContaBase outraConta = (ContaBase) obj;
		return numero == outraConta.numero && agencia.equals(outraConta.agencia);
	}
	
	@Override
	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public void deposita(double valor) {
		saldo += valor;
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		saldo -= valor;
	}
	
	@Override
	public void atualiza(double taxaSelic) {
		
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia (String agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/*@Override
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		if (saldo >= valor) {
			saldo -= valor;
			destino.deposita(valor);
		} else {
			throw new SaldoInsuficienteException("Transferencia não realizada. Saldo insuficiente.");
		}
	}*/
}
