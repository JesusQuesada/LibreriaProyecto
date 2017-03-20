/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheros;

/**
 *
 * @author User
 */

    import java.io.*;

public class LeerFichero {
    
    public void muestraContenido(File archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            System.out.println(cadena);
        }
        b.close();
    
    }
    
   
}

