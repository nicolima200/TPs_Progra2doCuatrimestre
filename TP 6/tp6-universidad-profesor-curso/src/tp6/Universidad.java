package tp6;

import java.util.List;

public class Universidad {

    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre, List<Profesor> profesores, List<Curso> cursos) {
        this.nombre = nombre;
        this.profesores = profesores;
        this.cursos = cursos;
    }

    public void agregarProfesor(Profesor profesor) {
        if (profesor != null) {
            profesores.add(profesor);
        }
    }

    public void agregarCurso(Curso curso) {
        if (curso != null) {
            cursos.add(curso);
        }
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        if (buscarCursoPorCodigo(codigoCurso) != null && buscarProfesorPorId(idProfesor) != null) {
            buscarCursoPorCodigo(codigoCurso).setProfesor(buscarProfesorPorId(idProfesor));
        }
    }
    
    public void listarProfesores() {
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }
    
    public void listarCursos() {
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public Profesor buscarProfesorPorId(String idProfesor) {
        for (Profesor p : profesores) {
            if (p.getId().equals(idProfesor)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigoCurso) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigoCurso)) {
                return c;
            }
        }
        return null;
    }

    public void eliminarCurso(String codigoCurso) {
        Curso cursoAEliminar = buscarCursoPorCodigo(codigoCurso);

        if (cursoAEliminar != null) {
            System.out.println("\n--Profesor asignado al curso que será eliminado:");
            for (Profesor p : profesores) {
                if (p.getCursos().contains(cursoAEliminar)) {
                    System.out.println("  ID: " + p.getId() + " y Nombre: " + p.getNombre() + " ");
                    p.eliminarCurso(cursoAEliminar);
                }
            }
            cursos.remove(cursoAEliminar);
        }
    }

    public void eliminarProfesor(String idProfesor) {
        Profesor profesorAEliminar = buscarProfesorPorId(idProfesor);
        if (profesorAEliminar != null) {
            for (Curso c : cursos) {
                if (c.getProfesor() != null && c.getProfesor().equals(profesorAEliminar)) {
                    c.setProfesor(null);
                }
            }
            profesores.remove(profesorAEliminar);

        }
    }

    public void cantCursosPorProfesorId(String profesorID) {
        Profesor p = buscarProfesorPorId(profesorID);
        if (p != null) {
            System.out.println("\n--Cantidad de cursos del profesor/a con ID: "+profesorID +", Nombre: "+ p.getNombre());
            System.out.print("  ");
            System.out.println(p.cantCursos());
        }else{
            System.out.println("El profesor con ID: "+profesorID+" no existe.");
        }
        
    }

    @Override
    public String toString() {
        return "Universidad{" + "nombre=" + nombre + ", profesores=" + profesores + ", cursos=" + cursos + '}';
    }
    
    
}
