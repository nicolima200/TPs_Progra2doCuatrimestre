/*Contador de Positivos, Negativos y Ceros (for).  
Escribe un programa que pida al usuario ingresar 10 números enteros y cuente cuántos son positivos, negativos y cuántos son ceros. 
*/
package contadorposnegceros;

import java.util.Scanner;
public class ContadorPosNegCeros {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num,i;
        int neg=0,pos=0,cero=0;
        
        for (i=1; i<=10; i++){
            System.out.print("Ingresa un número: ");
            num= Integer.parseInt(scan.nextLine());
            
            if (num >0){
                pos+=1;
            }else if (num<0){
                neg+=1;
            }else{
                cero+=1;
            }
        }
        System.out.println("");
        System.out.println("Positivos: "+pos);
        System.out.println("Negavos: "+neg);
        System.out.println("Ceros: "+cero);
    }
    
}
