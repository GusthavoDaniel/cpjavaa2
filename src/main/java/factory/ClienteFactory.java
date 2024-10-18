package factory;

import model.Cliente;

public class ClienteFactory {
    public static Cliente criarCliente(String nome, String documento) {
        return new Cliente(nome, documento);
    }
}
