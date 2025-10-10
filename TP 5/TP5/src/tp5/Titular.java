package tp5;

public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;
    
    public Titular(String nombre, String dni){
        if (nombre != null && !nombre.equals("")){
            if (dni != null && !dni.equals("")){
                this.nombre=nombre;
                this.dni=dni;
            }else{
                System.out.println("Ingrese un DNI válido.");
            }
        }else{
            System.out.println("Ingrese un nombre válido.");
        }
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }
    
    public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte=pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this){
            pasaporte.setTitular(this);
        }   
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", pasaporte=" + pasaporte + '}';
    }
    
    
}
