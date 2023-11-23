package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaBase;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {
	public static void main(String[] args) {
		ContaBase[] contas = new ContaBase[10];
		
		for (int i = 0; i < contas.length; i++) {
		    contas[i] = new ContaCorrente();
		    contas[i].deposita(i * 100.0);
		}
		
		double somaDosSaldos = 0.0;
		
		for (ContaBase conta : contas) {
			System.out.println("Saldo da conta: " + conta.getSaldo());
			somaDosSaldos += conta.getSaldo();
		}
		
		double mediaDosSaldos = somaDosSaldos / contas.length;
		System.out.println("Média dos saldos: " + mediaDosSaldos);
	}
}
