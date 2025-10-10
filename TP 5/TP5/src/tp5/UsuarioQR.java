package tp5;

class UsuarioQR {
    private String nombre;
    private String email;

    public UsuarioQR(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UsuarioQR{" + "nombre=" + nombre + ", email=" + email + '}';
    }
    
}
