// IMPLEMENTANDO O MÉTODO buscaPorTitular

/*package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private int numero;
	private List<ContaBase> contas;
	
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ArrayList<>();
	}
	
	public void adiciona(ContaBase conta) {
		this.contas.add(conta);
	}
	
	public ContaBase pega(int indice) {
		if (indice >= 0 && indice < this.contas.size()) {
			return this.contas.get(indice);
		} else {
			return null;
		}
	}
	
	public int pegaQuantidadeDeContas() {
		return this.contas.size();
	}
	
	public void mostraContas() {
		for (int i = 0; i < this.contas.size(); i++) {
			ContaBase conta = this.contas.get(i);
			System.out.println("Conta na posição " + i + ":");
			System.out.println(conta.toString());
		}
	}
	
	public boolean contem(ContaBase conta) {
		return this.contas.contains(conta);
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public List<ContaBase> getContas() {
		return contas;
	}
}*/

/*package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	private String nome;
	private int numero;
	private List<ContaBase> contas;
	private Map<String, ContaBase> mapaContasPorTitular;
	
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ArrayList<>();
		this.mapaContasPorTitular = new HashMap<>();
	}
	
	public void adiciona(ContaBase conta) {
		this.contas.add(conta);
		this.mapaContasPorTitular.put(conta.getTitular(), conta);
	}
	
	public ContaBase pega(int indice) {
		if (indice >= 0 && indice < this.contas.size()) {
			return this.contas.get(indice);
		} else {
			return null;
		}
	}
	
	public int pegaQuantidadeDeContas() {
		return this.contas.size();
	}
	
	public void mostraContas() {
		for (int i = 0; i < this.contas.size(); i++) {
			ContaBase conta = this.contas.get(i);
			System.out.println("Conta na posição " + i + ":");
			System.out.println(conta.toString());
		}
	}
	
	public boolean contem(ContaBase conta) {
		return this.contas.contains(contas);
	}
	
	public ContaBase buscarPorTitular(String nomedoTitular) {
		return this.mapaContasPorTitular.get(nomedoTitular);
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public List<ContaBase> getContas() {
		return contas;
	}
}*/

//SEM O MÉTODO buscaPorTitular
package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private int numero;
    private List<ContaBase> contas;

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.contas = new ArrayList<>();
    }

    public void adiciona(ContaBase conta) {
        this.contas.add(conta);
    }

    public ContaBase pega(int indice) {
        if (indice >= 0 && indice < this.contas.size()) {
            return this.contas.get(indice);
        } else {
            return null;
        }
    }

    public int pegaQuantidadeDeContas() {
        return this.contas.size();
    }

    public void mostraContas() {
        for (int i = 0; i < this.contas.size(); i++) {
            ContaBase conta = this.contas.get(i);
            System.out.println("Conta na posição " + i + ":");
            System.out.println(conta.toString());
        }
    }

    public boolean contem(ContaBase conta) {
        return this.contas.contains(conta);
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public List<ContaBase> getContas() {
        return contas;
    }
}


