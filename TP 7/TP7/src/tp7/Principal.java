
package tp7;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        int facto=-3 ;
        for (int i =facto-1 ;i>=1;i--){
            facto *=i;
        }
        System.out.println("FACTO: "+facto);
        //////////////// 4. Animales y comportamiento sobrescrito
        ArrayList<Animal> animales = new ArrayList<>();
        
        Perro p1 = new Perro();
        Gato g1 = new Gato();
        Vaca v1 = new Vaca();
        
        animales.add(p1);
        animales.add(g1);
        animales.add(v1);
        
        for (Animal a : animales) {
            a.hacerSonido();
        }
        
        //////////////// 3. Empleados y polimorfismo
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        EmpleadoPlanta emp1 = new EmpleadoPlanta();
        EmpleadoPlanta emp2 = new EmpleadoPlanta();
        EmpleadoPlanta emp3 = new EmpleadoPlanta();
        EmpleadoTemporal emp4 = new EmpleadoTemporal();
        EmpleadoTemporal emp5 = new EmpleadoTemporal();
        
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);
        empleados.add(emp5);
        
        int i=0;
        for (Empleado e : empleados) {
            System.out.println("El "+e.getClass().getSimpleName()+" nro "+i+
                    " tiene un sueldo de "+e.calcularSueldo(e));            
            i++;
        }
        
        ///////////// 2. Figuras geométricas y métodos abstractos
        ArrayList<Figura> figuras= new ArrayList<>();
        figuras.add(new Circulo("circulo 1", 8));
        figuras.add(new Circulo("circulo 2", 5.4));
        figuras.add(new Rectangulo("rectangulo 1", 5.4,6.8));
        figuras.add(new Circulo("circulo 3", 81));
        figuras.add(new Rectangulo("rectangulo 2", 10, 2.15));
        figuras.add(new Circulo("circulo 4", 3.5));
        
        for (Figura f : figuras) {
            System.out.println("Area "+f.getNombre()+": "+f.calcularArea());
        }
        
        ///////////// 1. Vehículos y herencia básica
        Auto auto= new Auto(5, "Fiat", "Diavlo");
        
        auto.mostrarInfo();
        
        
        
    }
    
}
