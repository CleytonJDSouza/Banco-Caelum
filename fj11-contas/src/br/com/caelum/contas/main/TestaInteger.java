package br.com.caelum.contas.main;

public class TestaInteger {
	
	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		
		// USANDO "=="
		
		/*if (x1 == x2) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}*/
		
		
		// USANDO "equals"
		
		/*if (x1.equals(x2)) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}
	}*/
		
		// USANDO 'equals' 2
		
		if (x1.intValue() == x2.intValue()) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}
	}
}
