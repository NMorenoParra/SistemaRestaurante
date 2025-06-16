
package com.mycompany.sistemarestaurante.model;

public class Cajero extends Usuario{

    public Cajero() {
        super();
    }

    public Cajero(int id, int documento, String nombreCompleto, String rol, String correo, String clave, String celular) {
        super(id, documento, nombreCompleto, rol, correo, clave, celular);
    }
    
    
}
