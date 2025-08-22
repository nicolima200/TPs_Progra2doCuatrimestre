/*Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C). 
Luego, aplique los siguientes descuentos: 
Categoría A: 10% de descuento 
Categoría B: 15% de descuento  
Categoría C: 20% de descuento 
El programa debe mostrar el precio original, el descuento aplicado y el precio final 

Ejemplo de entrada/salida: 
Ingrese el precio del producto: 1000 
Ingrese la categoría del producto (A, B o C): B 
Descuento aplicado: 15% 
Precio final: 850.0 
 */
package descuentos;

import java.util.Locale;
import java.util.Scanner;
public class Descuentos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double precioOriginal, precioFinal, descuento;
        char cat;
        
        System.out.print("Ingrese el precio del producto: ");
        precioOriginal = Double.parseDouble(scan.nextLine().replaceAll(",", "."));
        
        System.out.print("Ingrese la categoría ('a', 'b' o 'c'): ");
        cat = Character.toLowerCase(scan.next().charAt(0));
        
        if (cat == 'a' || cat=='b' || cat=='c'){
            descuento = calcularDescuento(precioOriginal, cat);
            precioFinal = precioOriginal - descuento;
            System.out.println("Precio original: $ " + String.format("%.2f", precioOriginal));
            System.out.println("Descuento: $ -" + String.format("%.2f", descuento));
            System.out.println("PRECIO FINAL: $ " + String.format("%.2f", precioFinal));
        }else{
            System.out.println("La categoría es inválida");
        }
    }//Cierre main
    
    final static double calcularDescuento(double precio, char cat) {
        double descuento=0;
        
        switch (cat) {
            case 'a' -> descuento = precio * 0.1;
            case 'b' -> descuento = precio * 0.15;
            case 'c' -> descuento = precio * 0.2;
        }
        return descuento;
    }
}//Cierre clase
