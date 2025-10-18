package tp7;

public abstract class Empleado {
    public double calcularSueldo(Empleado e){
        if (e instanceof EmpleadoPlanta){
            return 800;
        }else if(e instanceof EmpleadoTemporal){
            return 500;
        }else{
            return 0;
        }
    }
}
