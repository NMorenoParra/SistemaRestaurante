package com.mycompany.sistemarestaurante;

public class Mesa {
    // Atributos
    private int id;
    private int numero;
    private int capacidad;
    private String estado;
    
    //constructor vacio
    public Mesa() {}
    
    // Método constructor
    public Mesa(int id, int numero, int capacidad) {
        this.id = id;
        this.numero = numero;
        this.capacidad = capacidad;
        this.estado = "Disponible";
    }
    
    //Getters

    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getEstado() {
        return estado;
    }
    
    //Setters
    
    public void setEstado(String estado) {      
        String estadoEnMinuscula = estado.toLowerCase();
        
        if("disponible".equals(estadoEnMinuscula) || "ocupada".equals(estadoEnMinuscula)){
            this.estado = estadoEnMinuscula;
        }
    }
    
    //Método esDisponible
    public boolean esDisponible() {
        return "disponible".equals(this.estado);
    }
    
    // Método mostrarInfo
    public  void mostrarInfo() {
        String info = "Id: " + id + "\n"
                + "No. Mesa: " + numero + "\n"
                + "Capacidad: " + capacidad + "\n"
                + "Estado: " + estado + "\n";
        
        System.out.println(info);
    }
    
}
