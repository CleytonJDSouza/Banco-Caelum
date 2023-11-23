package br.com.caelum.contas.main;

import java.io.FileNotFoundException;

public class TestaException2 {
	public static void main(String[] args) {
		try {
			new java.io.FileInputStream("arquivo.txt")
		} catch (FileNotFoundException e) {
			//Todo auto-generated catch block
			e.printStackTrace();
		}
	}
}
