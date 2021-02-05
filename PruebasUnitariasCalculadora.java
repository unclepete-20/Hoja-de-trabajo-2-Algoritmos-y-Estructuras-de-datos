/**
 * @author Pedro Arriola
 * Carnet 20188
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de datos
 * Seccion 10
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PruebasUnitariasCalculadora {

    CalculadoraPostfix calcPrueba = new CalculadoraPostfix();
    StackVector<String> stackVector = new StackVector<String>();

    @Test
    public void pruebaCalculo(){
        assertEquals("28", calcPrueba.Calculo("483*+"));
    }



    @Test
    public void pruebaPop(){

        stackVector.push("hola");
        assertEquals("hola", stackVector.pop());

    }

    @Test
    public void pruebaPeek(){
        stackVector.push("hola");
        stackVector.push("hello");
        assertEquals("hello", stackVector.peek());
    }


    @Test
    public void pruebaEmpty(){

        assertEquals(true, stackVector.empty());

        stackVector.push("2");

        assertEquals(false, stackVector.empty());
    }

    @Test
    public void pruebaSize(){
        stackVector.push("hola");
        stackVector.push("hello");
        assertEquals(2, stackVector.size());
    }
}
