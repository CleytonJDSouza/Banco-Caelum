package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Evento;

public class ManipuladorDeContas {
	
	private Conta conta;
	
	public void criaConta(Evento evento) {
		this.conta = new Conta();
		
		this.conta.setTitular(evento.getTitular());
		this.conta.setNumero(evento.getNumero());
		this.conta.setAgencia(evento.getAgencia());
	}
	
	public void deposita(Evento evento) {
		
		double valor = evento.getValorOperacao();
		
		if (valor > 0) {
			this.conta.deposita(valor);
			System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
		} else {
			System.out.println("Valor do depósito deve ser maior que zero.");
		}
	}
	
	public void saca(Evento evento) {
		
		double valor = evento.getValorOperacao();
		
		if (valor > 0) {
			this.conta.saca(valor);
			System.out.println("Saque de R$" + valor + " realizado com sucesso.");
		} else {
			System.out.println("Valor do saque deve ser maior que zero.");
		}
	}
}
