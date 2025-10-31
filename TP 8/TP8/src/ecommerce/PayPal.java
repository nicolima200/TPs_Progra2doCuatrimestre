package ecommerce;

public class PayPal implements PagoConDescuento{

    @Override
    public double aplicarDescuento(double monto) {
        //Descuento del 20%
        return monto*0.80;
    }

    @Override
    public void procesarPago(double monto) {
        double total = aplicarDescuento(monto);
        System.out.println("Su pago con descuento es: "+total);
        System.out.println("Pago realizado con éxito.");
    }
    
    
}
