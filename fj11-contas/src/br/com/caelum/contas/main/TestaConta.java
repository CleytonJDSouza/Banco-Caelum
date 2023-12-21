package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Data;

public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta("Hugo", 557890, "12-x", 80, new Data());
        c1.deposita(100);
        
        Data dataAberturaC1 = new Data();
        dataAberturaC1.preencheData(1, 7, 2009);
        c1.setDataDeAbertura(dataAberturaC1);

        System.out.println(c1.recuperaDadosParaImpressao());
    }
}
