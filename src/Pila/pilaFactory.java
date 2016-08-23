
package Pila;

/**
 *
 * @author diego
 * @param <T>
 */
public  class pilaFactory<T> {
    
    //metodo constructor

    /**
     *
     */
        public pilaFactory(){}

    //metodo que genera tipo de pila dependiendo de la decision

    /**
     *
     * @param decision
     * @return
     */
        public APila<T> CrearInstancia (String decision){
            switch(decision){
             //llama a los constructores de cada tipo de pila 
            case "1":
                return new  StackArrayList<T>();
            case "2":
                return new StackLista<T>();
            case "3":
                return new StackVector<T>();
            default:
                break;
            //    System.out.println("no se ingreso una opcion correcta");                     
            }
            return null;
    }
}
