package br.com.caelum.contas.modelo;

import java.text.DecimalFormat;

public class Conta {
	
	// ATRIBUTOS
	
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private String dataDeAbertura;
	
	// MÉTODOS
	
	public void saca(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
		} else {
			System.out.println("Valor do depósito deve ser maior que zero.");
		}
	}
	
	public void deposita(double valor) {
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
		return "Titular: " + titular + "\nNúmero: " + numero + "\nAgência: " + agencia + "\nSaldo: R$" + df.format(saldo) + "\n Data da Abertura: " + dataDeAbertura;
	}
	
	// GETTERS E SETTERS
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getDataDeAbetura() {
		return dataDeAbertura;
	}
	
	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}
}