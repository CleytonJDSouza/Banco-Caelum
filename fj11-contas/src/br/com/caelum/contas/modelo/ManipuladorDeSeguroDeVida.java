package br.com.caelum.contas.modelo;

public class ManipuladorDeSeguroDeVida {
    private SeguroDeVida seguroDeVida;

    public void criaSeguro(Evento evento) {
        seguroDeVida = new SeguroDeVida(
            evento.getDouble("valor"),
            evento.getString("titular"),
            evento.getInt("numeroApolice")
        );
    }
}