package br.com.caelum.contas.main;

import java.io.BufferedWriter;

class TestaSaida {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter (osw);
		
		bw.write("caelum");
		
		bw.close();
	}
}
