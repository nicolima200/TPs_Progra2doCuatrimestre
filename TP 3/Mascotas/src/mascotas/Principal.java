
package mascotas;


public class Principal {

    public static void main(String[] args) {
        Mascota mascota1= new Mascota();
        
        mascota1.nombre= "Pepe";
        mascota1.especie= "Lorito";
        mascota1.edad=9;
        
        mascota1.mostrarInfo();
        
        mascota1.cumplirAnios();
        mascota1.cumplirAnios();
        
        mascota1.mostrarInfo();
    }
    
}
