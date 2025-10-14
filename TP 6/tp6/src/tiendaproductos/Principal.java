package tiendaproductos;

public class Principal {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Tienda tienda = new Tienda(inventario);
        
        /*Para agilizar la carga inicial de datos de prueba (hardcoding), se utilizó una herramienta de IA para generar las 40 líneas constructoras.*/
        cargarInventario(inventario);

        tienda.buscarProductoPorId("1200");
        tienda.buscarProductoPorId("400");
        tienda.listarProductos();

        tienda.eliminarProducto("1500");
        tienda.eliminarProducto("102");

        tienda.filtrarPorCategoria(CategoriaProducto.ROPA);
        tienda.filtrarPorCategoria(CategoriaProducto.OTROS);

        tienda.actualizarStock("408", 7000);
        tienda.actualizarStock("409", 7000);

        tienda.actualizarStock("8500", 7000);

        tienda.obtenerTotalStock();

        tienda.mostrarProductoConMayorStock();

        tienda.filtrarProductosPorPrecio(1000, 3000);
        
        tienda.mostrarCategorias();
    }

    public static void cargarInventario(Inventario inventario) {
        // ------------------------- ALIMENTOS (10 Productos) 🍎 -------------------------
        inventario.agregarProducto(new Producto("100", "Arroz Blanco", 185.50, 500, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("101", "Fideos Tirabuzón", 130.00, 800, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("102", "Leche Entera Litro", 215.75, 300, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("103", "Café Molido 250g", 890.99, 150, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("104", "Aceite de Oliva 1L", 1550.00, 120, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("105", "Atún en lata", 340.50, 400, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("106", "Pan Integral Rebanado", 280.00, 250, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("107", "Mermelada de Fresa", 450.00, 180, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("108", "Miel Pura 500g", 1250.00, 95, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("109", "Agua Mineral 1.5L", 110.50, 1000, CategoriaProducto.ALIMENTOS));

// ------------------------- ELECTRÓNICA (10 Productos) 💻 -------------------------
        inventario.agregarProducto(new Producto("200", "Smartphone Z20", 14999.00, 50, CategoriaProducto.ELECTRONICA)); // Cerca del máximo
        inventario.agregarProducto(new Producto("201", "Auriculares Bluetooth", 2590.99, 180, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("202", "Smart TV 55\"", 11800.00, 30, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("203", "Teclado Mecánico", 1950.00, 90, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("204", "Cámara Web HD", 890.00, 210, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("205", "Mouse Inalámbrico", 750.00, 350, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("206", "Router Wi-Fi Dual Band", 2100.00, 110, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("207", "Disco Duro Externo 1TB", 3890.00, 80, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("208", "Tablet 10 pulgadas", 6499.00, 45, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("209", "Cargador Rápido USB-C", 490.50, 500, CategoriaProducto.ELECTRONICA));

// ------------------------- ROPA (10 Productos) 👕 -------------------------
        inventario.agregarProducto(new Producto("300", "Jeans Hombre Talla 42", 2990.00, 110, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("301", "Camisa Algodón Blanca", 1850.50, 150, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("302", "Sudadera Deportiva", 3100.00, 75, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("303", "Vestido Verano Floral", 3750.00, 60, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("304", "Medias Pack x3", 550.00, 300, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("305", "Zapatillas Running", 6800.00, 70, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("306", "Bufanda de Lana", 950.00, 160, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("307", "Gorra Béisbol Ajustable", 890.00, 220, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("308", "Pantalón Chino Casual", 2150.99, 85, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("309", "Chaqueta Impermeable", 5100.00, 55, CategoriaProducto.ROPA));

// ------------------------- HOGAR (10 Productos) 🛋️ -------------------------
        inventario.agregarProducto(new Producto("400", "Juego de Sábanas", 2200.00, 85, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("401", "Vajilla Completa 6 P", 4100.99, 40, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("402", "Lámpara de Escritorio", 990.50, 130, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("403", "Detergente Líquido 2L", 450.00, 250, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("404", "Toallas de Baño Pack", 1500.00, 105, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("405", "Set de Utensilios Cocina", 1890.00, 90, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("406", "Alfombra de Sala 2x3m", 7500.00, 25, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("407", "Ambientador Eléctrico", 599.99, 310, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("408", "Silla Ergonómica Oficina", 9999.00, 40, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("409", "Espejo de Pared Grande", 3200.00, 65, CategoriaProducto.HOGAR));
    }

}
