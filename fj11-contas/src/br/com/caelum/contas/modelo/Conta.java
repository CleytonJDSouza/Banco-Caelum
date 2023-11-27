package br.com.caelum.contas.modelo;


/*import com.sun.tools.javac.util.List;*/
import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements Comparable<Conta> {
	
	private double saldo;
	private String titular;
	private int numero;
	private String agencia;
	private static List<Conta> contas = new ArrayList<>();
	
	public Conta(String titular, String agencia, int numero, double saldo) {
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		contas.add(this);
	}
	
	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor de depósito inválido: " + valor);
		}
		this.saldo += valor;
	}
	
	public void saca(double valor) throws SaldoInsuficienteException {
		if (valor > saldo) {
			throw new SaldoInsuficienteException("Saldo insuficiente para sacar " + valor);
		}
		saldo -= valor;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			System.out.println("Transferência não realizada. Saldo insuficiente.");
			return false;
		}
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Conta)) {
			return false;
		}
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
	}
	
	public static Conta buscarContaPorDestino(String destino) {
		if (contas.isEmpty()) {
			return null;
		}
		
		for (Conta conta : contas) {
			if (conta.getAgencia().equals(destino)) {
				return conta;
			}
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		return "Titular: " + this.titular.toUpperCase() + "\nNúmero: " + this.numero + "\nAgência: " + this.agencia + "\nSaldo: R$" + this.saldo + "n\nTipo: " + this.getTipo();
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public static List<Conta> getContas() {
		return contas;
	}
	
	public abstract String getTipo();
	
	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgência: " + this.agencia;
		dados += "\nSaldo: R$" + this.saldo;
		dados += "\nTipo: " + this.getTipo();
		return dados;
	}
	
	public abstract void atualiza(double taxaSelic);
	public abstract double getValorImposto();

	public int compareTo(Conta outraConta) {
		// TODO Auto-generated method stub
		return 0;
	}
}
