package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ControleDeBonificacoes;
import br.com.caelum.contas.modelo.Funcionario;
import br.com.caelum.contas.modelo.Gerente;

public class TestaGerente {
    public static void main(String[] args) {
    	Funcionario funcionario = new Funcionario("João", "12345678900", 3000.0);
        Gerente gerente = new Gerente("Maria", "98765432100", 5000.0, 1234, 8);

        double bonificacaoFuncionario = funcionario.getBonificacao();
        double bonificacaoGerente = gerente.getBonificacao();

        System.out.println("Bonificação do Funcionário: " + bonificacaoFuncionario);
        System.out.println("Bonificação do Gerente: " + bonificacaoGerente);
    	
        //Controle de Bonificações.
    	ControleDeBonificacoes controle = new ControleDeBonificacoes();
    	
    	Gerente funcionario1 = new Gerente("Maria", "98765432100", 5000.0, 1234, 8);
    	funcionario1.setSalario(5000.0);
    	controle.registra(funcionario1);
    	
    	Funcionario funcionario2 = new Funcionario("João", "12345678900", 3000.0);
    	funcionario2.setSalario(1000.0);
    	controle.registra(funcionario2);
    	
    	System.out.println(controle.getTotalDeBonificacoes());
    }
}