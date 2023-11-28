package br.com.caelum.contas.main;

import java.util.HashMap;
import java.util.Map;

import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaMapa {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        c1.deposita(10000);
        ContaCorrente c2 = new ContaCorrente();
        c2.deposita(3000);

        Map<String, ContaCorrente> mapaDeContas = new HashMap<>();

        mapaDeContas.put("diretor", c1);
        mapaDeContas.put("gerente", c2);

        ContaCorrente contaDoDiretor = mapaDeContas.get("diretor");
        System.out.println(contaDoDiretor.getSaldo());
    }
}

