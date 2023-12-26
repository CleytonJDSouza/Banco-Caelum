package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Data;

public class TestaConta {
    public static void main(String[] args) {
       Conta minhaConta = new Conta("João", 123, "456", 1000.0, new Data());
       
       System.out.println("Titular da conta: " + minhaConta.getTitular());
       System.out.println("Saldo atual: R$" + minhaConta.getSaldo());
       
       minhaConta.setSaldo(1500.0);
       System.out.println("Novo saldo: R$" + minhaConta.getSaldo());
    }
}
