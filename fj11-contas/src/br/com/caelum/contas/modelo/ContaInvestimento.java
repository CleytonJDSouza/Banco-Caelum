package br.com.caelum.contas.modelo;

public class ContaInvestimento extends Conta {
	
	public ContaInvestimento(String titular, String agencia, int numero, double saldo) {
		super(titular, agencia, numero, saldo);
	}
	
	public String getTipo() {
		return "Conta Investimento";
	}
	
	public void saca(double valor) {
		throw new UnsupportedOperationException("Não é permitido sacar de uma conta de investimento.");
	}

	@Override
	public void atualiza(double taxaSelic) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 0;
	}
}
