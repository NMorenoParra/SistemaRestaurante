package com.mycompany.sistemarestaurante.crud;

import java.sql.*;

public class ConexionBD {
    static String url = "jdbc:mysql://localhost:3306/Restaurante";
    static String user = "root";
    static String password = "";
    
    public static Connection conectar(){
        Connection c = null;
        try{
            c = DriverManager.getConnection(url,user,password);
            System.out.println("Conexion exitosa");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return c;
    }
}
