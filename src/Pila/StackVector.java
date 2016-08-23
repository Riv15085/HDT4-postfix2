package Pila;
/**
 * Jorge Mario Tezen 15417
 * Diego Fernando Rivera 15085
 * Clase que implementa iPila 
 */

import java.util.*;

/**
 *
 * @author diego
 * @param <T>
 */
public class StackVector<T> extends APila<T> {
    
    private int posicion;
    Vector miPila;
    
    //metodo contructor

    /**
     *
     */
        public StackVector( ){
        posicion=0;
        miPila= new Vector(10,5);
     
    }
    
    //metodo push que ingresa elementos al vector

    /**
     *
     * @param operando
     */
        @Override
    public void push (T operando){
        miPila.addElement(operando);
        posicion++;
    }
    
    //metodo po que obtine el elemento actual y resta al contador posicion

    /**
     *
     * @return
     */
        @Override
    public T pop (){
        T elemento=  (T) miPila.elementAt(posicion-1);
        miPila.removeElementAt(posicion-1);
        posicion--;
        return elemento;
    }

    /**
     *
     * @param posicion
     */
    @Override
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    /**
     *
     * @return
     */
    public Vector<T> getVector(){
       return miPila;
    }
   
    /**
     *
     * @return
     */
    @Override
    public int size() {
        return miPila.size();
    }

    /**
     *
     * @param posicion
     * @return
     */
    @Override
    public T getStack(int posicion) {
        return (T) miPila.elementAt(posicion);
    }

    /**
     *
     */
    @Override
    public void deleteStack() {
        miPila.removeAllElements();
    }
    
}
