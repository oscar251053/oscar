package com.ar.codoacodo;

import java.sql.Connection; // Importa la clase Connection para manejar la conexión a la base de datos.
import java.sql.PreparedStatement; // Importa la clase PreparedStatement para ejecutar consultas SQL precompiladas.
import java.sql.ResultSet; // Importa la clase ResultSet para manejar los resultados de las consultas SQL.
import java.sql.SQLException; // Importa la clase SQLException para manejar excepciones de SQL.
import java.util.ArrayList; // Importa la clase ArrayList para usar listas dinámicas.
import java.util.List; // Importa la interfaz List para trabajar con listas.

public class peliculaDAO { // Declara la clase PeliculaDAO.

    // Define la consulta SQL para insertar una nueva película en la tabla 'peliculas'.
    private static final String INSERT_PELICULA_SQL = "INSERT INTO peliculas (id_pelicula, titulo, duracion, genero, imagen) VALUES (?, ?, ?, ?, ?)";

    // Define la consulta SQL para seleccionar todas las películas de la tabla 'peliculas'.
    private static final String SELECT_ALL_PELICULAS_SQL = "SELECT * FROM peliculas";

    // Método para insertar una película en la base de datos., este es un method de objeto, necesito crear un objeto para poder usarlo
    public void insertPelicula(Pelicula pelicula) {
        // Usa try-with-resources para asegurar que los recursos se cierran automáticamente.
        try (Connection connection = DatabaseConnection.getConnection(); // Obtiene una conexión a la base de datos.
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PELICULA_SQL)) { // Prepara la consulta SQL para insertar la película.
            preparedStatement.setString(2, pelicula.getTitulo());
            preparedStatement.setString(3, pelicula.getDirector());
            preparedStatement.setString(4, pelicula.getElenco());
            preparedStatement.setString(5, pelicula.getGenero());
            preparedStatement.setString(6, pelicula.getDuracion());
            preparedStatement.setString(7, pelicula.getSinopsis());
            preparedStatement.setString(8, pelicula.getFechaDeEstreno()); // Establece el valor del segundo parámetro (titulo).
            preparedStatement.setString(9, pelicula.getClasificacion()); // Establece el valor del cuarto parámetro (genero).
            preparedStatement.setString(10, pelicula.getImagen()); // Establece el valor del quinto parámetro (imagen).

            int result = preparedStatement.executeUpdate(); // Ejecuta la consulta y devuelve el número de filas afectadas.
            if (result > 0) {
                System.out.println("Pelicula insertada exitosamente."); // Imprime un mensaje si la inserción fue exitosa.
            } else {
                System.out.println("Error al insertar la pelicula."); // Imprime un mensaje si hubo un error en la inserción.
            }
        } catch (SQLException e) {
            System.err.println("Error al insertar la pelicula: " + e.getMessage()); // Maneja cualquier excepción SQL y muestra el mensaje de error.
        }
    }

    // Método para obtener todas las películas de la base de datos.
    public List<Pelicula> getAllPeliculas() {
        List<Pelicula> peliculas = new ArrayList<>(); // Crea una lista para almacenar las películas.
        // Usa try-with-resources para asegurar que los recursos se cierran automáticamente.
        try (Connection connection = DatabaseConnection.getConnection(); // Obtiene una conexión a la base de datos.
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PELICULAS_SQL)) { // Prepara la consulta SQL para seleccionar todas las películas.
            ResultSet resultSet = preparedStatement.executeQuery(); // Ejecuta la consulta y obtiene los resultados.
            while (resultSet.next()) { // Itera sobre los resultados de la consulta.
                string idPelicula = resultSet.getInt(columnLabel: idPelicula);
                String titulo = resultSet.getString("titulo"); // Obtiene el valor de la columna 'id_pelicula'.
                String director = resultSet.getString("director"); // Obtiene el valor de la columna 'titulo'.
                String elenco = resultSet.getString("elenco");
                String genero = resultSet.getString("genero");
                String duracion = resultSet.getString("duracion");
                String sinopsis = resultSet.getString("sinopsis");
                String fechaDeEstreno = resultSet.getString("fechaDeEstreno");
                String clasificacion = resultSet.getString("clasificacion"); // Obtiene el valor de la columna 'genero'.
                String imagen = resultSet.getString("imagen"); // Obtiene el valor de la columna 'imagen'.

                Pelicula pelicula = new Pelicula(titulo, director, elenco, genero, duracion, sinopsis, fechaDeEstreno, clasificacion, imagen); // Crea un nuevo objeto Pelicula con los valores obtenidos.
                peliculas.add(pelicula); // Añade la película a la lista.
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener las peliculas: " + e.getMessage()); // Maneja cualquier excepción SQL y muestra el mensaje de error.
        }
        return peliculas; // Devuelve la lista de películas.
    }

   /* // Método principal para probar la inserción y obtención de películas.
    public static void main(String[] args) {
        peliculaDAO peliculaDAO = new peliculaDAO(); // Crea una instancia de PeliculaDAO.

        // Insertar una nueva película.
        Pelicula nuevaPelicula = new Pelicula("2", "Intensamente 2", "148", "Infantil", "intensamente2.jpg"); // Crea un nuevo objeto Pelicula.
        peliculaDAO.insertPelicula(nuevaPelicula); // Inserta la nueva película en la base de datos.

        // Obtener todas las películas.
        List<Pelicula> peliculas = peliculaDAO.getAllPeliculas(); // Obtiene todas las películas de la base de datos.
        for (Pelicula pelicula : peliculas) { // Itera sobre la lista de películas.
            System.out.println(pelicula); // Imprime la información de cada película.
        }
    }*/
}
