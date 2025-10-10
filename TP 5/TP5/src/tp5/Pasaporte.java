package tp5;

public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Titular titular;
    private Foto foto;

    public Pasaporte(String numero, String fechaEmision, String formatoFoto, String imagen) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(formatoFoto, imagen);
    }
        
    public Titular getTitular() {
        return this.titular;
    }

    public void setTitular(Titular titular) {
        this.titular=titular;
        if (titular != null && titular.getPasaporte()!= this){
            titular.setPasaporte(this);
        }
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + '}';
    }
    
    
}
