
package stock;

import java.util.Scanner;
public class Stock {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stockActual, stockRec, stockVen, nuevoStock;
        
        System.out.print("Ingrese el stock actual: ");
        stockActual = Integer.parseInt(scan.nextLine());
        
        System.out.print("Ingrese el stock vendido: ");
        stockVen = Integer.parseInt(scan.nextLine());
        
        System.out.print("Ingrese el stock recibido: ");
        stockRec = Integer.parseInt(scan.nextLine());
        
        nuevoStock=actualizarStock(stockActual, stockVen, stockRec);   
        
        System.out.println("NUEVO STOCK DEL PRODUCTO: "+nuevoStock);
    }
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida; 
        return nuevoStock;
    }
}
