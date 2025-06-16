
package com.mycompany.sistemarestaurante.model;

public class Administrador extends Usuario{
    
    public Administrador(){
        super();
    }

    public Administrador(int documento, String nombreCompleto, String rol, String correo, String clave, String celular) {
        super(documento, nombreCompleto, rol, correo, clave, celular);
    }
    
   
}
