package br.com.caelum.contas.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

class TestaEntrada {
	
	public static void main(String[] args) throws IOException{
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader (isr);
		String s = br.readLine();
		
		while (s !=null) {
			System.out.println(s);
			s = br.readLine();
		}
	}
}