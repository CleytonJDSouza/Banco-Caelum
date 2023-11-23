package br.com.caelum.contas.modelo;

public class Diretor extends Funcionario implements Autenticavel {
	//Atributo
	private static final int SENHA_CORRETA = 12345;
	
	public Diretor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	@Override
	public double getBonificacao() {
		return getSalario() * 0.20;
		//Bonificação de 20% do salario.
	}
	
	public boolean autentica(int senha) {
		return senha == SENHA_CORRETA;
		}	
}

