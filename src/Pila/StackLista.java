
package Pila;

import java.util.List;
import java.util.*;

/**
 *
 * @author diego
 * @param <T>
 */
public  class StackLista<T> extends APila<T> {
  
    private int posicion;
    List miLista;
    
    //metodo contructor

    /**
     *
     */
        public StackLista( ){
        posicion=0;
        miLista= new LinkedList();
     
    }
    
    //metodo push que ingresa elementos al vector

    /**
     *
     * @param operando
     */
        @Override
    public void push (T operando){
        miLista.add(operando);
        posicion++;
    }
    
    //metodo po que obtine el elemento actual y resta al contador posicion

    /**
     *
     * @return
     */
        @Override
    public T pop (){
        T elemento=  (T) miLista.get(posicion-1);
        miLista.remove(posicion-1);
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
    @Override
    public int size() {
        return miLista.size();
    }

    /**
     *
     * @param posicion
     * @return
     */
    @Override
    public T getStack(int posicion) {
        return (T) miLista.get(posicion);
    }

    /**
     *
     */
    @Override
    public void deleteStack() {
        miLista.clear();
    }
    
   
}

