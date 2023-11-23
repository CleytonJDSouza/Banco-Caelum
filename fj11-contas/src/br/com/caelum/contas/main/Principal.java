package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;

public class Principal {
	public static void main(String[] args) {
		
		Conta conta = new Conta(null, 0);
		conta.deposita(100.0);
		
		System.out.println(conta.getSaldo());
	}
}
