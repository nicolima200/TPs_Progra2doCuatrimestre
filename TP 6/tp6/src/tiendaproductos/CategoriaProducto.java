package tiendaproductos;

public enum CategoriaProducto {

    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar"),
    OTROS("Prueba de categoría vacía");
    
    private final String descripcion;

    private CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion(CategoriaProducto categoria) {
        return descripcion;
    }

    @Override
    public String toString() {
        return "CategoriaProducto{" + "name=" + name() + ", descripcion=" + descripcion + '}';
    }
    
    
}
