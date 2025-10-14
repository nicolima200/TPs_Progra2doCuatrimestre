package tp6;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        //Creamos las listas de profesores y cursos
        List<Profesor> profesores = new ArrayList<>();
        List<Curso> cursos = new ArrayList<>();
        
        // Instanciamos una universidad
        Universidad universidad = new Universidad("Universidad Obrera Nacional", profesores, cursos);

        // Usamos un método auxiliar para crear y cargar las instancias de profesores y cursos
        crearProfesoresYCursos(universidad);

        // Mostramos la lista de cursos
        System.out.println("\n--LISTA CURSOS (antes de la asignación de profesores):");
        universidad.listarCursos();

        // Mostramos la lista de profesores
        System.out.println("\n--LISTA PROFESORES (antes de la asignación de cursos):");
        universidad.listarProfesores();

        // Asignamos profesores a algunos cursos (se pasó el ejemplo de instanciación a la IA y 
        // se le pidió que genere más lineas de instanciación.
        universidad.asignarProfesorACurso("CS101", "P001");
        universidad.asignarProfesorACurso("CS102", "P001");
        universidad.asignarProfesorACurso("CS509", "P001");
        universidad.asignarProfesorACurso("CS203", "P002");
        universidad.asignarProfesorACurso("CS204", "P002");
        universidad.asignarProfesorACurso("CS305", "P003");
        universidad.asignarProfesorACurso("CS306", "P003");
        universidad.asignarProfesorACurso("CS407", "P008");
        universidad.asignarProfesorACurso("CS408", "P008");
        universidad.asignarProfesorACurso("MT101", "P004");
        universidad.asignarProfesorACurso("MT202", "P004");
        universidad.asignarProfesorACurso("FI104", "P005");
        universidad.asignarProfesorACurso("FI205", "P005");
        universidad.asignarProfesorACurso("DI101", "P006");
        universidad.asignarProfesorACurso("LT103", "P007");
         
         // Mostramos la lista de cursos
        System.out.println("\n--LISTA CURSOS (profesores asignados):");
        universidad.listarCursos();

        // Mostramos la lista de profesores
        System.out.println("\n--LISTA PROFESORES (profesores asignados):");
        universidad.listarProfesores();
        
        //Cambiamos el profesor del curso CS101 (Alejandro Gómez) y le asignamos el profesor con ID P003 (Carlos Ruiz)
        // Y mostramos la lista de cursos y profesores
        universidad.asignarProfesorACurso("CS101", "P003");
        System.out.println("\n--LISTA CURSOS (reasignacion de profesor):");
        universidad.listarCursos();
        System.out.println("\n--LISTA PROFESORES: (reasignacion de profesor)");
        universidad.listarProfesores();
        
        // Eliminamos un curso
        universidad.eliminarCurso("CS204");
        
        System.out.println("\n--LISTA CURSOS: (luego de eliminar)");
        universidad.listarCursos();
        
        System.out.println("\n--LISTA PROFESORES (luego de eliminar):");
        universidad.listarProfesores();
        
        // Eliminamos un profesor
        universidad.eliminarProfesor("P003");
        
        // Mostramos la cantidad de cursos que tiene un profesor por ID
        universidad.cantCursosPorProfesorId("P008");
    }
    
    public static void crearProfesoresYCursos(Universidad universidad) {
        //AVISO: Estas instanciaciones fueron creadas con la asistencia de la IA Google Gemini para aglizar el proceso.
        //A la misma se le brindó una instanciación de Profesor de ejemplo y una instanciación de Curso y se le pidió
        //que produjera determinada cantidad de instanciaciones con esos modelos.

        // ------------------------- PROFESORES -------------------------
        universidad.agregarProfesor(new Profesor("P001", "Dr. Alejandro Gómez", "Algoritmos y Estructuras de Datos"));
        universidad.agregarProfesor(new Profesor("P002", "Ing. Laura Pérez", "Bases de Datos Avanzadas"));
        universidad.agregarProfesor(new Profesor("P003", "Lic. Carlos Ruiz", "Programación Orientada a Objetos"));
        universidad.agregarProfesor(new Profesor("P004", "Dra. Sofía Martínez", "Cálculo Multivariable"));
        universidad.agregarProfesor(new Profesor("P005", "Lic. Martín Herrera", "Física Clásica"));
        universidad.agregarProfesor(new Profesor("P006", "Prof. Emilia Duarte", "Diseño UX/UI"));
        universidad.agregarProfesor(new Profesor("P007", "Mgtr. Juan Castro", "Literatura Española"));
        universidad.agregarProfesor(new Profesor("P008", "Dra. Ana Silva", "Redes de Computadoras"));

        // ------------------------- CURSOS -------------------------
        // Cursos de Programación, Algoritmos y Bases de Datos
        universidad.agregarCurso(new Curso("CS101", "Introducción a Algoritmos y Complejidad"));
        universidad.agregarCurso(new Curso("CS102", "Estructuras de Datos Avanzadas"));
        universidad.agregarCurso(new Curso("CS203", "Bases de Datos Relacionales (SQL)"));
        universidad.agregarCurso(new Curso("CS204", "Modelado de Datos NoSQL"));
        universidad.agregarCurso(new Curso("CS305", "Programación Orientada a Objetos con Java"));
        universidad.agregarCurso(new Curso("CS306", "Patrones de Diseño de Software"));
        universidad.agregarCurso(new Curso("CS407", "Fundamentos de Redes y Protocolos TCP/IP"));
        universidad.agregarCurso(new Curso("CS408", "Seguridad en Redes de Computadoras"));
        universidad.agregarCurso(new Curso("CS509", "Optimización de Algoritmos"));
        universidad.agregarCurso(new Curso("CS510", "Tópicos de Programación Funcional"));

        // Cursos de Matemáticas y Física
        universidad.agregarCurso(new Curso("MT101", "Cálculo Integral y Diferencial"));
        universidad.agregarCurso(new Curso("MT202", "Álgebra Lineal Aplicada"));
        universidad.agregarCurso(new Curso("MT303", "Ecuaciones Diferenciales"));
        universidad.agregarCurso(new Curso("FI104", "Mecánica Clásica Avanzada"));
        universidad.agregarCurso(new Curso("FI205", "Termodinámica y Fluidos"));

        // Cursos de Humanidades, Diseño y Literatura
        universidad.agregarCurso(new Curso("DI101", "Principios de Diseño de Experiencia de Usuario (UX)"));
        universidad.agregarCurso(new Curso("DI202", "Diseño de Interfaces de Usuario (UI) Práctico"));
        universidad.agregarCurso(new Curso("LT103", "Historia de la Literatura Española"));
        universidad.agregarCurso(new Curso("LT204", "Análisis de la Novela Latinoamericana"));
        universidad.agregarCurso(new Curso("HU305", "Escritura Creativa y Narrativa"));
    }
}
