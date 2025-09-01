/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotas;

/**
 *
 * @author nicol
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Especie: "+especie);
        System.out.println("Edad: "+edad);
        System.out.println("");
    }
    
    void cumplirAnios(){
        edad+=1;
        System.out.println(nombre+" cumplió años!!");
        System.out.println("");
    }
}
