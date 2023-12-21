package br.com.caelum.contas.modelo;

import java.text.DecimalFormat;

public class Conta {
	
	// ATRIBUTOS
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataDeAbertura;
	
	public Conta(String titular, int numero, String agencia, double saldo, Data dataDeAbertura) {
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.dataDeAbertura = dataDeAbertura;
	}
	
	// MÉTODOS
	
	public void saca(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
		} else {
			System.out.println("Valor do depósito deve ser maior que zero.");
		}
	}
	
	public double calculaRendimento() {
		return saldo * 0.10;
	}
	
	public String getInformacoes() {
		DecimalFormat df = new DecimalFormat("#.00");
		return "Titular: " + titular + "\nNúmero: " + numero + "\nAgência: " + agencia +
				"\nSaldo: R$" + df.format(saldo) + "\nData da Abertura: " + dataDeAbertura.getFormatada();
	}
	
	public String recuperaDadosParaImpressao() {
		String dados = "n\titular: " + this.titular;
		dados += "\n" + this.dataDeAbertura.getFormatada();
		return dados;
	}
}