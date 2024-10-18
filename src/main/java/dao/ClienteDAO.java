package dao;

import model.Cliente;
import java.util.List;

public interface ClienteDAO {
    void cadastrarCliente(Cliente cliente);
    List<Cliente> listarClientes();
}
