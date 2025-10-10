package tp5;

class TitularCuenta {
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;

    public TitularCuenta(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        if(cuentaBancaria !=null && cuentaBancaria.getTitular() != this){
            cuentaBancaria.setTitular(this);
        }
    }

    @Override
    public String toString() {
        return "TitularCuenta{" + "nombre=" + nombre + ", dni=" + dni + ", cuentaBancaria CBU=" + cuentaBancaria.getCbu() + '}';
    }
    
       
    
}
