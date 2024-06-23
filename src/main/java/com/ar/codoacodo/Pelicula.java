package com.ar.codoacodo;

public class Pelicula {
    // primero definimos los atributos(variables) que van a formar parte de la plantilla pelicula
    
    private String titulo;
    private String director;
    private String elenco;
    private String genero;
    private String duracion;
    private String sinopsis;
    private String fechaDeEstreno;
    private String clasificacion;
    private String imagen;

    // Constructor// instanciar un objeto en memoria, o referenciar un objeto en memoria
    public Pelicula() {
        // no recibe ningun parametro y no hace nada
    }
    public Pelicula(String titulo, String director, String elenco, String genero, String duracion, String sinopsis, String fechaDeEstreno, String clasificacion, String imagen) {
        // la palabra reservada this hace referencia a los atributos de la clase, del objeto que se esta creando en ese momento 
        
        this.titulo = titulo;
        this.director = director;
        this.elenco = elenco;
        this.genero = genero;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
        this.genero = fechaDeEstreno;
        this.clasificacion = clasificacion;
        this.imagen = imagen;
    }

    // Getters // siempre retornan el tipo de dato del atributo y no reciben ningun valor,
    // y desde donde se los llama se puede guardar ese valor en una variable
    
    public String getTitulo() {
        return titulo;
    }
    public String getDirector() {
        return director;
    }
    public String getElenco() {
        return elenco;
    }
    public String getGenero() {
        return genero;
    }
    public String getDuracion() {
        return duracion;
    }
    public String getSinopsis() {
        return sinopsis;
    }
    public String getFechaDeEstreno() {
        return fechaDeEstreno;
    }
    public String getClasificacion() {
        return clasificacion;
    }
    public String getImagen() {
        return imagen;
    }

    // Setters // no devuelven nada, porque lo que hacen es modificar el dato del atributo en memoria del objeto
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setElenco(String elenco) {
        this.elenco = elenco;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    public void setFechaDeEstreno(String fechaDeEstreno) {
        this.fechaDeEstreno = fechaDeEstreno;
    }
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    // toString method
    @Override
    public String toString() {
        return "Pelicula{" +
                ", titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", elenco='" + elenco + '\'' +
                ", genero='" + genero + '\'' +
                ", duracion='" + duracion + '\'' +
                ", sinopsis='" + sinopsis + '\'' +
                ", fechaDeEstreno='" + fechaDeEstreno + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
