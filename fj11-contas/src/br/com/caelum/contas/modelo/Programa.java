package br.com.caelum.contas.modelo;

public class Programa implements Runnable {
	
	private int id;
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Programa " + id + " - Contador: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
