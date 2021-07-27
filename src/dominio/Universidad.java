
package dominio;

import java.util.ArrayList;

public class Universidad {
    private String nombreUniversidad; 
    
    private  ArrayList<Facultad> facultad = new ArrayList<>(); 

    public Universidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }
    
    
}
