
package com.mycompany.sistemarestaurante.crud;
import java.sql.*;
import com.mycompany.sistemarestaurante.model.*;

public class CrudUsuario {
    
    //Método del Login
    public boolean ingresar(int documento, String clave){
        String query = "SELECT*FROM Usuario WHERE Documento = ? AND Clave = ?";
        try{
            Connection con = ConexionBD.conectar();
            if(con != null){
                PreparedStatement ps = con.prepareStatement(query);
                ps.setInt(1, documento);
                ps.setString(2, clave);
                
                ResultSet answer = ps.executeQuery();

                return answer.next();
               
            }
            else{
                System.out.println("No se pudo conectar con la base de datos");
                return false;
            }
        }
        catch(SQLException e){
            System.out.println("Error al hacer la busqueda: " + e.getMessage());
            return false;
        }
    }
    
    //Método registrar cocineros
    public boolean registrar(Cocinero c){
        String query = "INSERT INTO Usuario (Documento, NombreCompleto, Rol, Correo, Clave, Celular, FechaRegistro, Especialidad) VALUES (?,?,?,?,?,?,?,?)";
        
        try{
            Connection con = ConexionBD.conectar();
            if(con != null){
                 PreparedStatement ps = con.prepareStatement(query);
                ps.setInt(1, c.getDocumento());
                ps.setString(2, c.getNombreCompleto());
                ps.setString(3, c.getRol());
                ps.setString(4, c.getCorreo());
                ps.setString(5, c.getClave());
                ps.setString(6, c.getCelular());
                ps.setDate(7,java.sql.Date.valueOf(c.getFechaRegistro()));
                ps.setString(8, c.getEspecialidad());

                ps.executeUpdate();
                return true;
            }
            else{
                System.out.println("No se pudo conectar con la base de datos");
                return false;
            }
        }
        catch(SQLException e){
            System.out.println("Error al registrar: " + e.getMessage());
            return false;
        }
    }
    
    //Metodo registrar Admin,Mesero y Cajero
    public boolean registrar(Usuario u){
        String query = "INSERT INTO Usuario (Documento, NombreCompleto, Rol, Correo, Clave, Celular, FechaRegistro) VALUES (?,?,?,?,?,?,?)";
        
        try{
            Connection con = ConexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, u.getDocumento());
            ps.setString(2, u.getNombreCompleto());
            ps.setString(3, u.getRol());
            ps.setString(4, u.getCorreo());
            ps.setString(5, u.getClave());
            ps.setString(6, u.getCelular());
            ps.setDate(7,java.sql.Date.valueOf(u.getFechaRegistro()));
            
            ps.executeUpdate();
            System.out.println("Registrado con exito");
            return true;
        }
        catch(SQLException e){
            System.out.println("Error al registrar: " + e.getMessage());
            return false;
        }
    }
    
}
