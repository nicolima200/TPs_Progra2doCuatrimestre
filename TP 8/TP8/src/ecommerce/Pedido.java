package ecommerce;

import java.util.ArrayList;

public class Pedido implements Pagable, Pago, PagoConDescuento{
    private ArrayList<Producto> productos;

    @Override
    public void calcularTotal() {
    }

    @Override
    public double procesarPago() {
        return 0.00;
    }

    @Override
    public double aplicarDescuento() {
        return 0.00;
    }
    
    public void notificarCliente(Cliente cliente, String notificacion){
        cliente.setNotificacion(notificacion);
    }
}
