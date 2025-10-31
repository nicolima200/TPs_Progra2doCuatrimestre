package excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class VisorDeTxt {
    public static void mostrarTxt(String ruta) throws IOException{
            File elArchivo = new File(ruta);
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(elArchivo));
                System.out.println(br.readLine());
            } catch (FileNotFoundException fnfe) {
                System.out.println("Error. El archivo no fue encontrado");
            }finally {
                if(br != null){
                    try {
                    br.close();
                    }catch (IOException ex) {
                        System.out.println("No se pudo liberar el br");
                    }   
                }
            }
    }
    
    public static void mostrarTxtWithResources(String ruta){
        File archivo= new File(ruta);
        try(BufferedReader br = new BufferedReader(new FileReader(archivo));){
            System.out.println(br.readLine());
        }catch (IOException e){
            System.out.println("Error I/O: "+ e.getMessage());
            throw new RuntimeException("Error inesperado en el catch.");
        }
    }
}
