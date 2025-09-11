package tp4.poo.ii;

public class Principal {

     public static void main(String[] args) {
         System.out.println("Empleados: "+Empleado.mostrarTotalEmpleados()); // Verificamos el total de empleados
         System.out.println("-------------------------------------------------------------------------");
                  
         Empleado emp1 = new Empleado(58,"Jorge","Presidente",2000); //Creamos una instancia de la clase Empleado con 4 argumentos
         System.out.println(emp1.toString()); // Mostramos la instancia 'emp1' 
         emp1.actualizarSalario(4150); // Aumentamos en una suma fija el salario con el método actualizarSalario()
         System.out.println(emp1); // Mostramos de nuevo la info de la instancia
         System.out.println("Empleados: "+Empleado.mostrarTotalEmpleados()); // Verificamos el total de empleados
         
         System.out.println("-------------------------------------------------------------------------");
                  
         Empleado emp2 = new Empleado("Ariel","CEO"); // Utilizamos el constructor con 2 argumentos (nombre y puesto)
         System.out.println(emp2);
         emp2.actualizarSalario(1);
         System.out.println(emp2);
         System.out.println("Empleados: "+Empleado.mostrarTotalEmpleados());
         
         System.out.println("-------------------------------------------------------------------------");
         
         Empleado emp3 = new Empleado(60, "Pepe","Chofer", 1000);
         System.out.println(emp3);
         emp3.actualizarSalario(50.00);// Aumentamos en un porcentaje el salario con el método actualizarSalario()
         System.out.println(emp3);
         System.out.println("Empleados: "+Empleado.mostrarTotalEmpleados());
                  
    }
    
}
