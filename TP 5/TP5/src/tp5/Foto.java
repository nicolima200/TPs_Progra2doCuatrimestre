package tp5;

public class Foto {
    private String formato;
    private String imagen;
    
    public Foto(String formato, String imagen){
        this.formato=formato;
        this.imagen=imagen;
    }

    public String getFormato() {
        return formato;
    }

    public String getImagen() {
        return imagen;
    }

    @Override
    public String toString() {
        return "Foto{" + "imagen=" + imagen + '}';
    }
    
    
}
