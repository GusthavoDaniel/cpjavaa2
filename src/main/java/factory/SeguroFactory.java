package factory;

import model.Seguro;

public class SeguroFactory {
    public static Seguro criarSeguro(String tipo, double valor) {
        return new Seguro(tipo, valor);
    }
}
