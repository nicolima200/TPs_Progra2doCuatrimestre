
package tpclases;

public class Principal {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre= "Axel";
        estudiante1.apellido= "Caledonia";
        estudiante1.curso="4to B";
        estudiante1.calificacion=7.00;
        
        estudiante1.mostrarInfo();
        estudiante1.bajarCalificacion(4);
        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion(6);
        estudiante1.mostrarInfo();
    }
    
}
