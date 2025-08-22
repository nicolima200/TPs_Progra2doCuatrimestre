
package validanota;

import java.util.Scanner;
public class ValidaNota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;
        
        do{
            System.out.print("Ingrese una nota: ");
            nota = Integer.parseInt(scan.nextLine());
            if (nota <0 || nota >10){
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
                System.out.println("");
            }
        }while (nota <0 || nota >10);
        System.out.println("Nota guardada correctamente");
    }
    
}
