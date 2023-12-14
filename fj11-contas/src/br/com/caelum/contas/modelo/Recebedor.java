package br.com.caelum.contas.modelo;

import java.io.InputStream;
import java.util.Scanner;

public class Recebedor implements Runnable {
	
	private Scanner servidor;
	
	public Recebedor(InputStream servidor) {
		this.servidor = new Scanner(servidor);
	}
	
	@Override
	public void run() {
		while (servidor.hasNextLine()) {
			System.out.println(servidor.nextLine());
		}
	}
}
