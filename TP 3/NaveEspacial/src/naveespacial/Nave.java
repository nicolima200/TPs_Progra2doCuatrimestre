package naveespacial;

public class Nave {

    String nombre;
    private int combustible;

    void despegar() {
        System.out.println("Intentar despegue...");
        if (combustible > 0){
            System.out.println("La nave ha despegado!!");
            System.out.println("    ");
        }else{
            System.out.println("Combustible insuficiente para despegar! Recarga!");
            System.out.println("");
        }
    }

    void avanzar(int distancia) {
        if (distancia > 0){
            if (combustible >= distancia){
                combustible -= distancia;
                System.out.println("La nave se ha movido "+distancia+" unidades.");
                System.out.println("");
            }else{
                System.out.println("El combustible no es suficiente para avanzar "+distancia+" unidades.");
                System.out.println("");
            }
          
        }else{
            System.out.println("La distancia debe ser positiva!");
            System.out.println("");
        }
    }

    void recargarCombustible(int cantidad) {
        if (cantidad >0){
            combustible+=cantidad;
            System.out.println("Recarga completada.");
            System.out.println("");
            
            if (combustible > 50){
                combustible = 50;
            }
            
        }else{
            System.out.println("Ingrese un valor positivo.");
        }
    }

    void mostrarEstado() {
        System.out.println("//// ESTADO DE LA NAVE ////");
        System.out.println("Nombre de la nave: "+nombre);
        System.out.println("Combustible: "+combustible+" lts.");
        System.out.println("");
    }
}
