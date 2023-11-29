package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaCorrente;

import java.util.HashSet;
import java.util.Set;

public class TestaHashSet {
	
	public static void main(String[] args) {
		Set<ContaCorrente> contas = new HashSet<>();
		
		contas.add(new ContaCorrente("Titular 1", "Agencia 1", 123, 1000.0));
		contas.add(new ContaCorrente("Titular 2", "Agencia 2", 456, 2000.0));
		contas.add(new ContaCorrente("Titular 3", "Agencia 3", 789, 3000.0));
		
		//Tentando add uma conta com o mesmo número e agência
		contas.add(new ContaCorrente("Titular 4", "Agencia 4", 123, 4000.0));
		
		for (ContaCorrente conta : contas) {
			System.out.println(conta);
		}
	}
}
