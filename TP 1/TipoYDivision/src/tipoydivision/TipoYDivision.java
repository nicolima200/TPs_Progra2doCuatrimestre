/*
8.	Manejar conversiones de tipo y división en Java.  
a.	Escribe un programa que divida dos números enteros ingresados por el usuario.  
b.	Modifica el código para usar double en lugar de int y compara los resultados. 
*/

package tipoydivision;

import java.util.Scanner;
public class TipoYDivision {
    public static void main(String[] args) {
        //int a, b;
        double a, b;
        Scanner input= new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");        
        a= Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo número: ");        
        b= Integer.parseInt(input.nextLine());
                
        System.out.println(a+" / "+b+" = "+a/b);
    }
    
}
