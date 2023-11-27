package br.com.caelum.contas.modelo;

public class ContaPoupanca extends ContaBase implements ContaInterface, Comparable<ContaBase> {
	
	public ContaPoupanca(String titular, String agencia, int numero, double saldo) {
		super(titular, agencia, numero, saldo);
	}
	
    @Override
    public String getTipo() {
    	return "Conta Poupança";
    }
    
    @Override
    public double getSaldo() {
    	return super.getSaldo();
    }
    
    @Override
    public void deposita(double valor) {
    	super.deposita(valor);
    }
    
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		if (valor < 0) {
			throw new IllegalArgumentException("Erro ao sacar: O valor não pode ser negativo.");
		}
		if (valor > getSaldo()) {
			throw new SaldoInsuficienteException("Erro ao sacar: Saldo insuficiente para sacar " + valor);
		}
		
		saldo -= valor;
    }
    
    @Override
    public void atualiza(double taxaSelic) {
    	super.atualiza(taxaSelic);
    }
    
    @Override
    public void transfere(double valor, ContaBase destino) throws SaldoInsuficienteException {
        if (saldo >= valor) {
            saldo -= valor;
            destino.deposita(valor);
        } else {
            throw new SaldoInsuficienteException("Transferência não realizada. Saldo insuficiente.");
        }
    }
    
    public int compareTo(ContaPoupanca outraConta) {
        return this.getTitular().compareTo(outraConta.getTitular());
    }

	@Override
	public int compareTo(ContaBase o) {
		// TODO Auto-generated method stub
		return 0;
	}
}