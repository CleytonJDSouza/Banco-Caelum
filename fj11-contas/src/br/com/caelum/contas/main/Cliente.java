package br.com.caelum.contas.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	
	public static void main(String[] args) throws IOException {
		Thread threadReceber = new Thread(new Recebedor(System.in));
		Thread threadEnviar = new Thread(new Enviador(System.out));
		
		threadReceber.start();
		threadEnviar.start();
	}
}