package tp5;

public class Principal {
    public static void main(String[] args) {
        /////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////PASAPORTE-FOTO-TITULAR/////////////////////////////////
        System.out.println("PASAPORTE-FOTO-TITULAR");
        System.out.println("-------------------------------");
        Titular titular1= new Titular("Angulo", "99999999");
        Pasaporte pasaporte789 = new Pasaporte("789","25-5-1982","jpeg","C:\foto1.jpeg");
        
        titular1.setPasaporte(pasaporte789);
        
        System.out.println("Nombre: "+titular1.getNombre());
        System.out.println("DNI: "+titular1.getDni());
        System.out.println("Pasaporte Numero: "+titular1.getPasaporte().getNumero());
        
        System.out.println("\n");
        /////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////CELULAR-BATERIA-USUARIO/////////////////////////////////
        System.out.println("CELULAR-BATERIA-USUARIO");
        System.out.println("-------------------------------");
        Bateria bateria= new Bateria("LXZ785-L","5000mA");
        Celular celular = new Celular("9876543216548987","Samsung","Galaxy",bateria);
        Usuario usuario= new Usuario("Fred Machado", "95456321");
        
        celular.setUsuario(usuario);
        
        System.out.println(celular);
        
        System.out.println("\n");
        /////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////LIBRO-AUTOR-EDITORIAL////////////////////////////////
        System.out.println("LIBRO-AUTOR-EDITORIAL");
        System.out.println("-------------------------------");
        
        Editorial editorial= new Editorial("Alfajor", "17 de octubre del 45");
        Autor autor= new Autor("Stephanie Queen", "yanqui");
        Libro libro= new Libro("Un saco de huevos", "ISBN 978-950-07-1234-5", editorial);
        libro.setAutor(autor);
        
        System.out.println(libro.toString());
        
        System.out.println("\n");
        /////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////TarjetaDeCrédito - Cliente - Banco/////////////////////////////
        System.out.println("TarjetaDeCredito - Cliente - Banco");
        System.out.println("---------------------------------------");
        
        Banco banco = new Banco("Banco Usurario", "25-65489756446-210");
        TarjetaDeCredito tarjetaDeCredito =new TarjetaDeCredito("4561-654", "25-10-2026", banco);
        Cliente cliente = new Cliente("Pepito","54.546.121");
        
        cliente.setTarjetaDeCredito(tarjetaDeCredito);
        
        System.out.println(cliente.toString());
        System.out.println(tarjetaDeCredito.toString());
        
         System.out.println("\n");
        /////////////////////////////////////////////////////////////////////////////////////////////////
         ///////////////////////////Computadora-PlacaMadre-Propietario///////////////////////////
        System.out.println("Computadora-PlacaMadre-Propietario");
        System.out.println("-------------------------------------------");
        
        Computadora computadora1 = new Computadora("Dell", "589Z6654B-D", "a530-Z", "asRock");
        Propietario propietario = new Propietario("Castor y Polux", "39654120");
        
        computadora1.setPropietario(propietario);
        
        System.out.println(computadora1);
        System.out.println(propietario);
        
        System.out.println("\n");
        /////////////////////////////////////////////////////////////////////////////////////////////////
         ///////////////////////////////Reserva-Mesa-ClienteReserva///////////////////////////////
        System.out.println("Reserva-Mesa-ClienteReserva");
        System.out.println("----------------------------------");
    
        ClienteReserva clienteReserva = new ClienteReserva("Candelmo", "1122334455");
        Mesa mesa = new Mesa(29, 8);
        Reserva reserva = new Reserva("20-07-2058", "10:55", mesa);
        reserva.setCliente(clienteReserva);
        
        System.out.println(reserva.toString());
    
        System.out.println("\n");
        /////////////////////////////////////////////////////////////////////////////////////////////////
         ///////////////////////////////Vehiculo-Motor-Conductor///////////////////////////////
        System.out.println("Vehiculo-Motor-Conductor");
        System.out.println("------------------------------");
        
        Motor motor = new Motor("v8", "568974D");
        Conductor conductor= new Conductor("Alejo Valentina", "39564789");
        Vehiculo vehiculo = new Vehiculo("JKL879", "Ranger", motor);
        vehiculo.setConductor(conductor);
        
        System.out.println(vehiculo.toString());
        
        System.out.println("\n");
        /////////////////////////////////////////////////////////////////////////////////////////////////
         /////////////////////////////Documento-FirmaDigital-Usuario//////////////////////////////
        System.out.println("Documento-FirmaDigital-Usuario");
        System.out.println("-------------------------------------");
        
        UsuarioDocumento usuarioDocumento = new UsuarioDocumento("Alba Tros", "alba@tros.gmail.com");
        Documento documento = new Documento("Leviathan", "Contenido", usuarioDocumento, "54SD541S8A6S@54DAS87QWD564", "22/07/2015");
        
        System.out.println(documento.toString());
        
        System.out.println("\n");
        /////////////////////////////////////////////////////////////////////////////////////////////////
         ////////////////////////////CitaMédica - Paciente - Profesional/////////////////////////////
        System.out.println("CitaMédica - Paciente - Profesional");
        System.out.println("-------------------------------------");
        
        Paciente paciente = new Paciente("Jorge Rial", "IOMA");
        Profesional profesional = new Profesional("Luis Aventura", "Chimentos");
        CitaMedica citaMedica= new CitaMedica("01-01-2062", "02:00 AM");
        
        citaMedica.setPaciente(paciente);
        citaMedica.setProfesional(profesional);
        
        System.out.println(citaMedica.toString());
        
        System.out.println("\n");
        /////////////////////////////////////////////////////////////////////////////////////////////////
         ///////////////////////CuentaBancaria - ClaveSeguridad - Titular/////////////////////////
        System.out.println("CuentaBancaria - ClaveSeguridad - Titular");
        System.out.println("------------------------------------------------");
        
        CuentaBancaria cuentaBancaria = new CuentaBancaria("1234567891234567891234", 30000, "1234", "05-03-1965");
        TitularCuenta titular = new TitularCuenta("Cadmio", "12456789");
        
        cuentaBancaria.setTitular(titular);
        
        System.out.println(cuentaBancaria.toString());
        
        System.out.println("\n");
        /////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////Reproductor - Cancion - Artista/////////////////////////////
        System.out.println("Reproductor - Cancion - Artista");
        System.out.println("------------------------------------------------");
        
        Artista artista = new Artista("Queen", "Rock");
        Cancion cancion = new Cancion("Borracho y amanecido");
        cancion.setArtista(artista);
        Reproductor.reproducirCancion(cancion);
        
        System.out.println("\n");
        /////////////////////////////////////////////////////////////////////////////////////////////////
         ///////////////////////Impuesto - Contribuyente - Calculadora////////////////////////////
        System.out.println("Impuesto - Contribuyente - Calculadora");
        System.out.println("------------------------------------------------");
        
        Contribuyente contribuyente = new Contribuyente("Paganini", "20-65498722-0");
        Impuesto impuesto = new Impuesto(560000);
        impuesto.setContribuyente(contribuyente);
        Calculadora.calcular(impuesto);
        
        System.out.println("\n");
        /////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////GeneradorQR - Usuario - CódigoQR////////////////////////////
        System.out.println("GeneradorQR - Usuario - CódigoQR");
        System.out.println("------------------------------------------------");
        
        UsuarioQR usuarioQr = new UsuarioQR("Alisson", "alisson@email.com");
        CodigoQR codigoQr = new CodigoQR("789456");
        codigoQr.setUsuario(usuarioQr);
        System.out.println(codigoQr.toString());
        
        GeneradorQR.generar("789456", usuarioQr);
        
        System.out.println("\n");
        /////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////EditorVideo - Proyecto - Render////////////////////////////
        System.out.println("EditorVideo - Proyecto - Render");
        System.out.println("------------------------------------");
        
        Proyecto proyecto = new Proyecto("El peliculon", 205);
        Render render = new Render("avi");
        render.setProyecto(proyecto);
        
        EditorVideo.exportar("avi", proyecto);
    }
}
