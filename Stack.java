/**
 * @author Pedro Arriola
 * Carnet 20188
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de datos
 * Seccion 10
 */

public interface Stack<E>{

    /**
     *
     * @param item
     *Permite ingresar datos al Stack.
     */
    public void push(E item);

    /**
     *
     * @return
     *Permite sacar datos del Stack.
     */

    public E pop();

    /**
     *
     * @return
     *Permite obtener el primer dato que aparece sin sacarlo.
     */
    public E peek();

    /**
     *
     * @return
     *Verifica si el Stack está vacío o no.
     */
    public boolean empty();

    /**
     *
     * @return
     *Verifica el tamaño del Stack
     */
    public int size();
}
