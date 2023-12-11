package br.com.caelum.contas.main;

import java.math.BigDecimal;

public class TestaBigDecimal {
	
	public static void main (String[] args) {
		BigDecimal numero1 = new BigDecimal("12345678901234567890.12345678901234567890");
		BigDecimal numero2 = new BigDecimal("98765432109876543210.98765432109876543210");
		
		
		BigDecimal soma = numero1.add(numero2);
		BigDecimal subtracao = numero1.subtract(numero2);
		BigDecimal multiplicacao = numero1.multiply(numero2);
		BigDecimal divisao = numero1.divide(numero2, 20, BigDecimal.ROUND_HALF_UP);
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("Divisão: " + divisao);
	}

}
