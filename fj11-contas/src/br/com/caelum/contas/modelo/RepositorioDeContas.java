package br.com.caelum.contas.modelo;

import br.com.caelum.contas.modelo.ContaBase;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


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
	
	public List<ContaBase> carregaDados() {
		List<ContaBase> contas = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("contas.txt"))) {
			String linha;
			while ((linha = br.readLine()) != null) {
				String[] valores = linha.split(",");
				String tipo = valores[0];
				int numero = Integer.parseInt(valores[1]);
				String agencia = valores [2];
				String titular = valores [3];
				double saldo = Double.parseDouble(valores[4]);
				
				ContaBase conta;
				if (tipo.equals("Conta Corrente")) {
					conta = new ContaCorrente(titular, agencia, numero, saldo);
				} else if (tipo.equals("Conta Poupança")) {
					conta = new ContaPoupanca(titular, agencia, numero, saldo);
				} else {
					continue;
				}
				
				contas.add(conta);
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Arquivo não encontrado", e);
		} catch (IOException e) {
			throw new RuntimeException("Erro ai ler o arquivo", e);
		}
		return contas;
	}
}
