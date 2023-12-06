package br.com.caelum.contas.modelo;

import br.com.caelum.contas.modelo.RepositorioDeContas;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ManipuladorDeContas {
	
	private ContaBase conta;
	private List<ContaBase> contas = new ArrayList<>();
	
	public void criarContaCorrente(Evento evento) {
		String titular = evento.getTitular();
		String agencia = evento.getAgencia();
		int numero = evento.getNumero();
		
		ContaCorrente novaContaCorrente = new ContaCorrente(titular, agencia, numero, 0.0);
		
		contas.add(novaContaCorrente);
	}
	
	public void criarContaPoupanca(Evento evento) {
		String titular = evento.getTitular();
		String agencia = evento.getAgencia();
		int numero = evento.getNumero();
		
		ContaPoupanca novaContaPoupanca = new ContaPoupanca(titular, agencia, numero, 0.0);
		
		contas.add(novaContaPoupanca);
	}
	
	public ContaBase buacarContaPorDestino(String destino) {
		for (ContaBase conta : contas) {
			if (conta.getAgencia().equals(destino)) {
				return conta;
			}
		}
		
		return null;
	}
	
	public void transfere(Evento evento) {
        String destino = evento.getSelecionadoNoCombo("destino");
        ContaBase contaDestino = buacarContaPorDestino(destino);
        
        if (contaDestino != null) {
        	double valor = evento.getDouble("valorTransferencia");
        	this.conta.transfere(valor, contaDestino);
        } else {
        	System.out.println("Conta de destino não encontrada");
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
		List<Conta> contas = new ArrayList<>(Conta.getContas());
		Collections.sort(contas);
	}
	
	public void setConta(ContaBase conta) {
		this.conta = conta;
	}
	
	public void salvaDados(Evento evento) {
		List<ContaBase> listaContas = evento.getLista("listaContas");
		contas.addAll(listaContas);
		
		RepositorioDeContas repositorio = new RepositorioDeContas();
		repositorio.salva(contas);
	}
}


