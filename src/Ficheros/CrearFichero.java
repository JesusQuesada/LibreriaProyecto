/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheros;

import java.io.*;

/**
 *
 * @author User
 */
public class CrearFichero {
    
    public void crearFichero(String ruta,String nombre, int intentos) throws IOException{
        
        File archivo = new File(ruta+"\\"+nombre+".txt");
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Personaje -- " + nombre +"\nIntentos -- " + intentos);
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Personaje -- " + nombre +"\nIntentos -- " + intentos);
        }
        bw.close();
    }
}
