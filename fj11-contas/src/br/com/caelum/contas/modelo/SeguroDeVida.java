package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel {
	
	//Atributos
	private double valor;
	private String titular;
	private int numeroApolice;
	
	//Metodos
	public SeguroDeVida(double valor, String titular, int numeroApolice) {
		this.valor = valor;
		this.titular = titular;
		this.numeroApolice = numeroApolice;
	}
	
	@Override
	public double getValorImposto() {
		double taxaFixa = 42.00;
		double imposto = 0.02 * valor + taxaFixa;
		return imposto;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public int getNumeroApolice() {
		return this.numeroApolice;
	}
	
	public double getValor() {
		return this.valor;
	}
}
