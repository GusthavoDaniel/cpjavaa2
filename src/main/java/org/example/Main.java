package org.example;

import factory.ClienteFactory;
import factory.SeguroFactory;
import service.ClienteService;
import service.SeguroService;
import dao.ClienteDAO;
import dao.ClienteDAOImpl;
import dao.SeguroDAO;
import dao.SeguroDAOImpl;
import model.Seguro;
import model.Cliente;
import model.Poliza;

public class Main {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAOImpl();
        SeguroDAO seguroDAO = new SeguroDAOImpl();

        ClienteService clienteService = ClienteService.getInstance(clienteDAO);
        SeguroService seguroService = SeguroService.getInstance(seguroDAO);


        Cliente cliente = ClienteFactory.criarCliente("Serjao", "274697456");
        clienteService.cadastrarCliente(cliente);


        Seguro seguro = SeguroFactory.criarSeguro("Automóvel", 9000.00);
        seguro.aplicarDesconto(10);
        seguroService.cadastrarSeguro(seguro);


        Poliza poliza = new Poliza(cliente, seguro);
        poliza.gerarRelatorio();


        System.out.println("Clientes cadastrados: ");
        clienteService.listarClientes().forEach(c ->
                System.out.println("Nome: " + c.getNome() + ", Documento: " + c.getDocumento()));


        System.out.println("Seguros cadastrados: ");
        seguroService.listarSeguros().forEach(s ->
                System.out.println("Tipo: " + s.getTipo() + ", Valor: " + s.getValor()));
    }
}
