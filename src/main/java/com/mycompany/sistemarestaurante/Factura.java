package com.mycompany.sistemarestaurante;
import java.time.LocalDateTime;

public class Factura {
    //Atributos
    private int id;
    private Pedido pedido;
    private LocalDateTime fechaHora;
    private double total;
    
    //Constructor vacio
    public Factura(){
        this.fechaHora = LocalDateTime.now();
        this.total = 0.00;
    }
    
    //Método constructor
    public Factura(int id, Pedido pedido) {
        this.id = id;
        this.pedido = pedido;
        this.fechaHora = LocalDateTime.now();
        this.total = 0.00;
    }
    
    //Getters
    
    public double getTotal() {
        return total;
    }
    
    //Método calcularTotal
    public double calcularTotal() {
        this.total = pedido.calcularTotal();
        return this.total;
    }
    
    //Método mostrarFactura
    public void mostrarFactura() {
        System.out.println("----- FACTURA -----");
        System.out.println("Factura ID: " + id);
        System.out.println("Fecha y hora: " + fechaHora);
        System.out.println("Mesa: " + pedido.getMesa().getNumero());
        System.out.println("Atendido por: " + pedido.getUsuario().getNombreCompleto());
        System.out.println("Estado del pedido: " + pedido.getEstado());
        System.out.println("Total a pagar: $" + String.format("%.2f", total));
    }
    
}
