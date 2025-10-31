package excepciones;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        ///////////////////////////// 1. DIVISOR
        System.out.println("====DIVISION====");
        int a,b,c;
        Scanner input=new Scanner(System.in);
        
        System.out.println("Ingrese el dividendo:");
        a = Integer.parseInt(input.nextLine());

        System.out.println("\nIngrese el divisor:");
        b = Integer.parseInt(input.nextLine());
        
        try{
            c=a/b;
            System.out.println("RESULTADO: "+c);
        }catch(ArithmeticException ae){
            System.out.println("El divisor no puede ser cero!");
        }
        
        ///////////////////////////// 2. CONVERSIÓN DE CADENA A NÚMERO
        System.out.println("\n====CONVERSION====");
        System.out.println("\nIngrese un numero entero: ");
        try{
            c= Integer.parseInt(input.nextLine());
            System.out.println("String convertido exitosamente!");
        }catch(NumberFormatException nfe){
            System.out.println("No es un entero! Ingrese un valor válido");
        }
        System.out.println("Adios");
        
        ///////////////////////////// 3. LECTURA DE ARCHIVO
        //RUTA CORRECTA "C:\\Users\\nicol\\Documents\\2025 TUPaD\\2do cuatrimestre\\2-Programación 2\\Trabajos_practicos\\TP8\\src\\excepciones\\newfile.txt"
        System.out.println("\n====LECTURA ARCHIVO: ====");
        String ruta="C:\\Users\\nicol\\Documents\\2025 TUPaD\\2do cuatrimestre\\2-Programación 2\\Trabajos_practicos\\TP8\\src\\excepciones\\newfile.txt";
        try{
            VisorDeTxt.mostrarTxt(ruta);
        }catch(IOException ioe){
            System.out.println("Hubo un error: "+ioe.getMessage());
        }
        
        ///////////////////////////// 4. EDAD INVALIDA
        System.out.println("\n====EDAD INVALIDA ====");
        int edad = Integer.parseInt(input.nextLine());
        
        if(edad < 0 || edad > 120){
            System.out.println("La edad debe ser mayor a 0 y menor de 120.");
            throw new EdadInvalidaException("Edad inválida. Fuera de rango");
        }else{
            System.out.println("Edad OK");
        }
        
        ///////////////////////////// 5. TRY WITH RESOURCES
        System.out.println("\n====TRY WITH RESOURCES: ====");
        //RUTA CORRECTA "C:\\Users\\nicol\\Documents\\2025 TUPaD\\2do cuatrimestre\\2-Programación 2\\Trabajos_practicos\\TP8\\src\\excepciones\\newfile.txt"
        ruta="C:\\Users\\nicol\\Documents\\2025 TUPaD\\2do cuatrimestre\\2-Programación 2\\Trabajos_practicos\\TP8\\src\\excepciones\\newfiles.txt";
        VisorDeTxt.mostrarTxtWithResources(ruta);
    }
}
