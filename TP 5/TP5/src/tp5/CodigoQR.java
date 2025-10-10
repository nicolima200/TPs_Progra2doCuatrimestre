package tp5;

public class CodigoQR {
    private String valor;
    private UsuarioQR usuario;

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    public void setUsuario(UsuarioQR usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "CodigoQR{" + "valor=" + valor + ", usuario=" + usuario + '}';
    }
    
    
}
