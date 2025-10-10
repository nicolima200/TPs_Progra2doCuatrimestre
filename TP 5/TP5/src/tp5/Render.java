package tp5;

public class Render {
    private String formato;
    private Proyecto proyecto;

    public Render(String formato) {
        this.formato = formato;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "Render{" + "formato=" + formato + ", proyecto=" + proyecto + '}';
    }
    
    
}
