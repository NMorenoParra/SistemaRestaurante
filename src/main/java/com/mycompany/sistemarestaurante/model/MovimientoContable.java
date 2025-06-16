
package com.mycompany.sistemarestaurante.model;
import java.time.LocalDateTime;

public class MovimientoContable {
    private int id;
    private String tipo;
    private String descripcion;
    private double monto;
    private LocalDateTime fechaHora;

    public MovimientoContable() {
        this.fechaHora = LocalDateTime.now();
    }

    public MovimientoContable(int id, String tipo, String descripcion, double monto){
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.monto = monto;
        this.fechaHora = LocalDateTime.now();
    }

    public String getTipo() {
        return tipo;
    }

    public double getMonto() {
        return monto;
    }
    
    @Override
    public String toString(){
        String datos = "Id: " + id + "Tipo: " + tipo + "Descripcion: " + descripcion + "Monto: " + monto + "Fecha y Hora: " + fechaHora;
        return datos;
    }   
}
