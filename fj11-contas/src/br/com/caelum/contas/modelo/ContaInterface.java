package br.com.caelum.contas.modelo;

public interface ContaInterface {
	
	public double getSaldo();
	public void deposita(double valor);
	public void saca(double valor) throws SaldoInsuficienteException;
	public void atualiza(double taxaSalic);
	String getTipo();
	
	void transfere(double valor, ContaBase destino) throws SaldoInsuficienteException;
}
