package tiendaproductos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inventario {

    private ArrayList<Producto> productos = new ArrayList<>();

    //AGREGAR
    public boolean agregarProducto(Producto p) {
        productos.add(p);
        return true;
    }

    //LISTAR
    public void listarProductos() {
        System.out.println("\n--Todos los productos: ");
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }

    //BUSCAR
    public Producto buscarProductoPorId(String id) {
        for (Producto producto : productos) {
        if (producto.getId().equals(id)) {
            return producto;
        }
    }
    return null;
    }

    //ELIMINAR
    public Producto eliminarProducto(String id) {
        Producto prodEncontrado = null;

        if (buscarProductoPorId(id) != null) {
            prodEncontrado = buscarProductoPorId(id);
            productos.remove(prodEncontrado);
        }
        return prodEncontrado;
    }

    //FILTRAR
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        if(categoria == null){
            System.out.println("\nLa categoria no es válida o no existe");
            return;
        }
        
        System.out.println("\n--Productos en la categoría " + categoria.name());

        int contador=0;
        
        for (Producto producto : productos) {
            if (producto.getCategoriaProducto().equals(categoria)) {
                producto.mostrarInfo();
                contador++;
            }
        }
        
        if(contador==0){
            System.out.println("No se encontraron productos para la categoría especificada.");
        }
    }

    // ACTUALIZAR
    public Producto actualizarStock(String id, int nuevaCantidad) {
        Producto prod = buscarProductoPorId(id);
        if(prod != null){
            prod.setCantidad(nuevaCantidad);
        }
        return prod;
    }

    // STOCK TOTAL
    public int obtenerTotalStock() {
        int total=0;
        for (Producto producto : productos) {
            total+=producto.getCantidad();
        }
        return total;
    }

    //MAYOR STOCK
    public List<Producto> obtenerProductoConMayorStock() {
        ArrayList<Producto> listaMaxStock = new ArrayList<>();
        int max=-1;
        for (Producto producto : productos) {
            if(producto.getCantidad()>max){
                max=producto.getCantidad();
                listaMaxStock.clear();
                listaMaxStock.add(producto);
            }else if(producto.getCantidad()==max){
                listaMaxStock.add(producto);
            }
        }
        return Collections.unmodifiableList(listaMaxStock);
    }

    //FILTRO POR PRECIO
    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> prodFiltroPrecio = new ArrayList<>();
        for (Producto p : productos) {
            if(p.getPrecio()>min && p.getPrecio()<max){
                prodFiltroPrecio.add(p);
            }
        }
        return Collections.unmodifiableList(prodFiltroPrecio);
    }

    // MOSTRAR CATEGORIAS
    public void mostrarCategoriasDisponibles() {
        CategoriaProducto[] categorias = CategoriaProducto.values();
        for (CategoriaProducto categoria : categorias) {
            System.out.println(categoria.toString());
        }
        
    }
}
