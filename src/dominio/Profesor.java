
package dominio;

import java.util.ArrayList;

public class Profesor {
    private String nombreProfesor; 
    private String profesion; 
    private int edad; 
    
    private ArrayList<Materia> materia = new ArrayList();

    public Profesor(String nombreProfesor, String profesion, int edad) {
        this.nombreProfesor = nombreProfesor;
        this.profesion = profesion;
        this.edad = edad;
    } 
    
}
