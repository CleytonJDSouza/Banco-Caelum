package br.com.caelum.contas.main;

public class Fibonacci {
	public static long calculaFibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		
		long[] memo = new long[n + 1];
		memo[0] = 0;
		memo[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			memo[i] = memo[i - 1] + memo[i - 2];
		}
		
		return memo[n];
	}
	
	public static void main(String[] args) {
		int n = 50;
		long resultado = calculaFibonacci(n);
		System.out.println("Fibonacci de " + n + " é " + resultado);
	}
}
