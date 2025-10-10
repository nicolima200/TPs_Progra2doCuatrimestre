package tp5;

public class Reserva {
    private String fecha;
    private String hora;
    private ClienteReserva cliente;
    private Mesa mesa;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(ClienteReserva cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", \n   -" + cliente.toString() + ", \n   -mesa=" + mesa.toString() + '}';
    }
    
    
}
