package Pila;

import java.util.*;

/**
 *
 * @author diego
 * @param <T>
 */
public class StackArrayList<T> extends APila<T> {
  
    private int posicion;
    ArrayList<T> miLista;
    
    //metodo contructor

    /**
     *
     */
        public StackArrayList( ){
        posicion=0;
        miLista= new ArrayList();
     
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
     * @return el tama;o de la lista
     */
    @Override
    public int size (){
        return miLista.size();
    }
    
    /**
     *
     * @param posicion
     * @return
     */
    @Override
    public T getStack(int posicion){
        return (T) miLista.get(posicion);
    }
    
    /**
     * Deletes the stack
     */
    @Override
    public void deleteStack(){
        miLista.clear();
    }
    
}

