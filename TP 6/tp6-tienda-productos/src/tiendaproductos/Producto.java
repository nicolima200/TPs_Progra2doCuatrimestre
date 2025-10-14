package tiendaproductos;

public class Producto {

    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoriaProducto;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoriaProducto) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoriaProducto = categoriaProducto;
    }
    
    public void mostrarInfo() {
        System.out.println("*Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + 
                precio + ", cantidad=" + cantidad + ", categoriaProducto=" + categoriaProducto + '}');
    }

    public String getId() {
        return id;
    }

    public CategoriaProducto getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    
}
