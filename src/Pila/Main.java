package Pila;
/**
 * Jorge Mario Tezen 15417
 * Diego Fernando Rivera 15085
 * Clase Principal que utiliza Calculadora y Lectura 
 */
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Main {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Escriba la clase de stack que desea utilizar");
        System.out.println("1. Lista");
        System.out.println("2. ArrayList");
        System.out.println("3. Vector");
        
        Scanner hola = new Scanner(System.in);
        String esteStack = hola.nextLine();
        
        Calculadora miCalculadora= new Calculadora(esteStack);
        miCalculadora.Descomposicion(esteStack);
    }
}

