package br.com.caelum.contas.modelo;

import java.text.DecimalFormat;

public class Conta {
	
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
		return "Titular: " + titular + "\nNúmero: " + numero + "\nAgência: " + agencia +
				"\nSaldo: R$" + df.format(saldo) + "\nData da Abertura: " + dataDeAbertura.getFormatada();
	}

	
	String recuperaDadosParaImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: R$" + this.saldo;
        dados += "\nData de abertura: " + this.dataDeAbertura.getFormatada();
        return dados;
    }
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Conta outraConta = (Conta) obj;
		return numero == outraConta.numero &&
				Double.compare(outraConta.saldo, saldo) == 0 &&
				titular.equals(outraConta.titular) &&
				agencia.equals(outraConta.agencia) &&
				dataDeAbertura.equals(outraConta.dataDeAbertura);
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
	
	public String getDataDeAbertura() {
		return dataDeAbertura.getFormatada();
	}
	
	public void setDataDeAbertura(Data dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}
}