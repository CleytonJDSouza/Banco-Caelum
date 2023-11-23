package br.com.caelum.contas.modelo;

public class FuncionarioAutenticavel extends Funcionario {
	
	private int senhaCorreta;
	
	public FuncionarioAutenticavel(String nome, String cpf, double salario, int senhaCorrenta) {
		super(nome, cpf, salario);
		this.senhaCorreta = senhaCorrenta;
	}
	
	public boolean autentica(int senha) {
		if (senha == senhaCorreta) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public double getBonificacao() {
		return getSalario() * 0.10;
	}
}
