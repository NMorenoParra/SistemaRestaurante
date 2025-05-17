
package com.mycompany.sistemarestaurante;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
    private int id;
    private Mesa mesa;
    private Usuario usuario;
    private LocalDateTime fechaHora;
    private String estado;
    private double valorTotal;
    private ArrayList<DetallePedido> detalles;

    public Pedido(int id, Mesa mesa, Usuario usuario) {
        this.id = id;
        this.mesa = mesa;
        this.usuario = usuario;
        this.fechaHora = LocalDateTime.now();
        this.estado = "Disponible";
        this.valorTotal = 0.00;
        this.detalles = new ArrayList<>();
    }
    
    public void agregarDetalle(DetallePedido detalle){
        this.detalles.add(detalle);
    }
    
    public double calcularTotal() {
        double total = 0;
        
        for(DetallePedido detalle : detalles){
            total += detalle.calcularSubtotal();
        }
        
        this.valorTotal = total;
        return valorTotal;
    }
    
    public void mostrarDatos() {
        System.out.println("ID Pedido: " + id);
        System.out.println("Fecha y Hora: " + fechaHora);
        System.out.println("Usuario: " + usuario.getNombreCompleto());
        System.out.println("Mesa: " + mesa.getNumero());
        System.out.println("Estado: " + estado);
        System.out.println("Detalles:");
        
        for (DetallePedido detalle : detalles) {
            System.out.println("- " + detalle.getPlato().getPrecio() + " x " + detalle.getCantidad() + " = " + detalle.getSubtotal());
        }
        System.out.println("Total: $" + calcularTotal());
    }

    public Mesa getMesa() {
        return mesa;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
