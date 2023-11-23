package br.com.caelum.contas.modelo;

public class ManipuladorDeTributaveis {
	
	//Atributo
	private double total;
	
	//Métodos
	public void calculaImposto(Evento evento) {
		int tamanhoDaLista = evento.getTamanhoDaLista("listaTributaveis");
		
		for (int i = 0; i < tamanhoDaLista; i++) {
			Tributavel tributavel = evento.getTributavel("listaTributaveis", i);
			total += tributavel.getValorImposto();
		}
	}
	
	//Getters and Setters
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
}
