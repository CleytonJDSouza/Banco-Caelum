package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.List;

public class TestePerfomaceDePercorrerLista {
	
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		
		List<Integer> teste = new ArrayList<>();
		
		for (int i = 0; i < 30000; i++) {
			teste.add(i);
		}
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < teste.size(); i++) {
			teste.get(i);
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		
		System.out.println("Tempo gasto para percorrer a lista: " + tempo + " segundos");
	}
}
