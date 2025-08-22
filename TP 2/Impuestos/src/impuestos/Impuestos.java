
package impuestos;

import java.util.Scanner;
public class Impuestos {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       double precio,impuesto, descuento;
       
        System.out.print("Ingresa el precio base: ");
        precio = Double.parseDouble(scan.nextLine());
        
        System.out.print("Ingresa el porcentaje de impuesto: ");
        impuesto = ((Double.parseDouble(scan.nextLine()))/100) +1;
        
        System.out.print("Ingresa el porcentaje de descuento: ");
        descuento = ((Double.parseDouble(scan.nextLine()))/100) +1;
        
        System.out.println("PRECIO FINAL: "+ calcularPrecioFinal(precio, impuesto, descuento));
    }
    
    final static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
        double precioFinal=precioBase + precioBase*impuesto - precioBase*descuento;
        return precioFinal;
    }
}
