package universidad;

import java.util.ArrayList;

public class Estudiante {

    int ide;


    ArrayList<Curso> cursos;

    public Estudiante(int ide) {
        this.ide = ide;
        cursos = new ArrayList();
    }
}
