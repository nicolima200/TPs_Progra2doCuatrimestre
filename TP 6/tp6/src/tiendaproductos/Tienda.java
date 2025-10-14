package tiendaproductos;

import java.util.List;

public class Tienda {

    private Inventario inventario;

    public Tienda(Inventario inventario) {
        this.inventario = inventario;
    }

    public void buscarProductoPorId(String id) {
        Producto prodEncontrado = this.inventario.buscarProductoPorId(id);
        if (prodEncontrado != null) {
            System.out.println("\n--Producto ENCONTRADO!:");
            prodEncontrado.mostrarInfo();
        } else {
            System.out.println("--Producto con id " + id + " NO encontrado");
        }
    }

    public void eliminarProducto(String id) {
        Producto prodAEliminar = inventario.buscarProductoPorId(id);
        if (prodAEliminar != null) {
            inventario.eliminarProducto(id);
            System.out.println("\n--Producto ELIMINADO:");
            prodAEliminar.mostrarInfo();
            listarProductos();
        } else {
            System.out.println("\n--NO se puede eliminar. El producto NO existe.");
        }

    }

    public void listarProductos() {
        inventario.listarProductos();
    }

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        inventario.filtrarPorCategoria(categoria);
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto prod=inventario.buscarProductoPorId(id);
        if (prod != null) {
            inventario.actualizarStock(id, nuevaCantidad);
            System.out.println("\n--El STOCK del producto ha sido ACTUALIZADO:");
            prod.mostrarInfo();
        }else{
            System.out.println("\n--El producto con ID \""+id+"\" NO fue encontrado y no se pudo actualizar.");
        }
    }
    
    public void obtenerTotalStock(){
        String total=String.valueOf(inventario.obtenerTotalStock());
        System.out.println("\n--El stock total es de: "+total+" unidades.");
    }
    
    public void mostrarProductoConMayorStock(){
        System.out.println("\n--Producto/s con mayor stock:");
        List<Producto> listaMaxStock= inventario.obtenerProductoConMayorStock();
        for (Producto producto : listaMaxStock) {
            producto.mostrarInfo();
        }
        
    }
    
    public void filtrarProductosPorPrecio(double min, double max){
        System.out.println("\n--Productos con precio en el rango $"+min+" - $"+max);
        List<Producto> filtrados=inventario.filtrarProductosPorPrecio(min, max);
        for (Producto prod : filtrados) {
            prod.mostrarInfo();
        }
    }
    
    public void mostrarCategorias(){
        System.out.println("\n--Categorías y descripciones:");
        inventario.mostrarCategoriasDisponibles();
    }
    
    
}
