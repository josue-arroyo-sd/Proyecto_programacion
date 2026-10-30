package com.mycompany.proyectofinal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author josue_arroyo
 */
public class ConexionBD {
    
    private final String URL = "jdbc:mysql://localhost/BDproductos";
    private final String USER = "josue_arroyo";
    private final String PASSWD = "Qds15$Pn&*";
    
    public Connection Conectar() {
        Connection conectarserver = null;
        
        try{
            conectarserver = DriverManager.getConnection(URL, USER, PASSWD);
            System.out.println("Conexión exitosa a BD");
        } catch (SQLException error) {
            System.out.println("Error, no hay conexión a BD");
            System.out.println(error.getMessage());
        }
        return conectarserver;
    }
    
}

