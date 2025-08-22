/*Suma de Números Pares (while).  
Escribe un programa que solicite números al usuario y sume solo los números pares. 
El ciclo debe continuar hasta que el usuario ingrese el número 0, 
momento en el que se debe mostrar la suma total de los pares ingresados. 
*/
package sumapares;

import java.util.Scanner;
public class SumaPares {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num,suma =0;
        
        do {
            System.out.print("Ingresa un número: ");
            num = Double.parseDouble(scan.nextLine());
            
           if (num % 2 == 0){
               suma+=num;
           }
            
        }while (num != 0);
        System.out.println("Suma TOTAL: "+suma);
    }
    
}
