package tp6;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre, ArrayList<Libro> libros) {
        this.nombre = nombre;
        this.libros = libros;
    }
    
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor){
        Libro nuevoLibro = new Libro(isbn,titulo,anioPublicacion,autor);
        libros.add(nuevoLibro);
    }
    
    public void listarLibros(){
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn){
        for (Libro libro : libros) {
            if(libro.getIsbn().equalsIgnoreCase(isbn)){
                return libro;
            }
        }
        return null;
    }
    
    public Libro eliminarLibro(String isbn){
        Libro libroAEliminar=buscarLibroPorIsbn(isbn);
        libros.remove(libroAEliminar);
        return libroAEliminar;
    }
    
    public int obtenerCantidadLibros(){
        return libros.size();
    }
    
    public void filtrarLibrosPorAnio(int anio){
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio){
                libro.mostrarInfo();
            }
        }
        }
    
    public void mostrarAutoresDisponibles(){
        for (Libro libro : libros) {
            System.out.println(libro.getAutor());
        }
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "nombre=" + nombre + ", libros=" + libros + '}';
    }
    
    
}
