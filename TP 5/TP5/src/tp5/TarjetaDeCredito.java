package tp5;
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if(cliente != null && cliente.getTarjetaDeCredito() != this){
            cliente.setTarjetaDeCredito(this);
        }
    }
    
    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + 
                fechaVencimiento + ", banco=" + banco.getNombre() + ", cliente=" + cliente.getNombre() + '}';
    }
    
    
}
