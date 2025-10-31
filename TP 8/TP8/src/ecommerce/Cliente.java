package ecommerce;

public class Cliente implements Notificable{
    private String notificacion;

    @Override
    public void setNotificacion(String notificacion) {
        this.notificacion=notificacion;
    }
}
