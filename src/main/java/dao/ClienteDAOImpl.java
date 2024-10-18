package dao;

import model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public List<Cliente> listarClientes() {
        return new ArrayList<>(clientes);
    }
}
