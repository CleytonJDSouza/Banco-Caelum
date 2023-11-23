package br.com.caelum.contas.modelo;

public class Banco {
	//Atributos
    private String nome;
    private int numero;
    private ContaBase[] contas;
    private int capacidadeMaxima;

    //Métodos
    public Banco(String nome, int numero, int capacidadeMaxima) {
        this.nome = nome;
        this.numero = numero;
        this.capacidadeMaxima = capacidadeMaxima;
        this.contas = new ContaBase[10];
    }

    public void adiciona(ContaBase conta) {
        if (contasCheias()) {
            aumentaCapacidade();
        }
    	
        int posicaoVazia = -1;

        for (int i = 0; i < this.contas.length; i++) {
            if (contas[i] == null) {
                posicaoVazia = i;
                break;
            }
        }

        if (posicaoVazia != -1) {
            contas[posicaoVazia] = conta;
        } else {
            System.out.println("Não é possível adicionar mais contas, a capacidade máxima foi atingida.");
        }
    }
    
    private boolean contasCheias() {
    	for (ContaBase conta : contas) {
    		if (conta == null) {
    			return false;
    		}
    	}
    	return true;
    }
    
    private void aumentaCapacidade() {
    	int novoTamanho = contas.length * 2;
    	ContaBase[] novaArray = new ContaBase[novoTamanho];
    	
    	for (int i = 0; i < contas.length; i++) {
    		novaArray[i] = contas[i];
    	}
    	
    	contas = novaArray;
    }
    
    public void mostraContas() {
    	for (int i = 0; i < this.contas.length; i ++) {
    		ContaBase conta = this.contas[i];
    		if (conta != null) {
    			System.out.println("Conta na posição " + i + ":");
    			System.out.println(conta.toString());
    		}
    	}
    }
    
    public boolean contem(ContaBase conta) {
    	for (ContaBase c : contas) {
    		if (c != null && c.equals(conta)) {
    			return true;
    		}
    	}
    	return false;
    }
	
	public String getNome() {
		return nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public ContaBase[] getContas() {
		return contas;
	}
}
