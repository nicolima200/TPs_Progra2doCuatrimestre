/*Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla: 
Menor de 12 años: "Niño" 
Entre 12 y 17 años: "Adolescente" 
Entre 18 y 59 años: "Adulto" 
60 años o más: "Adulto mayor" 

Ejemplo de entrada/salida: 
Ingrese su edad: 25 
Eres un Adulto. 
Ingrese su edad: 10 
Eres un Niño. 
*/
package clasificaedad;

import java.util.Scanner;
public class ClasificaEdad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int edad;
        
        do {
            System.out.println("Para salir ingrese un número negativo.");
            System.out.print("Ingrese su edad: ");    
            edad = Integer.parseInt(scan.nextLine());
            
            if (0 <= edad && edad < 12){
                System.out.println("Niño");
            }else if (12 <= edad && edad <= 17){
                System.out.println("Adolescente");
            }else if (18 <= edad && edad <= 59){
                System.out.println("Adulto");
            }else if (edad > 60){
                System.out.println("Adulto mayor");
            }
        }
        while(edad >= 0);
        System.out.println("Hasta luego!");
    }
    
}
