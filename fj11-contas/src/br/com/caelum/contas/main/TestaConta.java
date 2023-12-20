package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

public class TestaConta {
	
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.setTitular("Hugo");
		c1.setNumero(123);
		c1.setAgencia("45678-9");
		c1.setSaldo(50.0);
		c1.setDataDeAbertura("04/06/2015");
		
		System.out.println("Informações da conta:\n" + c1.getInformacoes());
		
		c1.deposita(100.0);
		System.out.println("Saldo atual: R$" + c1.getSaldo());
		System.out.println("Rendimento mensal: R$" + c1.calculaRendimento());
		
		c1.saca(30.0);
		System.out.println("Saldo após saque: R$" + c1.getSaldo());
	}
}