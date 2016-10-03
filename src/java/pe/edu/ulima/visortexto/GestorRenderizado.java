
package pe.edu.ulima.visortexto;

import java.io.ByteArrayOutputStream;
import java.io.IOException;


public class GestorRenderizado {
    
    private static GestorRenderizado singleton=null;
    
    public static GestorRenderizado getInstance(){
        if (singleton==null){
            singleton= new GestorRenderizado();
        }
         return singleton;
    }

    private GestorRenderizado() {
    }


    public ByteArrayOutputStream renderizar(String titulo, String contenido, String tipo) throws IOException{
         
        ModoVisualizacionFactory factory=new ModoVisualizacionFactory();
        ModoVisualizacionAdapter adapater= factory.obtenerAdapter(tipo);
        ByteArrayOutputStream baos=adapater.renderizar(titulo, contenido);
        
        return baos;
    }
    
    
}
