package tpclases;
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Curso: "+curso);
        System.out.println("Calificación: "+calificacion);
        System.out.println("");
    }
    
    void subirCalificacion(double puntos){
        calificacion+=puntos;
        System.out.println("La calificacion subió "+puntos+"puntos.");
        System.out.println("Nueva calificación: "+calificacion);
        System.out.println("");
    }
    
    void bajarCalificacion(double puntos){
        calificacion-=puntos;
        System.out.println("La calificacion bajó "+puntos+"puntos.");
        System.out.println("Nueva calificación: "+calificacion);
        System.out.println("");
    }
}
