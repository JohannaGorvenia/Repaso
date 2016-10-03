/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ulima.visortexto;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 *
 * @author Administrator
 */
public class HTMLAdapter implements ModoVisualizacionAdapter{

    @Override
    public ByteArrayOutputStream renderizar(String titulo, String contenido) throws IOException {
     String htmlData="";

            htmlData+="<html>";
            htmlData+="<head>";
            htmlData+="<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\"/>";
            htmlData+="</head>";
            htmlData+="<body class='container'>";
            htmlData+="<h1>" + titulo + "</h1>";
            htmlData+="<div class=\"panel panel-default\">";
            htmlData+="<div class=\"panel-body\">" + contenido + "</div>";
            htmlData+="</div?";
            htmlData+="</body>";
            htmlData+="</html>";
            
            ByteArrayOutputStream baos= new ByteArrayOutputStream();
            baos.write(htmlData.getBytes());
    
    return baos;
    }
    
}
