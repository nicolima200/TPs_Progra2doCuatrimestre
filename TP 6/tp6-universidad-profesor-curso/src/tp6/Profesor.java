package tp6;

import java.util.ArrayList;
import java.util.List;

public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        if (curso != null && !cursos.contains(curso)) {
            cursos.add(curso);
            if (curso.getProfesor() != this) {
                curso.setProfesor(this);
            }
        }
    }

    public void eliminarCurso(Curso curso) {
        if (cursos.remove(curso) && curso.getProfesor() == this) {
            curso.setProfesor(null);
        }
    }

    private void listarCursos() {
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }

    public List<Curso> getCursos() {
        return cursos;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getId() {
        return id;
    }
    
    public int cantCursos(){
        return cursos.size();
    }
    
    public void mostrarInfo(){
        System.out.println("\n--ID: "+id+", Nombre: "+nombre+", Especialidad: "+especialidad+", \n  Cursos: "+cursos);
    }
    
    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + ", cursos=" + cursos + '}';
    }

    
}
