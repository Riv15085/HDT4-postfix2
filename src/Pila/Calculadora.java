package Pila;
import java.io.IOException;
import java.util.Vector;

/**
 * Jorge Mario Tezen 15417
 * Diego Fernando Rivera 15085
 * Clase Calculadora que utiliza Stack y Lectura y realiza los calculos 
 */
public class Calculadora {
    
    APila pila1;
    String archivo,linea,actual;
    int num1,num2,resultado;
    String desicion;
    //se declara el tipo e instancia la fabrica de pilas 
    pilaFactory<String>  Fabrica = new pilaFactory();
    
    //metodo constructor

    /**
     *
     * @param esteStack
     */
        public Calculadora(String esteStack ){
        this.desicion = esteStack;
        //definimos un valor inicial de vector
        linea = "25+";
        //la ubicacion cambia segun servidor
        archivo = "C:\\Users\\diego\\Desktop\\Diego Rivera\\texto\\postfix format.txt";
        pila1=Fabrica.CrearInstancia(desicion); 
    }
  
    //metodo principal de operaciones y descomposicion de vectores por fila del archivo
    void Descomposicion(String decision) throws IOException{
        
        //descompone el parrafo en lineas
        Vector parrafo = Lectura.leerArchivo(archivo);
        for (int i = 0; i<parrafo.size();i++){
            linea = (String) parrafo.elementAt(i);
            //descompone cada fila en caracteres
            for (int j=0;j<linea.length();j++){
                actual = linea.substring(j, j+1);
                try{
                   //realiza un push de cada caracter a la pila 
                   Integer.parseInt(actual);
                   pila1.push(actual);
                }
                //comparamos el caracter y dependiendo del caso realiza operacion
                catch(NumberFormatException e){
                        // si la pila no contiene por lo menos 2 operadores muestra error
                    if (!actual.equalsIgnoreCase(" ") && (pila1.size()>=2)){
                        num2= Integer.valueOf((String) pila1.pop());
                        num1 = Integer.valueOf((String) pila1.pop());
                        switch (actual){
                            case "+":
                                resultado =num1+ num2;
                                break;
                            case "-":
                                resultado =num1-num2;
                                break;
                            case "*":
                                resultado =num1*num2;
                                break;
                            case "/":
                                resultado =num1/ num2;
                                break;
                            default:
                                // si la linea tiene un caracter no definido o no tiene la sintaxis correcta muestra error
                                System.out.println("La linea " + (i+1)+" no es operable");
                                j = linea.length();
                                break;
                        }
                        // mueve el resutado a la pila 
                        pila1.push(Integer.toString(resultado));
                    }
                   else if(!actual.equalsIgnoreCase(" ")){
                        j=linea.length();
                    }
                }
            }
            if (pila1.size()>1){
                System.out.println("La linea "+ (i+1)+ " no es operable");
            }
            else{
                // muestra el valor obtenido 
                System.out.println("El resultado de la linea "+(i+1)+" es: " +(pila1.getStack(0)));
            }
            //limpia la pila 
            pila1.deleteStack();
            pila1.setPosicion(0);
        }  
    }   
}
