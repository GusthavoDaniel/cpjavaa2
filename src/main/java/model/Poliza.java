package model;

public class Poliza {
    private Cliente cliente;
    private Seguro seguro;

    public Poliza(Cliente cliente, Seguro seguro) {
        this.cliente = cliente;
        this.seguro = seguro;
    }

    public void gerarRelatorio() {
        System.out.println("Relatório da Póliza:");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Seguro: " + seguro.getTipo());
        System.out.println("Valor: " + seguro.getValor());
    }
}