package br.com.caelum.contas.modelo;

import java.io.PrintStream;
import java.util.Scanner;
import java.io.OutputStream;

public class Enviador implements Runnable {
	
	private PrintStream servidor;
	private Scanner teclado;
	
	public Enviador(OutputStream servidor) {
		this.servidor = new PrintStream(servidor);
		this.teclado = new Scanner(System.in);
	}
	
	@Override
	public void run() {
		while (teclado.hasNextLine()) {
			servidor.println(teclado.nextLine());
		}
	}
}
