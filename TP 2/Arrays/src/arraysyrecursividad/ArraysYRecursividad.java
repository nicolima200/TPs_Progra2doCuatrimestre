package arraysyrecursividad;
public class ArraysYRecursividad {
    public static void main(String[] args) {
        double precios[] = {10.99,54.10,125.00,5.45,28.99,87.90,66.00,31.50,2.00,46.75};
        
        System.out.println("Precios originales: ");
        mostrarPrecios(precios);
        
        System.out.println("");
        precios[4]=1; // Modificamos el precio del elemento de índice 4 . Nuevo valor: 1
        System.out.println("-----------------------------------------------------------------------------------");
        
        System.out.println("Precios modificados: ");
        mostrarPrecios(precios);
        
        System.out.println("");
    }
    
    //Método que recorre el array recibido como argumento y muestra los elementos por pantalla.
    static void mostrarPrecios(double[] precios){ 
        for (double precio:precios){
            System.out.print("$"+precio+", ");
        }
    }
}
