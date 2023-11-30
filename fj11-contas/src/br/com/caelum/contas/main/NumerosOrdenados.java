package br.com.caelum.contas.main;

// USANDO O ARRAYLIST

import java.util.ArrayList;
import java.util.Collections;

public class NumerosOrdenados {
	
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		for (int i = 1; i <= 1000; i++) {
			numeros.add(i);
		}
		
		Collections.sort(numeros, Collections.reverseOrder());
		
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
	}
}

// USANDO O TREESET

/*import java.util.TreeSet;

public class NumerosOrdenados {

    public static void main(String[] args) {
        TreeSet<Integer> numerosDecrescentes = new TreeSet<>((a, b) -> b - a);

        for (int i = 1; i <= 1000; i++) {
            numerosDecrescentes.add(i);
        }

        for (Integer numero : numerosDecrescentes) {
            System.out.println(numero);
        }
    }
}*/

