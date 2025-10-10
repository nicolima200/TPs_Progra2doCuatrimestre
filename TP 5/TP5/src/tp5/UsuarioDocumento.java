package tp5;

class UsuarioDocumento {
    private String nombre;
    private String email;

    public UsuarioDocumento(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UsuarioDocumento{" + "nombre=" + nombre + ", email=" + email + '}';
    }
    
}
