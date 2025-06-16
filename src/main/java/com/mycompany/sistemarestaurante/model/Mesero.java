
package com.mycompany.sistemarestaurante.model;

public class Mesero extends Usuario{

    public Mesero() {
        super();
    }
    
    
    public Mesero(int documento, String nombreCompleto, String rol, String correo, String clave, String celular) {
        super(documento, nombreCompleto, rol, correo, clave, celular);
    }
    
}
