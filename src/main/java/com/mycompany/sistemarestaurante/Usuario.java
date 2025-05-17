package com.mycompany.sistemarestaurante;
import java.time.LocalDate;

public class Usuario {
    private int id;
    private int documento;
    private String nombreCompleto;
    private String correo;
    private String clave;
    private String celular;
    private LocalDate fechaRegistro;
    private String rol;
    
    public Usuario(int id, int documento, String nombreCompleto, String correo, String clave, String celular, String rol) {
        this.id = id;
        this.documento = documento;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.clave = clave;
        this.celular = celular;
        this.fechaRegistro = LocalDate.now();
        this.rol = rol;
    }
    //Felicidades, hallaste un easteregg en el código - CEMM
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    public String getRol() {
        return rol;
    }
    
    public void verDatos() {
       String datos = "Id: " + id + "\n"
               + "Nombre: " + nombreCompleto + "\n"
               + "Correo: " + correo + "\n"
               + "Celular: " + celular + "\n"
               + "Rol: " + rol + "\n"
               + "Fecha Registro: " + fechaRegistro + "\n";
       
        System.out.println(datos);
    }
    
}