package tp7;

public class Rectangulo extends Figura {
    private double ladoA;
    private double ladoB;

    public Rectangulo(String nombre,double ladoA, double ladoB) {
        super(nombre);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double calcularArea() {
        return ladoA*ladoB;
    }
}
