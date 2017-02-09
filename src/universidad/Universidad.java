package universidad;

import java.util.ArrayList;

public class Universidad {

    ArrayList<Curso> cursos;

    ArrayList<Profesor> profesores;

    ArrayList<Estudiante> estudiantes;

    public Universidad() {
        cursos = new ArrayList();
        profesores = new ArrayList();
        estudiantes = new ArrayList();
    }

    public void agregarProfesor() {
        Profesor p1 = new Profesor(1);
        profesores.add(p1);
    }

    public void agregarCurso() {
        Curso c = new Curso(10);
        cursos.add(c);
    }

    public void agregarEstudiante() {
        Estudiante e = new Estudiante(1);
        estudiantes.add(e);
    }

    public void registrarProfesorCurso(Profesor p, Curso c) {
        p.cursos.add(c);
        c.setProfesor(p);
    }

    public static void main(String[] args) {
    }
}
