package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ProduzMensagens;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RegistroDeMensagens {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		// Testando com HashSet
		List<String> mensagensHashSet = new ArrayList<>();
		
		Thread t1HashSet = new Thread(new ProduzMensagens(0, 10000, mensagensHashSet));
        Thread t2HashSet = new Thread(new ProduzMensagens(10000, 20000, mensagensHashSet));
        Thread t3HashSet = new Thread(new ProduzMensagens(20000, 30000, mensagensHashSet));
        
        t1HashSet.start();
        t2HashSet.start();
        t3HashSet.start();
        
        t1HashSet.join();
        t2HashSet.join();
        t3HashSet.join();
        
        System.out.println("Treads produtoras de mensagens com HashSet finalizadas!");
        
     
        // Testando com LinkedList
        List<String> mensagensLinkedList = new LinkedList<>();
        
        Thread t1LinkedList = new Thread(new ProduzMensagens(0, 10000, mensagensLinkedList));
        Thread t2LinkedList = new Thread(new ProduzMensagens(10000, 20000, mensagensLinkedList));
        Thread t3LinkedList = new Thread(new ProduzMensagens(20000, 30000, mensagensLinkedList));
        
        t1LinkedList.start();
        t2LinkedList.start();
        t3LinkedList.start();
        
        t1LinkedList.join();
        t2LinkedList.join();
        t3LinkedList.join();
        
        System.out.println("Thread produtoras de mensagens com LinkedList finalizadas!");
        
        
        //Verificar se todas as mensagens
        verificarMensagens(mensagensHashSet, "HashSet");
        verificarMensagens(mensagensLinkedList, "LinkedList");
	}
	
	private static void verificarMensagens(List<String> mensagens, String tipo) {
		for (int i = 0; i < 30000; i++) {
			if (!mensagens.contains("Mensagem " + i)) {
				throw new IllegalStateException("Não encontrei a mensagem " + i + " na lista " + tipo);
			}
		}
		
		if (mensagens.contains(null)) {
			throw new IllegalStateException("Não devia ter null na lista " + tipo);
		}
		
		System.out.println("Verificação da lista " + tipo + "concluida com sucesso!");
	}
}