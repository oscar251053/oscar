package com.ar.movies;

// Importaciones necesarias para la clase Controlador
import java.io.IOException;
import java.sql.Connection; // Importación de ObjectMapper de Jackson para convertir objetos Java a JSON y viceversa
import java.sql.PreparedStatement; // Importación de ServletException para manejar excepciones relacionadas con Servlets
import java.sql.ResultSet; // Importación de WebServlet para la anotación que mapea este servlet a una URL específica
import java.sql.SQLException; // Importación de HttpServlet para extender esta clase y manejar peticiones HTTP
import java.sql.Statement; // Importación de HttpServletRequest para manejar las solicitudes HTTP
import java.util.ArrayList; // Importación de HttpServletResponse para manejar las respuestas HTTP
import java.util.List; // Importación de IOException para manejar excepciones de entrada/salida

import javax.servlet.ServletException; // Importación de todas las clases JDBC para operaciones de base de datos
import javax.servlet.annotation.WebServlet; // Importación de ArrayList para manejar listas dinámicas de objetos
import javax.servlet.http.HttpServlet; // Importación de List para manejar colecciones de elementos
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

/*
 Servlets son clases Java que se ejecutan en un servidor de aplicaciones o un contenedor de servlets, como Apache Tomcat, y se utilizan para manejar peticiones y respuestas en una aplicación web.

Tomcat es un contenedor de servlets y servidor de aplicaciones web que ejecuta aplicaciones web basadas en Java.
 */

// Clase Controlador: Maneja las peticiones HTTP para insertar y recuperar películas.
@WebServlet("/peliculas") // Anotación que mapea este servlet a la URL "/peliculas"
public class Controlador extends HttpServlet { // Declaración de la clase Controlador que extiende HttpServlet
 
    // Método POST para insertar una nueva película desde una solicitud JSON
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Configurar cabeceras CORS
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
        response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");  
        Conexion conexion = new Conexion();  // Crear una nueva conexión a la base de datos
        Connection conn = conexion.getConnection();  // Obtener la conexión establecida
        try {
            ObjectMapper mapper = new ObjectMapper();  // Crear un objeto ObjectMapper para convertir JSON a objetos Java
            Pelicula pelicula = mapper.readValue(request.getInputStream(), Pelicula.class);  // Convertir el JSON de la solicitud a un objeto Pelicula
            // Consulta SQL para insertar una nueva película en la tabla 'peliculas'
            String query = "INSERT INTO peliculas (titulo, director, elenco, genero, duracion, sinopsis, fechaDeEstreno, clasificacion, imagen) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);  // Indicar que queremos obtener las claves generadas automáticamente
        
            // Establecer los parámetros de la consulta de inserción
            statement.setString(1, pelicula.getTitulo());
            statement.setString(2, pelicula.getDirector());
            statement.setString(3, pelicula.getElenco());
            statement.setString(4, pelicula.getGenero());
            statement.setString(5, pelicula.getDuracion());
            statement.setString(6, pelicula.getSinopsis());
            statement.setString(7, pelicula.getFechaDeEstreno());
            statement.setString(8, pelicula.getClasificacion());
            statement.setString(9, pelicula.getImagen());

            statement.executeUpdate();  // Ejecutar la consulta de inserción en la base de datos
        
            // Obtener las claves generadas automáticamente (en este caso, el ID de la película)
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                Long idPeli = rs.getLong(1);  // Obtener el valor del primer campo generado automáticamente (en este caso, el ID)

                // Devolver el ID de la película insertada como JSON en la respuesta
                response.setContentType("application/json");  // Establecer el tipo de contenido de la respuesta como JSON
                String json = mapper.writeValueAsString(idPeli);  // Convertir el ID a formato JSON
                response.getWriter().write(json);  // Escribir el JSON en el cuerpo de la respuesta HTTP
            }
            
            response.setStatus(HttpServletResponse.SC_CREATED);  // Configurar el código de estado de la respuesta HTTP como 201 (CREATED)
        } catch (SQLException e) {
            e.printStackTrace();  // Imprimir el error en caso de problemas con la base de datos
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);  // Configurar el código de estado de la respuesta HTTP como 500 (INTERNAL_SERVER_ERROR)
        } catch (IOException e) {
            e.printStackTrace();  // Imprimir el error en caso de problemas de entrada/salida (por ejemplo, problemas con la solicitud o respuesta HTTP)
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);  // Configurar el código de estado de la respuesta HTTP como 500 (INTERNAL_SERVER_ERROR)
        } finally {
            conexion.close();  // Cerrar la conexión a la base de datos al finalizar la operación
        }
        
    }

    // Método GET para obtener todas las películas almacenadas en la base de datos y devolverlas como JSON
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Configurar cabeceras CORS
        response.setHeader("Access-Control-Allow-Origin", "*"); // Permitir acceso desde cualquier origen
        response.setHeader("Access-Control-Allow-Methods", "*"); // Métodos permitidos
        response.setHeader("Access-Control-Allow-Headers", "Content-Type"); // Cabeceras permitidas
        Conexion conexion = new Conexion();  // Crear una nueva conexión a la base de datos
        Connection conn = conexion.getConnection();  // Obtener la conexión establecida

        try {
            // Consulta SQL para seleccionar todas las películas de la tabla 'peliculas'
            String query = "SELECT * FROM peliculas";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);  // Ejecutar la consulta y obtener los resultados

            List<Pelicula> peliculas = new ArrayList<>();  // Crear una lista para almacenar objetos Pelicula

            // Iterar sobre cada fila de resultados en el ResultSet
            while (resultSet.next()) {
                // Crear un objeto Pelicula con los datos de cada fila
                Pelicula pelicula = new Pelicula(
                    resultSet.getInt("id_pelicula"),
                    resultSet.getString("titulo"),
                    resultSet.getString("director"),
                    resultSet.getString("elenco"),  
                    resultSet.getString("genero"),
                    resultSet.getString("duracion"),
                    resultSet.getString("sinopsis"),
                    resultSet.getString("fechaDeEstreno"),
                    resultSet.getString("duracion"),
                    resultSet.getString("imagen")
                );
                peliculas.add(pelicula);  // Agregar el objeto Pelicula a la lista
            }

            ObjectMapper mapper = new ObjectMapper();  // Crear un objeto ObjectMapper para convertir objetos Java a JSON
            String json = mapper.writeValueAsString(peliculas);  // Convertir la lista de películas a formato JSON

            response.setContentType("application/json");  // Establecer el tipo de contenido de la respuesta como JSON
            response.getWriter().write(json);  // Escribir el JSON en el cuerpo de la respuesta HTTP
        } catch (SQLException e) {
            e.printStackTrace();  // Imprimir el error en caso de problemas con la base de datos
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);  // Configurar el código de estado de la respuesta HTTP como 500 (INTERNAL_SERVER_ERROR)
        } finally {
            conexion.close();  // Cerrar la conexión a la base de datos al finalizar la operación
        }
    }
}

