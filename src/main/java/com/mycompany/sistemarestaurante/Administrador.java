
package com.mycompany.sistemarestaurante;

public class Administrador extends Usuario{
    
    public Administrador(){
        super();
    }

    public Administrador(int id, int documento, String nombreCompleto, String rol, String correo, String clave, String celular) {
        super(id, documento, nombreCompleto, rol, correo, clave, celular);
    }
    
    
    //Método registrar
    public void registrarUsuario(){
        /*
           Instrucciones de registro
            en la base de datos
        */
    }
    
    //Método consultar
    public void consultarGeneralUsuarios(){
        /*
           Instrucciones de consulta de usuarios
            en la base de datos
        */
    }
    
    //Método modificar usuario por documento
    public void modificarGeneralUsuarios(int documento){
        /*
           Instrucciones de modificacion de usuarios
            en la base de datos
        */
    }
    
    //Método eliminar usuarios
    public void eliminarUsuario(int documento){
        /*
            Instrucciones de eliminación 
            desde la base de datos
        */
    }
}
