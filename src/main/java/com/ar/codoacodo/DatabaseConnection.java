package com.ar.codoacodo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // atributos de la clase DatabaseConnection
    private static final String URL = "jdbc:mysql://localhost:3306/peliculas cac";
    private static final String USER = "root";
    private static final String PASSWORD = "";
     
    // ESTE METODO AL SER STATIC NO PERTECE A NINGUN OBJETO, PERTENECE A LA CLASE
    // POR LO TANTO SE LO LLAMA CON EL NOMBRE DE LA CLASE DatabaseConnection.getConnection()
    // Integer.parseInt("123") // Integer es la clase y parseInt es un metodo static
    public static Connection getConnection() {
        // creo null un objeto de tipo connection (java.sql.Connection;)
        Connection connection = null;
        try {
            // DriverManager es una clase de java.sql.DriverManager
            // este getConnection, es un metodo static de la clase DriverManager
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión a la base de datos establecida.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return connection;
    }

    public static void main(String[] args) {
        // Prueba de conexión
        Connection conn = DatabaseConnection.getConnection();
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
