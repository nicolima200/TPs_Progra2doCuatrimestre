package ecommerce;

public class TarjetaDeCredito implements Pago{

    @Override
    public void procesarPago(double monto) {
        System.out.println("Total a pagar: "+monto);
        System.out.println("Pago realizado con éxito.");
    }
    
}
