package tp6;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public void setProfesor(Profesor profesor){
        if (this.profesor==profesor){
            return;
        }
        
        if(this.profesor != null){
            this.profesor.eliminarCurso(this);
        }
        
        this.profesor = profesor;
        
        if(profesor !=null && !profesor.getCursos().contains(this)){
            profesor.agregarCurso(this);
        }
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void mostrarInfo() {
        if(this.profesor != null){
            System.out.println("Cod.: "+codigo+", Nombre: "+nombre+", Profesor: "+profesor.getNombre()+", ID= "+profesor.getId());
        }else{
            System.out.println("Cod.: "+codigo+", Nombre: "+nombre+", Profesor: NO ASIGNADO");
            
        }
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
    
}
