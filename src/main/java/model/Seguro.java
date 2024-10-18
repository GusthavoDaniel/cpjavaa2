package model;

public class Seguro {
    private String tipo;
    private double valor;

    public Seguro(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}