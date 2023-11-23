package br.com.caelum.contas.modelo;

public class SaldoInsuficienteException extends RuntimeException {
	
	//Atributos
	private double valorDoSaque;
	
	//Construtor com mensagem de erro
	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}
	
	//Construtor para manter o valor do saque.
	public SaldoInsuficienteException(double valorDoSaque) {
        this.valorDoSaque = valorDoSaque;
    }
	
	//Getters
	public double getValorDoSaque() {
		return valorDoSaque;
	}
}