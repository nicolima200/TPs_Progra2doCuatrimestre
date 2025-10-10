package tp4.poo.ii;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados=0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        totalEmpleados++;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    
    public Empleado(String nombre, String puesto){
        
        this(9999, nombre, puesto, 2500.00);
    }
    
    public void actualizarSalario(double porcentaje){
        if (porcentaje>0){
            this.salario+=salario*(porcentaje/100);
        }
    }
    
    public void actualizarSalario(int aumento){
        if (aumento>0){
            this.salario+=aumento;
        }
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + 
                ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }    
    
}
