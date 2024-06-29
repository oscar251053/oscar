package com.ar.movies;
//Clase Película: Representa el modelo de datos.
public class Pelicula {
    // Atributos de la clase Pelicula que representan las columnas de la tabla
    private int idPelicula;  // ID autoincremental de la película (int)
    private String titulo; // Título de la película (varchar)
    private String director;
    private String elenco;
    private String genero;   // Género de la película (varchar)
    private String duracion; // Duración de la película (varchar)
    private String sinopsis;
    private String fechaDeEstreno;
    private String clasificacion;
    private String imagen;   // URL de la imagen de la película (varchar)

    // Constructor vacío necesario para deserialización de JSON
    public Pelicula() {}

    // Constructor con parámetros para inicializar todos los atributos
    public Pelicula(int idPelicula, String titulo, String director, String elenco, String genero, String duracion, String sinopsis, String fechaDeEstreno, String clasificacion, String imagen) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.director = director;
        this.elenco = elenco;
        this.genero = genero;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
        this.fechaDeEstreno = fechaDeEstreno;
        this.clasificacion = clasificacion;
        this.imagen = imagen;
    }

    // Método getter para obtener el ID de la película
    public int getIdPelicula() {
        return idPelicula;
    }

    // Método setter para establecer el ID de la película
    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    // Método getter para obtener el título de la película
    public String getTitulo() {
        return titulo;
    }

    // Método setter para establecer el título de la película
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Método getter para obtener el director de la película
    public String getDirector() {
        return director;
    }

    // Método setter para establecer el director de la película
    public void setDirector(String director) {
        this.director = director;
    }
    
    // Método getter para obtener el elenco de la película
    public String getElenco() {
        return elenco;
    }

    // Método setter para establecer el elenco de la película
    public void setElenco(String elenco) {
        this.elenco = elenco;
    }
    // Método getter para obtener el género de la película
    public String getGenero() {
        return genero;
    }

    // Método setter para establecer el género de la película
    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Método getter para obtener la duración de la película
    public String getDuracion() {
        return duracion;
    }

    // Método setter para establecer la duración de la película
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    
    // Método getter para obtener la sinopsis de la película
    public String getSinopsis() {
        return sinopsis;
    }

    // Método setter para establecer la sinopsis de la película
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
    // Método getter para obtener la fecha de estreno de la película
    public String getFechaDeEstreno() {
        return fechaDeEstreno;
    }

    // Método setter para establecer la fecha de estreno de la película
    public void setFechaDeEstreno(String fechaDeEstreno) {
        this.fechaDeEstreno = fechaDeEstreno;
    }
    
    // Método getter para obtener la clasificación de la película
    public String getClasificacion() {
        return clasificacion;
    }

    // Método setter para establecer la clasificacion de la película
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    // Método getter para obtener la imagen de la película
    public String getImagen() {
        return imagen;
    }

    // Método setter para establecer la imagen de la película
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}