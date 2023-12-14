package br.com.caelum.contas.main;

import java.util.List;
import java.util.Vector;
import br.com.caelum.contas.modelo.ProduzMensagens;

/*import java.util.concurrent.CopyOnWriteArrayList;

import br.com.caelum.contas.modelo.ProduzMensagens;

public class RegistroDeMensagens {
	
	public static void main(String[] args) throws InterruptedException {
		List<String> mensagens = new CopyOnWriteArrayList<>();
		
		Thread t1 = new Thread(new ProduzMensagens(0, 10000, mensagens));
	    Thread t2 = new Thread(new ProduzMensagens(10000, 20000, mensagens));
	    Thread t3 = new Thread(new ProduzMensagens(20000, 30000, mensagens));
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Threads produtoras de mensagens finalizadas!");
		
		for (int i = 0; i < 30000; i++) {
			if (!mensagens.contains("Mensagem " + i)) {
				throw new IllegalStateException("não encontri a mensagem: " + i);
			}
		}
		
		if (mensagens.contains(null)) {
			throw new IllegalStateException("não devia ter null aqui dentro!");
		}
		
		System.out.println("Fim da execução com sucesso");
	}

}*/

public class RegistroDeMensagens {
	
	public static void main(String[] args) throws InterruptedException {
		List<String> mensagens = new Vector<>();
		
		Thread t1 = new Thread(new ProduzMensagens(0, 10000, mensagens));
		Thread t2 = new Thread(new ProduzMensagens(10000, 20000, mensagens));
		Thread t3 = new Thread(new ProduzMensagens(20000, 30000, mensagens));
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Threads produtoras de mensagens finalizadas!");
		
		for (int i = 0; i < 30000; i++) {
			if (!mensagens.contains("Mensagem " + i)) {
				throw new IllegalStateException("não encontri a mensagem: " + i);
			}
		}
		
		if (mensagens.contains(null)) {
			throw new IllegalStateException("não devia ter null aqui dentro!");
		}
		
		System.out.println("Fim da execução com sucesso");
	}
}