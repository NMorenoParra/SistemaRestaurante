    package com.mycompany.sistemarestaurante;

    public class DetallePedido {
        //Atributos
        private int id;
        private Pedido pedido;
        private Plato plato;
        private int cantidad;
        private double subtotal;
        
        //Constructor vacio
        public DetallePedido(){
            this.subtotal = 0.00;
        }

        //Método constructor
        public DetallePedido(int id, Pedido pedido, Plato plato, int cantidad) {
            this.id = id;
            this.pedido = pedido;
            this.plato = plato;
            this.cantidad = cantidad;
            this.subtotal = 0.00;
        }
        
        //Getters
        
        public double getSubtotal() {
            return subtotal;
        }
        
        public Plato getPlato(){
            return plato;
        }
        
        public int getCantidad(){
            return cantidad;
        }
        
        //Método calcularSubtotal
        public double calcularSubtotal() {
            this.subtotal = plato.getPrecio() * cantidad;
            return subtotal;
        }        
    }
