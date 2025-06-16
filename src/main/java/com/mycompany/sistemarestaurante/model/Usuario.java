package com.mycompany.sistemarestaurante.model;
import java.time.LocalDate;

public class Usuario {
    //Atributos
    private int id;
    private int documento;
    private String nombreCompleto;
    private String rol;
    private String correo;
    private String clave;
    private String celular;
    private LocalDate fechaRegistro;
    
    //Constructor vacio
    public Usuario(){
        this.fechaRegistro = LocalDate.now();
    }
    
    //Método Constructor
    public Usuario(int id, int documento, String nombreCompleto, String rol, String correo, String clave, String celular) {
        this.id = id;
        this.documento = documento;
        this.nombreCompleto = nombreCompleto;
        this.rol = rol;
        this.correo = correo;
        this.clave = clave;
        this.celular = celular;
        this.fechaRegistro = LocalDate.now();
    }
    
    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
   
  
    
    //Método ver Datos
    @Override
    public String toString() {
       String datos = "Id: " + id + "\n"
               + "Nombre: " + nombreCompleto + "\n"
               + "Correo: " + correo + "\n"
               + "Celular: " + celular + "\n"
               + "Rol: " + rol + "\n"
               + "Fecha Registro: " + fechaRegistro + "\n";
       
        return datos;
    }
    
}