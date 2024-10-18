package service;

import dao.ClienteDAO;
import model.Cliente;
import java.util.List;

public class ClienteService {
    private static ClienteService instance;
    private ClienteDAO clienteDAO;

    private ClienteService(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    public static ClienteService getInstance(ClienteDAO clienteDAO) {
        if (instance == null) {
            instance = new ClienteService(clienteDAO);
        }
        return instance;
    }

    public void cadastrarCliente(Cliente cliente) {
        clienteDAO.cadastrarCliente(cliente);
    }

    public List<Cliente> listarClientes() {
        return clienteDAO.listarClientes();
    }
}
