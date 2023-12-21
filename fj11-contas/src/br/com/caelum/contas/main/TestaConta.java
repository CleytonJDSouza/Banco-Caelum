package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Data;

public class TestaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta("Hugo", 123, "45678-9", 50.0, new Data());
		Conta c2 = new Conta("Hugo", 123, "45678-9", 50.0, new Data());

		System.out.println("As contas são iguais? " + c1.equals(c2));

		c1.deposita(100.0);
		System.out.println("Saldo atual: R$" + c1.getSaldo());
	}
}