
package com.mycompany.sistemarestaurante.model;

public class Cocinero extends Usuario{
    private String especialidad;
    
    //Constructor vacio

    public Cocinero() {
        super();
    }
    
    
    
    //Método constructor
    public Cocinero(String especialidad, int documento, String nombreCompleto, String rol, String correo, String clave, String celular) {
        super(documento, nombreCompleto, rol, correo, clave, celular);
        this.especialidad = especialidad;
    }
    
    
    // Getter y Setter
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    //Método toString
    @Override
    public String toString() {
        return super.toString() + "Especialidad: " + especialidad + "\n";
    }
    
}
