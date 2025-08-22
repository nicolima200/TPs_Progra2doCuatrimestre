
package costoenvío;

import java.util.Scanner;
public class CostoEnvío {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double peso, precio, envio, precioFinal;
        String zona;
        
        System.out.print("Ingrese el PRECIO del producto: ");
        precio = Double.parseDouble(scan.nextLine());
        
        System.out.print("Ingrese el PESO del producto: ");
        peso = Double.parseDouble(scan.nextLine());
        
        System.out.print("Ingrese la ZONA de envío (nacional o internacional): ");
        zona = scan.nextLine();
                
        envio = calcularCostoEnvio(peso, zona);
        precioFinal = calcularTotalCompra(precio, envio);
        
        System.out.println("El costo de envío es:  $ "+envio);
        System.out.println("El total a pagar es:  $ "+precioFinal);
    }//Cierre main
    public static double calcularCostoEnvio(double peso, String zona){
        double costo;
        if (zona.equalsIgnoreCase("nacional") ){
            costo=peso * 5;
        }else if (zona.equalsIgnoreCase("internacional") ){
            costo = peso * 10;
        }else{
            System.out.println("¡¡¡ ZONA NO VÁLIDA !!!");
            return 00000.0000;
        }
        return costo;
    }
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double precioFinal = precioProducto + costoEnvio;
        return precioFinal;
    }
}// Cierre clase
