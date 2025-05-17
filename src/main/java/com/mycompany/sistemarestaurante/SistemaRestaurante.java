
package com.mycompany.sistemarestaurante;
import java.time.LocalDateTime;

public class SistemaRestaurante {

    public static void main(String[] args) {
        // Crear usuario
        Usuario usuario = new Usuario(1, 12345678, "Nicolás Moreno", "nico@unal.edu.co", "clave123", "3111234567", "Mesero");
        
        // Crear mesa
        Mesa mesa = new Mesa(1, 5, 4);
        
        // Crear platos
        Plato plato1 = new Plato(1, "Hamburguesa","Con queso y lechuga", 15000,"Plato fuerte");
        Plato plato2 = new Plato(2, "Pizza Hawaiana","COn piña cocinada", 20000,"Plato fuerte");
        
        // Crear pedido
        Pedido pedido = new Pedido(1, mesa, usuario);

        // Crear detalles de pedido
        DetallePedido detalle1 = new DetallePedido(1, pedido, plato1, 2);
        DetallePedido detalle2 = new DetallePedido(2, pedido, plato2, 1); 
        

        // Agregar detalles al pedido
        pedido.agregarDetalle(detalle1);
        pedido.agregarDetalle(detalle2);

        // Calcular total del pedido
        pedido.calcularTotal();

        // Crear factura
        Factura factura = new Factura(1, pedido, LocalDateTime.now());
        factura.calcularTotal();

        // Mostrar factura
        factura.mostrarFactura();
    }
}
