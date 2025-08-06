import java.util.Scanner;
public class Operaciones {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        a=Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo número: ");
        b=Integer.parseInt(input.nextLine());
        
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + ((double)a / b));
    }
    
}
