package br.com.caelum.contas.main;

import java.util.TreeSet;

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
}
