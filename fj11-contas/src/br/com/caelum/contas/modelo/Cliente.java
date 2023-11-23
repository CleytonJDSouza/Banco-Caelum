package br.com.caelum.contas.modelo;

class Cliente implements Autenticavel {
	String nome;
	String endereco;
	
	@Override
	public boolean autentica(int senha) {
		return false;
	}
}