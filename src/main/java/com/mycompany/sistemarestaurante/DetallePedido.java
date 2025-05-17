    package com.mycompany.sistemarestaurante;

    public class DetallePedido {
        private int id;
        private Pedido pedido;
        private Plato plato;
        private int cantidad;
        private double subtotal;

        public DetallePedido(int id, Pedido pedido, Plato plato, int cantidad) {
            this.id = id;
            this.pedido = pedido;
            this.plato = plato;
            this.cantidad = cantidad;
            this.subtotal = 0.00;
        }

        public double calcularSubtotal() {
            subtotal = plato.getPrecio() * cantidad;
            return subtotal;
        }

        public double getSubtotal() {
            return subtotal;
        }
        
        public Plato getPlato(){
            return plato;
        }
        
        public int getCantidad(){
            return cantidad;
        }

    }
