
package pe.edu.ulima.visortexto;

import java.io.ByteArrayOutputStream;
import java.io.IOException;


public interface ModoVisualizacionAdapter {
  
    //se crea los metodos solo se nombra
    
    public ByteArrayOutputStream renderizar(String titulo, String contenido)throws IOException;
    
    
    
    
    
    
    
    
    
}
