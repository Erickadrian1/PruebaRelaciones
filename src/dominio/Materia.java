
package dominio;

import java.util.ArrayList;

public class Materia {
    private String nombreMateria; 
    private int numCreditos; 
   
    private Profesor profesor; 
    private ArrayList<Estudiante> estudiante = new ArrayList();

    public Materia(String nombreMateria, int numCreditos, Profesor profesor) {
        this.nombreMateria = nombreMateria;
        this.numCreditos = numCreditos;
        this.profesor = profesor;
    }
}
