package com.mycompany.sistemarestaurante;

import java.time.LocalDateTime;
public class Factura {
    private int id;
    private Pedido pedido;
    private LocalDateTime fechaHora;
    private double total;

    public Factura(int id, Pedido pedido, LocalDateTime fechaHora) {
        this.id = id;
        this.pedido = pedido;
        this.fechaHora = fechaHora;
        this.total = 0.00;
    }
    
    public double calcularTotal() {
        total = pedido.calcularTotal();
        return total;
    }
    
    public void mostrarFactura() {
        System.out.println("----- FACTURA -----");
        System.out.println("Factura ID: " + id);
        System.out.println("Fecha y hora: " + fechaHora);
        System.out.println("Mesa: " + pedido.getMesa().getNumero());
        System.out.println("Atendido por: " + pedido.getUsuario().getNombreCompleto());
        System.out.println("Estado del pedido: " + pedido.getEstado());
        System.out.println("Total a pagar: $" + String.format("%.2f", total));
    }

    public double getTotal() {
        return total;
    }
    
}
