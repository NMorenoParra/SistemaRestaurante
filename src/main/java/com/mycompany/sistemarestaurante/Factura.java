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
        double costo = pedido.calcularTotal();
        this.total = costo;
        return costo;
    }
    
    //Método mostrarFactura
    @Override
    public String toString() {
        String factura = "----- FACTURA -----\n";
        factura += "Factura ID: " + id + "\n";
        factura += "Fecha y hora: " + fechaHora + "\n";
        factura += "Mesa: " + pedido.getMesa().getNumero() + "\n";
        factura += "Atendido por: " + pedido.getUsuario().getNombreCompleto() + "\n";
        factura += "Estado del pedido: " + pedido.getEstado() + "\n";
        factura += "Total a pagar: $" + String.format("%.2f", total) + "\n";
        return factura;
    }
    
    //Método generar factura
    public void generarFactura(){
        /*Aqui deberia generarse un ingreso con el calcular totl*/
        if(total == 0.0){
            calcularTotal();
        }
        
        String descripcion = "Venta - Pedido Id: " + pedido.getId();
        Contabilidad.getInstance().registrarIngreso(descripcion,total);
    }
    
}
