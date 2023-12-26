package br.com.caelum.contas.main;

class Fibonacci {
	
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		for (int i = 1; i <= 6; i++) {
			int resultado = fibonacci.calculaFibonacci(i);
			System.out.println(resultado);
		}
	}
	
	public int calculaFibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
		}
	}
}
	