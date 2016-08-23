package Pila;

/**
 *
 * @author diego
 * @param <T>
 */
public abstract class APila <T> {
  
    /**
     *
     * @param Operando
     */
    public abstract void push (T Operando);
   
    /**
     *
     * @return
     */
    public abstract T pop ();
        
    /**
     *
     * @return
     */
    public abstract int size();

    /**
     *
     * @param posicion
     */
    public abstract void setPosicion(int posicion);

    /**
     *
     * @param posicion
     * @return
     */
    public abstract T getStack(int posicion);

    /**
     *
     */
    public abstract void deleteStack();
        

}
