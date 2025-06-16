
package com.mycompany.sistemarestaurante.model;
import java.util.ArrayList;

public class Plato {
    //Atributos
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private String categoria;
    private ArrayList<IngredientePlato> ingredientes;
    
    //Constructor vacio
    public Plato() {
        this.precio = 0.00;
        this.ingredientes = new ArrayList<>();
    }
    
    //Método constructor
    public Plato(int id, String nombre, String descripcion, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = 0.00;
        this.categoria = categoria;
        this.ingredientes = new ArrayList<>();
    }
 
    //Getters
    
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    //Setters
    
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }
    
    //Método agregar ingredients
    public void agregarIngrediente(IngredientePlato ingrediente){
        ingredientes.add(ingrediente);
    }
    
    //Método calcular precio
    public double calcularPrecio(){
        double total = 0.0;
        for(IngredientePlato i: ingredientes){
            total += i.getCantidad()*i.getProducto().getPrecioUnitario();
        }
        this.precio = total;
        return total;
    }
    
    //Método calcular precioVenta
    public double calcularPrecioVenta(){
        return this.precio*1.5;
    }
    
    //Método mostrarDatos
    @Override
    public String toString() {
        String datos = "Id: " + id + "\n"
                + "Nombre: " + nombre + "\n"
                + "Descripción: " + descripcion + "\n"
                + "Precio: " + precio + "\n"
                + "Categoria: " + categoria + "\n";
        
        return datos;
    }    
}