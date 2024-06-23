package com.ar.codoacodo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    private String URL;
    private String USER ;
    private String PASSWORD;

    public conexion(String URL, String USER, String PASSWORD) {
        this.URL = URL;
        this.USER = USER;
        this.PASSWORD = PASSWORD;

    }
   
    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión a la base de datos establecida.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return connection;
    }

   /* public static void main(String[] args) {
        Conexion con = new Conexion("jdbc:mysql://localhost:3306/peliculas_cac_java", "root", "");
        con.getConnection();
        // Prueba de conexión
        //Connection conn = DatabaseConnection.getConnection();
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
   */

}
