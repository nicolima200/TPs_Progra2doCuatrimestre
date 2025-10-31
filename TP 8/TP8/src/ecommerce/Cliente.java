package ecommerce;

public class Cliente implements Notificable{
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificarCliente(String notificacion) {
        System.out.println(nombre+"!, ahora el estado de tu pedido es "+notificacion);
    }
}
