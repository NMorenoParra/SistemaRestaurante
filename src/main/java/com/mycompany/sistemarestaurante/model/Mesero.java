
package com.mycompany.sistemarestaurante.model;

public class Mesero extends Usuario{

    public Mesero() {
        super();
    }
    
    
    public Mesero(int id, int documento, String nombreCompleto, String rol, String correo, String clave, String celular) {
        super(id, documento, nombreCompleto, rol, correo, clave, celular);
    }
    
}
