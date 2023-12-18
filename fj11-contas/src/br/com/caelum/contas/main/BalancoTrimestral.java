package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.GastoMensal;

public class BalancoTrimestral {
	
	public static void main(String[] args) {
		GastoMensal janeiro = new GastoMensal(15000);
		GastoMensal fevereiro = new GastoMensal(23000);
		GastoMensal marco = new GastoMensal(17000);
		
		int gastosTrimestre = janeiro.getValor() + fevereiro.getValor() + marco.getValor();
		System.out.println("Gasto do trimestre: R$" + gastosTrimestre);
		
		int mediaPorMes = gastosTrimestre / 3;
		System.out.println("Média mensal: R$" + mediaPorMes);
	}

}
