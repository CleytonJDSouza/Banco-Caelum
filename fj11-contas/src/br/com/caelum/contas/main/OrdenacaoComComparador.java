package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ComparadorPorTamanho;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoComComparador {
    
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();
        lista.add("Sérgio");
        lista.add("Paulo");
        lista.add("Guilherme");
        
        ComparadorPorTamanho comparador = new ComparadorPorTamanho();
        
        Collections.sort(lista, comparador);
        
        System.out.println(lista);
    }
}
