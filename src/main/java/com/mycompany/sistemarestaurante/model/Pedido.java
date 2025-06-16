
package com.mycompany.sistemarestaurante.model;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
    //Atributos
    private int id;
    private Mesa mesa;
    private Usuario usuario;
    private LocalDateTime fechaHora;
    private String estado;
    private double valorTotal;
    private ArrayList<DetallePedido> detalles;
    
    //Constructor vacio
    public Pedido(){
        this.estado = "Sin entregar";
        this.valorTotal = 0.00;
        this.detalles = new ArrayList<>();
    }
    
    //Método constructor
    public Pedido(int id, Mesa mesa, Usuario usuario) {
        this.id = id;
        this.mesa = mesa;
        this.usuario = usuario;
        this.fechaHora = LocalDateTime.now();
        this.estado = "Disponible";
        this.valorTotal = 0.00;
        this.detalles = new ArrayList<>();
    }
    
    //Getters
    
    public Mesa getMesa() {
        return mesa;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    

    public String getEstado() {
        return estado;
    }

    public int getId() {
        return id;
    }
    
    //Setters
    public void setEstado(String estado) {
        String estadoNormalizado = estado.toLowerCase();
        
        if ("pendiente".equals(estadoNormalizado) || "entregado".equals(estadoNormalizado)) {
            this.estado = estadoNormalizado;
        }
    }
    
    //Método agregarDetalle
    public void agregarDetalle(DetallePedido detalle){
        this.detalles.add(detalle);
    }
    
    //Método calcularTotal
    public double calcularTotal() {
        double total = 0;
        
        for(DetallePedido detalle : detalles){
            total += detalle.calcularSubtotal();
        }
        
        this.valorTotal = total;
        return valorTotal;
    }
    
    //Método mostrarDatos
    @Override
    public String toString() {
        String result = "ID Pedido: " + id + "\n" +
                        "Fecha y Hora: " + fechaHora + "\n" +
                        "Usuario: " + usuario.getNombreCompleto() + "\n" +
                        "Mesa: " + mesa.getNumero() + "\n" +
                        "Estado: " + estado + "\n" +
                        "Detalles:\n";

        for (DetallePedido detalle : detalles) {
            result += "- " + detalle.getPlato().getPrecio() + " x " +
                      detalle.getCantidad() + " = " +
                      detalle.getSubtotal() + "\n";
        }

        result += "Total: $" + calcularTotal();
        return result;
    }
}
