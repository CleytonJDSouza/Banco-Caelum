package br.com.caelum.contas.modelo;

import java.util.List;

public class ProduzMensagens implements Runnable {
	
	private int comeco;
	private int fim;
	private List<String> mensagens;
	
	public ProduzMensagens(int comeco, int fim, List<String> mensagens) {
		this.comeco = comeco;
		this.fim = fim;
		this.mensagens = mensagens;
	}
	
	@Override
	public void run() {
		for (int i = comeco; i < fim; i ++) {
			mensagens.add("Mensagem " + i);
		}
	}

}
