
package dominio;

import java.util.ArrayList;

public class Estudiante {
    
    private String nombreCarrera;
    private String facultad; 
    private String NombreEstudiante; 
    private int edad; 
  
    private ArrayList<Materia> materia = new ArrayList<>(); 

    public Estudiante(String nombreCarrera, String Facultad, String NombreEstudiante, int edad) {
        
        this.nombreCarrera = nombreCarrera;
        this.facultad = Facultad;
        this.NombreEstudiante = NombreEstudiante;
        this.edad = edad;
    }
    }
    
   