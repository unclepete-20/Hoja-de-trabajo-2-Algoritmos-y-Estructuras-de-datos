/**
 * @author Pedro Arriola
 * Carnet 20188
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de datos
 * Seccion 10
 */

import java.util.EmptyStackException;
import java.util.Vector;

public class StackVector<E> implements Stack<E> {

    protected Vector<E> data;

    public StackVector() {
        // Se crea un stack vacio.
        data = new Vector<E>();
    }

    // Sobrecarga de StackVector para que acepte un tamaño definido.
    public StackVector(int size) {
        // Se crea un stack vacio con la cantidad que se quiera definir.
        data = new Vector<E>(size);
    }

    @Override
    public void push(E item) {
        data.add(item);
    }

    @Override
    public E pop() {

        return data.remove(size() - 1);
    }

    @Override
    public E peek() throws EmptyStackException {
        if(data.isEmpty()){
            throw new EmptyStackException();
        }

        return data.elementAt(data.size()-1);
    }

    @Override
    public boolean empty() {

        return data.isEmpty();
    }

    @Override
    public int size() {

        return data.size();
    }

}
