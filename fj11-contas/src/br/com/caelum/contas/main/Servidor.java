package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.TrataCliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Servidor {
	
	private List<PrintStream> clientes;
	
	public Servidor() {
		this.clientes = new ArrayList<>();
	}
	
	public void executa() throws IOException {
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 aberta!");
		
		while(true) {
			Socket cliente = servidor.accept();
			System.out.println("Nova conexão com o cliente " + cliente.getInetAddress().getHostAddress());
			
			PrintStream ps = new PrintStream(cliente.getOutputStream());
			this.clientes.add(ps);
			
			Thread threadDoCliente = new Thread(new TrataCliente(cliente, this));
			threadDoCliente.start();
		}
	}
	
	public void distribuiMensagem(String mensagem) {
		for (PrintStream cliente : clientes) {
			cliente.println(mensagem);
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Servidor().executa();
	}
}