/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Curso {
    private int nrc;
    private Profesor profesor;
    private Estudiante estudiante;
    ArrayList<Estudiante> estudiantes;

    public Curso(int nrc) {
        this.nrc = nrc;
        estudiantes = new ArrayList();  
    }

    public int getNrc() {
        return nrc;
    }
    
    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        if (this.profesor == null){
            this.profesor = profesor;
        }
    }
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        if (this.estudiante == null){
            this.estudiante = estudiante;
        }
    }

    void setProfesor(Estudiante e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
