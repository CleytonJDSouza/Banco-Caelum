package br.com.caelum.contas.main;

	
public class PessoaFisica {
		
	private String cpf;
		
	public PessoaFisica(String cpf) {
		if (validaCPF(cpf)) {
			this.cpf = cpf;
		} else {
			System.out.println("CPF inválido. A PessoaFísica não foi criada.");
		}
	}
		
	public String getCpf() {
		return cpf;
	}
		
	private boolean validaCPF(String cpf) {
		
		cpf = cpf.replaceAll("[^0-9]", "");
		
		if (cpf.length() != 11) {
			return false;
		}
		
		int soma = 0;
		for (int i = 0; i < 9; i++) {
			soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
		}
		int resto = soma % 11;
		int digitoVerificador1 = (resto < 2) ? 0 : 11 - resto;
		
		if (digitoVerificador1 != Character.getNumericValue(cpf.charAt(9))) {
			return false;
		}
		
		soma = 0;
		for (int i = 0; i < 10; i++) {
			soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
		}
		resto = soma % 11;
		int digitoVerificador2 = (resto < 2) ? 0 : 11 - resto;
		
		return digitoVerificador2 == Character.getNumericValue(cpf.charAt(10));
	}
	
	public static void main(String[] args) {
		
		PessoaFisica pessoa1 = new PessoaFisica("123.456.789-09");
		System.out.println("CPF da pessoa1: " + pessoa1.getCpf());
		
		PessoaFisica pessoa2 = new PessoaFisica("123.456.789-00");
	}

}

