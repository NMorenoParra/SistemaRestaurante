
package com.mycompany.sistemarestaurante;

public class Plato {
    //Atributos
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private String categoria;
    
    //Constructor vacio
    public Plato() {
    }
    
    //Método constructor
    public Plato(int id, String nombre, String descripcion, double precio, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
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
    
    
    //Método mostrarDatos
    public void mostrarDatos() {
        String datos = "Id: " + id + "\n"
                + "Nombre: " + nombre + "\n"
                + "Descripción: " + descripcion + "\n"
                + "Precio: " + precio + "\n"
                + "Categoria: " + categoria + "\n";
        
        System.out.println(datos);
    }    
}