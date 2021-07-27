
package dominio;

import java.util.ArrayList;

public class Facultad {
    
     private String facultad;
     
     private Director director;   
     private ArrayList<Carrera> carrera = new ArrayList<>();
     private ArrayList<Profesor> profesor = new ArrayList();

    public Facultad(String facultad) {
        this.facultad = facultad;
    }

    
}
