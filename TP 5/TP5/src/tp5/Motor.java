package tp5;

class Motor {
    private String tipo;
    private String numero;

    public Motor(String tipo, String numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Motor{" + "tipo=" + tipo + ", numero=" + numero + '}';
    }
    
    
}
