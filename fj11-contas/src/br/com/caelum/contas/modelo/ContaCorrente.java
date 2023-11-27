package br.com.caelum.contas.modelo;

public class ContaCorrente extends ContaBase {
	
	public ContaCorrente(String titular, String agencia, int numero, double saldo) {
		super(titular, agencia, numero, saldo);
	}
	
	public ContaCorrente() {
		super("Titular Padrão", "Agência Padrão", 0, 0.0);
	}
	
	@Override
		public void atualiza(double taxaSelic) {
			double saldoAtual = this.getSaldo();
	        double novoSaldo = saldoAtual + (saldoAtual * taxaSelic);
	        this.setSaldo(novoSaldo);
	    }
	
	@Override
	public String getTipo() {
		return "Conta Corrente";
	}
	
	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
	
	 public int compareTo(Conta outraConta) {
	    return Integer.compare(this.getNumero(), outraConta.getNumero());
	}

	@Override
	public void transfere(double valor, ContaBase destino) throws SaldoInsuficienteException {
		// TODO Auto-generated method stub
		
	}
}