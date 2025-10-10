package tp5;

class ClienteReserva {
    private String nombre;
    private String telefono;

    public ClienteReserva(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "ClienteReserva{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
}
