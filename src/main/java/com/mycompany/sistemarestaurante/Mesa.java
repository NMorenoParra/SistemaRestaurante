package com.mycompany.sistemarestaurante;

public class Mesa {
    private int id;
    private int numero;
    private int capacidad;
    private String estado;

    public Mesa(int id, int numero, int capacidad) {
        this.id = id;
        this.numero = numero;
        this.capacidad = capacidad;
        this.estado = "Disponible";
    }
    
    public String esDisponible() {
        return this.estado;
    }
    
    public  void mostrarInfo() {
        String info = "Id: " + id + "\n"
                + "No. Mesa: " + numero + "\n"
                + "Capacidad: " + capacidad + "\n"
                + "Estado: " + estado + "\n";
        
        System.out.println(info);
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
