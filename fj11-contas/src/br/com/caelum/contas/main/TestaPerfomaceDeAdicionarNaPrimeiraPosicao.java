package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.List;

public class TestaPerfomaceDeAdicionarNaPrimeiraPosicao {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		
		List<Integer> teste = new ArrayList<>();
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < 30000; i++) {
			teste.add(0, i);
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		
		System.out.println("Tempo gasto para adicionar na primeira posição: " + tempo + " segundos");
	}
}
