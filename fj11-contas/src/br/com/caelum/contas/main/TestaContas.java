package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaBase;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaInterface;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.contas.modelo.ManipuladorDeContas;
import br.com.caelum.contas.modelo.ManipuladorDeSeguroDeVida;
import br.com.caelum.contas.modelo.SeguroDeVida;
import br.com.caelum.contas.modelo.ManipuladorDeTributaveis;
import br.com.caelum.contas.modelo.SaldoInsuficienteException;

public class TestaContas {

	public static void main(String[] args) {
	    ContaBase contaCorrente = new ContaCorrente("João", "12345", 6789, 1000.0);
	    ContaBase contaPoupanca = new ContaPoupanca("Maria", "54321", 9876, 500.0);

        System.out.println("Conta Corrente: " + contaCorrente.toString());
        System.out.println("Conta Poupança: " + contaPoupanca.toString());

        boolean caixaDeTransferencia = true;
        if (caixaDeTransferencia) {
            try {
                contaCorrente.transfere(200.0, contaPoupanca);
                System.out.println("Transferência realizada com sucesso.");
            } catch (SaldoInsuficienteException e) {
                System.out.println("Erro ao transferir: " + e.getMessage());
            }
        }
    }
}


