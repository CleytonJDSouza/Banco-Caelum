package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Data;

class TestaDataAberturaDaConta {
	
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.setTitular("Hugo");
		c1.setAgencia("12-x");
		c1.setNumero(557890);
		c1.deposita(50);
		c1.deposita(100);
		
		c1.setDataDeAbertura(new Data(31, 1, 2021));
		System.out.println(c1.recuperaDadosParaImpressao());
	}

}
