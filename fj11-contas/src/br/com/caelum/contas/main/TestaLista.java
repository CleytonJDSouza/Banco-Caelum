package br.com.caelum.contas.main;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaLista {
	public static void main(String[] args) {
		List<ContaCorrente> contas = new LinkedList<>();
		
		Random random = new Random();
		
		for (int i = 0; i < 5; i++) {
			String titular = "Titular " + i;
			String agencia = "Agencia " + i;
			int numero = 1000 + i;
			double saldo = random.nextDouble() * 1000;
			
			ContaCorrente novaConta = new ContaCorrente(titular, agencia, numero, saldo);
			contas.add(novaConta);
		}
		
		for (ContaCorrente conta : contas) {
			System.out.println(conta);
		}
	}
}
