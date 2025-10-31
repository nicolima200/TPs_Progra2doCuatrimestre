package ecommerce;

public class PrincipalEcommerce {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Pepe");
        Cliente cliente2 = new Cliente("Juana");
        
        Pedido pedido1 = new Pedido("Pedido pendiente", cliente1);
        Pedido pedido2 = new Pedido("Pedido pendiente", cliente2);
        
        Producto prod1 = new Producto("Modem", 69500);
        Producto prod2 = new Producto("Pc Completa", 750000);
        Producto prod3 = new Producto("Teclado Gamer", 210000);
        
        pedido1.agregarProducto(prod1);
        pedido1.agregarProducto(prod3);
        
        pedido1.notificarCliente("En proceso");
        
        double total1 = pedido1.calcularTotal();
        
        PayPal pago1= new PayPal();
        
        pago1.procesarPago(total1);
        pedido1.notificarCliente("Pagado");
        
        pedido2.agregarProducto(prod1);
        pedido2.agregarProducto(prod2);
        pedido2.agregarProducto(prod3);
        
        pedido2.notificarCliente("En proceso");
        
        double total2 = pedido2.calcularTotal();
        
        TarjetaDeCredito pago2 = new TarjetaDeCredito();
        
        pago2.procesarPago(total2);
        
        pedido2.notificarCliente("Pagado");
    }
}
