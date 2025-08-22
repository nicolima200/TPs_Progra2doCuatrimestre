
package descuentoespecial;

import java.util.Scanner;
public class DescuentoEspecial {
    
    final static double EJEMPLOENTRADASALIDA=0.10;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double precio, precioFinal, descuento;
        
        System.out.print("Ingresa el precio: ");
        precio = Double.parseDouble(scan.nextLine());
        
        descuento= calcularDescuentoEspecial(precio);
        precioFinal = precio - descuento;
        
        System.out.println("El descuento especial aplicado es: "+ descuento);
        System.out.println("El precio final con descuento es: "+ precioFinal);
    }
    static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado=precio * EJEMPLOENTRADASALIDA;
        return descuentoAplicado;
    }
}
