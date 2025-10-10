package tp5;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;
    private UsuarioDocumento usuario;

    public Documento(String titulo, String contenido, UsuarioDocumento usuario, String codigoHash, String fecha ) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.usuario = usuario;
        this.firmaDigital = new FirmaDigital(codigoHash,fecha);
    }

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", \n   -firmaDigital=" + firmaDigital + ", \n   -usuario=" + usuario + '}';
    }
    
    
}
