package com.mycompany.sistemarestaurante;
import java.time.LocalDate;

public class Usuario {
    //Atributos
    private int id;
    private int documento;
    private String nombreCompleto;
    private String correo;
    private String clave;
    private String celular;
    private LocalDate fechaRegistro;
    private String rol;
    
    //Constructor vacio
    public Usuario(){
        this.fechaRegistro = LocalDate.now();
    }
    
    //Método Constructor
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
    
    //Getters
   
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    public String getRol() {
        return rol;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCelular() {
        return celular;
    }
    
    
    
    //Setters
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    //Método ver Datos
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