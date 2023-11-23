package br.com.caelum.contas.modelo;

public class SistemaInterno {
	
	public void login(Autenticavel a) {
		
		int senha = 12345;
		
		boolean ok = a.autentica(senha);
		
	}
}
