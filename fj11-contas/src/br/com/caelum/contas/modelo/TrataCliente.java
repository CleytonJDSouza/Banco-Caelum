package br.com.caelum.contas.modelo;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

import br.com.caelum.contas.main.Servidor;

public class TrataCliente implements Runnable {
	
	private Socket cliente;
	private Servidor servidor;
	
	public TrataCliente(Socket cliente, Servidor servidor) {
		this.cliente = cliente;
		this.servidor = servidor;
	}
	
	@Override
	public void run() {
		try {
			Scanner s = new Scanner(this.cliente.getInputStream());
			while (s.hasNextLine()) {
				String mensagem = s.nextLine();
				servidor.distribuiMensagem(mensagem);
			}
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}