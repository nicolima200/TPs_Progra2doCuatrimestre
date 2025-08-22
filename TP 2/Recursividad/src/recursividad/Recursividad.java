package recursividad;

public class Recursividad {

    public static void main(String[] args) {
        double precios[] = {10.99,54.10,125.00,5.45,28.99,87.90,66.00,31.50,2.00,46.75};
        
        System.out.println("Precios originales: ");
        mostrarPrecios(precios, 0);
        System.out.println("");
        
        precios[9] = 0.0;
        
        System.out.println("Precios modificados: ");
        mostrarPrecios(precios, 0);
        
    }
    
    static void mostrarPrecios(double[] precios, int i){
        if (i == precios.length){
            return ;
        }
        System.out.println("Precio: $"+precios[i]);
        
        mostrarPrecios(precios, i+1);
    }
}
