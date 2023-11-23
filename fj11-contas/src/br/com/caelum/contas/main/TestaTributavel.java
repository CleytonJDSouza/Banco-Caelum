package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Tributavel;

public class TestaTributavel {
	
	public static void main(String[] args) {
		String nomeTitular = "João";
		int numeroConta = 12345;
		String agencia = "6789";
		double saldoInicial = 1000.0;
		
		ContaCorrente cc = new ContaCorrente(nomeTitular, agencia, numeroConta, saldoInicial);
		cc.deposita(100);
		System.out.println(cc.getValorImposto());
		
		//Testando polimorfismo;
		Tributavel t = cc;
		System.out.println(t.getValorImposto());
	}
}
