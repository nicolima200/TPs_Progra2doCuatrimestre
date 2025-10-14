package tp6;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        //Creamos la colección de libros
        ArrayList<Libro> libros = new ArrayList<>();

        //Creamos la biblioteca y le pasamos como argumentos el nombre y la colección de libros.
        Biblioteca biblioteca = new Biblioteca("Alejandría", libros);
        
        //Llamamos al método auxiliar para cargar libros y autores
        cargarLibrosAutores(biblioteca);
        
        //Listamos libros con datos de autor
        System.out.println("\n--LISTA DE LIBROS");
        biblioteca.listarLibros();
        
        //Buscamos libro por ISBN
        System.out.println("\n--RESULTADO DE BÚSQUEDA POR ISBN:");
        biblioteca.buscarLibroPorIsbn("978-0-451-20576-6").mostrarInfo();
        
        //Filtramos y mostramos libros por año
        System.out.println("\n--LIBROS FILTRADOS POR AÑO:");
        biblioteca.filtrarLibrosPorAnio(1981);

        //Eliminamos un libro por su ISBN y mostramos los restantes
        System.out.println("\n--LIBRO ELIMINADO:");
        System.out.println(biblioteca.eliminarLibro("978-84-206-3312-3"));
        System.out.println("\n--LISTA DE LIBROS");
        biblioteca.listarLibros();
        
        //Cantidad total de libros
        System.out.println("\n--TOTAL DE LIBROS EN LA BIBLIOTECA:");
        System.out.println(biblioteca.obtenerCantidadLibros());
        
        //Autores disponibles
        System.out.println("\n--AUTORES DISPONIBLES EN LA BIBLIOTECA:");
        biblioteca.mostrarAutoresDisponibles();
    }
    
    public static void cargarLibrosAutores(Biblioteca biblioteca){
        //Creamos algunos autores
        Autor autor1 = new Autor("001", "Stephen King", "EE.UU.");
        Autor autor2 = new Autor("002", "Mario Puzo", "EE.UU.");
        Autor autor3 = new Autor("003", "Gabriel García Marquez", "Colombia");
        Autor autor4 = new Autor("004", "Jorge Luis Borges", "Argentina");
        Autor autor5 = new Autor("005", "Rodolfo Walsh", "Argentina");

        //Agregamos algunos libros
        biblioteca.agregarLibro("976-100-322-201-8", "Cujo", 1981, autor1);
        biblioteca.agregarLibro("978-0-451-20576-6", "El Padrino", 1969, autor2);
        biblioteca.agregarLibro("978-0-307-47472-8", "Cien años de soledad", 1967, autor3);
        biblioteca.agregarLibro("978-0-307-38706-5", "El amor en los tiempos del cólera", 1985, autor3);
        biblioteca.agregarLibro("978-84-206-3312-3", "Ficciones", 1944, autor4);
    }
}
