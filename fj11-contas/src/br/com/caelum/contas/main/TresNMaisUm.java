package br.com.caelum.contas.main;

class TresNMaisUm {
	
	public static void main(String[] args) {
		int x = 13;
		System.out.println("Iniciando...\n" + x);
		while (x != 1) {
			if (x % 2 == 0) {
				x = x / 2;
			} else {
				x = 3 * x + 1;
			}
			System.out.println(x);
		}
	}
}
