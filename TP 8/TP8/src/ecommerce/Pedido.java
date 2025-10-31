package ecommerce;

import java.util.ArrayList;

public class Pedido implements Pagable{
    private ArrayList<Producto> productos;
    private String estado;
    private Cliente cliente;

    public Pedido(String estado, Cliente cliente) {
        this.estado = estado;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    
    @Override
    public double calcularTotal() {
        double total=0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }
    
    public void notificarCliente(String notificacion){
        this.estado=notificacion;
        cliente.notificarCliente(notificacion);
    }
}
