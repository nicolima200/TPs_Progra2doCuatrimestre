
package gallinas;

public class Gallina {
    int idGallina;
    private int  edad;
    private int  huevosPuestos;
    
    void ponerHuevo(int cantidad){
        if (cantidad>0){
            huevosPuestos+=cantidad;
           
        }else{
            System.out.println("La cantidad debe ser positiva.");
            System.out.println("");
        }
    }
    
    void envejecer(int anios){
        if (anios>0){
            edad+=anios;
            System.out.println("Gallina "+idGallina+" envejeció "+anios+" años.");
            System.out.println("");
        }else{
            System.out.println("Los anios deben ser positivos.");
            System.out.println("");
        }
    }
    
    void mostrarEstado(){
        System.out.println("Id: "+idGallina);
        System.out.println("Edad: "+edad);
        System.out.println("Huevos puestos: "+huevosPuestos);
        System.out.println("");
    }
}
