package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;

public class TesteDaConta {
    public static void main(String[] args) {
    	
        Conta minhaConta = new Conta("Pedro", 1000.0);

        System.out.println("Titular: " + minhaConta.getTitular());
        System.out.println("Saldo: R$ " + minhaConta.getSaldo());
    }
}