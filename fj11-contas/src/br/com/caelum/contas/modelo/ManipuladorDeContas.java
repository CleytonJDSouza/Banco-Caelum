package br.com.caelum.contas.modelo;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ManipuladorDeContas<T extends Conta> {
	
	private T conta;
	private List<Conta> contas = new ArrayList<>();
	
	public void criaConta(Evento evento, Class<T> tipoConta) {
		String tipo = evento.getSelecionadoNoRadio("tipo");
		String agencia = evento.getAgencia();
		int numero = evento.getNumero();
		String titular = evento.getTitular();
		T novaConta = null;
		
		if(tipo.equals("Conta Corrente") && tipoConta.equals(ContaCorrente.class)) {
			novaConta = criarContaCorrente(titular, agencia, numero);
		} else if (tipo.equals("Conta Poupança") && tipoConta.equals(ContaPoupanca.class)) {
			novaConta = criarContaPoupanca(titular, agencia, numero);
		}
		
		this.conta = novaConta;
		contas.add(novaConta);
	}
	
	private T criarContaCorrente(String titular, String agencia, int numero) {
		return (T) new ContaCorrente(titular, agencia, numero, 0.0);
	}
	
	private T criarContaPoupanca(String titular, String agencia, int numero) {
		return new ContaPoupanca(titular, agencia, numero, 0.0);
	}
	
	public Conta buscarContaPorDestino(String destino) {
		for (Conta conta : contas) {
			if (conta.getAgencia().equals(destino)) {
				return conta;
			}
		}
		return null;
	}
	
    public void transfere(Evento evento) {
        String destino = evento.getSelecionadoNoCombo("destino");
        Conta contaDestino = buscarContaPorDestino(destino);
        
        if (contaDestino != null) {
            double valor = evento.getDouble("valorTransferencia");
            this.conta.transfere(valor, contaDestino);
        } else {
            System.out.println("Conta de destino não encontrada.");
        }
    }
    
    public void saca(double valor) {
        this.conta.saca(valor);
    }
    
    public void deposita(Evento evento) {
        double valorOperacao = evento.getValorOperacao();
        this.conta.deposita(valorOperacao);
    }
    
    public void ordenaLista(Evento evento) {
        List<Conta> contas = evento.getLista("destino");
        Collections.sort(contas);
    }
    
    public void setConta(T conta) {
        this.conta = conta;
    }
}
