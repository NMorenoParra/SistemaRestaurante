package com.mycompany.sistemarestaurante;

public class Producto {
    //Atributos
    private int id;
    private String nombre;
    private String unidadMedida;
    private double stock;
    private double precioUnitario;
    
    //Constructor  vacio
    public Producto() {
    }
    
    //Método constructor
    public Producto(int id, String nombre, String unidadMedida, double stock, double precioUnitario) {
        this.id = id;
        this.nombre = nombre;
        this.unidadMedida = unidadMedida;
        this.stock = stock;
        this.precioUnitario = precioUnitario;
    }
    
    //Getters

    public String getNombre() {
        return nombre;
    }

    public double getStock() {
        return stock;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }
    
    //Métodos de gestion stock
    
    public void agregarStock(double cantidad,double costoTotal){
        this.stock += cantidad; 
        
        Contabilidad.getInstance().registrarEgreso("Compra de " + nombre + " (" + cantidad + " " + unidadMedida + ")", costoTotal);
    }
    
    public void reducirStock(double cantidad){
        this.stock -= cantidad;
    }
    
    //Método para ver datos
    @Override
    public String toString(){
        String data = "Id: " + id + "\n"
                    + "Nombre: " + nombre + "\n"
                    + "Unidad de Medida: " + unidadMedida + "\n"
                    + "Stock: " + stock + "\n"
                    + "Precio Unitario: " + precioUnitario + "\n";
        
        return data;
    }
}
