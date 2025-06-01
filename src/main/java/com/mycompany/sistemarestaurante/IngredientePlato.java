
package com.mycompany.sistemarestaurante;

public class IngredientePlato {
    //Atributos
    private int id;
    private Producto producto;
    private Plato plato;
    private double cantidad;
    
    //Constructor vacio
    public IngredientePlato() {
    }
    
    //Método constructor
    public IngredientePlato(int id, Producto producto, Plato plato, double cantidad) {
        this.id = id;
        this.producto = producto;
        this.plato = plato;
        this.cantidad = cantidad;
    }
    
    //Getters
    public Producto getProducto() {
        return producto;
    }

    public double getCantidad() {
        return cantidad;
    }
    
}
