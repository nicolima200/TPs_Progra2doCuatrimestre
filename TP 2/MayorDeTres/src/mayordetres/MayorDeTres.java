/*Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.  
Ejemplo de entrada/salida: 
Ingrese el primer número: 8 
Ingrese el segundo número: 12 
Ingrese el tercer número: 5 
El mayor es: 12 
*/
package mayordetres;

import java.util.Scanner;
public class MayorDeTres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mayor,num,i;
        
        System.out.print("Ingrese el 1° número: ");
        mayor=Integer.parseInt(scan.nextLine());
        
        for (i = 2; i <= 3; i++){
            System.out.print("Ingrese el "+i+"° "+"número: ");
            num = Integer.parseInt(scan.nextLine());
            
            if (num > mayor){
            mayor=num;
            }
        }
        
        System.out.println("El mayor es: "+ mayor);
    }
    
}
