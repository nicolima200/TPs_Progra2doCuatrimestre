package tp5;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private TitularCuenta titular;

    public CuentaBancaria(String cbu, double saldo, String codigo, String ultiModif) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultiModif);
    }

    public TitularCuenta getTitular() {
        return titular;
    }

    public void setTitular(TitularCuenta titular) {
        this.titular = titular;
        if(titular != null && titular.getCuentaBancaria() != this){
            titular.setCuentaBancaria(this);
        }
    }

    public String getCbu() {
        return cbu;
    }
    
    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", claveSeguridad=" + claveSeguridad + ", titular=" + titular + '}';
    }
    
    
}
