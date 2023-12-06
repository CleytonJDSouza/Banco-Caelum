package br.com.caelum.contas.modelo;

import br.com.caelum.contas.modelo.ContaBase;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import 


public class RepositorioDeContas {
	
	public void salva(List<ContaBase> contas) {
		try (PrintStream ps = new PrintStream(new FileOutputStream("contas.txt"))) {
			for (ContaBase conta : contas) {
				String linha = conta.getTipo() + "," + conta.getNumero() + "," + conta.getAgencia() + "," + conta.getTitular() + "," + conta.getSaldo();
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Erro ao salve contas", e);
		}
	}
}
