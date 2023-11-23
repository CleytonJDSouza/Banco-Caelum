package br.com.caelum.contas.modelo;

import java.util.List;

public class Evento {
    private String tipo;
    private String agencia;
    private int numero;
    private String titular;
    private double valorOperacao;

    private List<Conta> listaContas;
    private List<Tributavel> listaTributaveis;

    public List<Conta> getListaContas() {
        return listaContas;
    }
    
    public void setListaContas(List<Conta> listaContas) {
        this.listaContas = listaContas;
    }
    
    public List<Tributavel> getListaTributaveis() {
        return listaTributaveis;
    }
    
    public int getTamanhoDaLista(String nomeDaLista) {
        if ("listaContas".equals(nomeDaLista)) {
            return listaContas != null ? listaContas.size() : 0;
        } else if ("listaTributaveis".equals(nomeDaLista)) {
            return listaTributaveis != null ? listaTributaveis.size() : 0;
        }
        return 0;
    }

    /*public List<?> getLista(String nomeDaLista) {
        if ("listaContas".equals(nomeDaLista)) {
            return listaContas;
        } else if ("listaTributaveis".equals(nomeDaLista)) {
            return listaTributaveis;
        }
        return null;
    }*/
    
    public List<Conta> getLista(String nomeDaLista) {
    	if ("listaContas".equals(nomeDaLista)) {
    		return (List<Conta>) listaContas;
    	} else if ("listaTributaveis".equals(nomeDaLista)) {
    		return null;
    	}
    	return null;
    }

    public double getValorOperacao() {
        return valorOperacao;
    }

    public void setValorOperacao(double valorOperacao) {
        this.valorOperacao = valorOperacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

	public String getSelecionadoNoRadio(String nomeDoCampo) {
        if (nomeDoCampo.equals("tipo")) {
            return "Conta Corrente";
    }
		return null;
	}

	public double getDouble(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String getSelecionadoNoCombo(String nomeCombo) {
		return nomeCombo;
		
	}

	public String getString(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getInt(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Tributavel getTributavel(String nomeLista, int indice) {
		if (nomeLista.equals("listaTributaveis")) {
			return listaTributaveis.get(indice);
		} else {
			return null;
		}
	}
}
