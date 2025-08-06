/*
 4. Escribe un programa que solicite al usuario ingresar su nombre y edad,
    y luego los muestre en pantalla. Usa Scanner para capturar los datos. 
 */
import java.util.Scanner;
public class NombreEdad {

    public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner input= new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        nombre=input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad=Integer.parseInt(input.nextLine());
        
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    
}
