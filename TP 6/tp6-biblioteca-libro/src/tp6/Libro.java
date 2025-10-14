package tp6;

class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
    
    public void mostrarInfo(){
        System.out.println("ISBN: "+isbn+" "+"Título: "+titulo+" "+"Año: "+String.valueOf(anioPublicacion)+" "+autor);
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
    
    @Override
    public String toString() {
        return "ISBN:" + isbn + ", Título:" + titulo + ", Año de public.:" + anioPublicacion+'}';
    }
    
    
}
