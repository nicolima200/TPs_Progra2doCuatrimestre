package tp7;

public class Auto extends Vehiculo{
    private int cantidadPuertas;

    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Marca: "+super.getMarca()+" - "+"Modelo: "+
                super.getModelo()+" - "+"Cant. puertas: "+cantidadPuertas);
    }
}
