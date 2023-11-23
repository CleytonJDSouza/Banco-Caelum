package br.com.caelum.contas.modelo;

public class Gerente extends Funcionario implements Autenticavel{
    
	//Class
    private int senha;
    private int numeroDeFuncionariosGerenciados;
    
    //Bonificação de 15%
    
    @Override
    public double getBonificacao() {
    	return this.salario * 1.4 + 1000;
    }
    
    //Constructor
    public Gerente(String nome, String cpf, double salario, int senha, int numeroDeFuncionariosGerenciados) {
        super(nome, cpf, salario); // Chama o construtor da classe funcionario
        this.senha = senha;
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
    
    //Getters and Setters
    public int getSenha() {
        return senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
}
  