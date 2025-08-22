/*
Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto. 
Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400. 
Ejemplo de entrada/salida: 
Ingrese un año: 2024 
El año 2024 es bisiesto. 
Ingrese un año: 1900 
El año 1900 no es bisiesto. 
*/

package aniobisiesto;

import java.util.Scanner;
public class AnioBisiesto {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int anio;
        
        System.out.println("Ingrese un año: ");
        anio=Integer.parseInt(scan.nextLine());
        
        if ((anio % 4 ==0 && anio % 100 != 0) || (anio % 400 == 0)){
            System.out.println("Es bisiesto");
        }
        else{
                System.out.println("No es Bisiesto");
        }
    }
}
