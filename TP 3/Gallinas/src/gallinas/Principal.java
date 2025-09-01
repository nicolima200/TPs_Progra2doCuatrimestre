
package gallinas;

public class Principal {

    public static void main(String[] args) {
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        
        gallina1.idGallina=1;
        gallina1.envejecer(4);
        gallina1.ponerHuevo(8);
        
        
        gallina2.idGallina=2;
        gallina2.envejecer(3);
        gallina2.ponerHuevo(6);
        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
    }
    
}
