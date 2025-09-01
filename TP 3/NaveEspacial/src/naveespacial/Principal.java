package naveespacial;

public class Principal {

    public static void main(String[] args) {
        Nave nave1 = new Nave();
        
        nave1.nombre="Nave del olvido";
        
        nave1.mostrarEstado();
        
        nave1.despegar();
        nave1.avanzar(1);
        
        
        nave1.recargarCombustible(150);
        
        nave1.mostrarEstado();
        
        nave1.despegar();
        
        nave1.avanzar(200);
        
        nave1.avanzar(50);
        
        nave1.mostrarEstado();
    }
    
}
