
package libros;

public class Principal {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        
        libro1.setTitulo("El señor de los anillos");
        libro1.setAutor("Borge Luis Jorges");
        libro1.setAnioPublicacion(-150);
        
        System.out.println("Titulo: "+libro1.getTitulo());
        System.out.println("Autor: "+libro1.getAutor());
        System.out.println("Año publicación: "+libro1.getAnioPublicacion());
        System.out.println("");

        libro1.setAnioPublicacion(1998);
        
        System.out.println("Titulo: "+libro1.getTitulo());
        System.out.println("Autor: "+libro1.getAutor());
        System.out.println("Año publicación: "+libro1.getAnioPublicacion());
    }
    
}
