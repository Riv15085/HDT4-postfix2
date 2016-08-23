package Pila;
/**
 * Jorge Mario Tezen 15417
 * Diego Fernando Rivera 15085
 * Clase Lectura permite la lectura archivos .text
 */


import java.io.*;
import java.util.*;
        
/**
 *
 * @author diego
 */
public class Lectura {
    
    // permite la lectura de un path y devuelve un string de las lineas del texto

    /**
     *
     * @param path
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
        public static Vector leerArchivo (String path) throws FileNotFoundException,IOException{
       Vector parrafo= new Vector(20,5);
        String linea;
        FileReader fr= new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);
        while((linea=textReader.readLine())!=null){
            parrafo.addElement(linea);
        }
        textReader.close();
        return parrafo;
    }
   
}

