/**
 * @author Pedro Arriola
 * Carnet 20188
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de datos
 * Seccion 10
 */

import java.util.*;

public class CalculadoraPostfix implements Calculadora{

    StackVector<Integer> stack;

    public CalculadoraPostfix(){
        stack = new StackVector<Integer>(); //Instancia del StackVector
    }


    /**
     * Pre: Se ingresa expresion.
     * @param expresion cualquier expresion en formato Postfix.
     * @return String
     * Post: Regresa el resultado de la expresio evaluada.
     */
    @Override
    public String Calculo(String expresion) {

        for(int i = 0; i < expresion.length(); i++) {

            char c = expresion.charAt(i); //Se para el string en caracteres separados para poder evaluarlos.

            if(Character.isDigit(c)){
                stack.push(c - '0');
            } else {
                int valorUno = stack.pop(); //Saca el valor 1 para evaluar.
                int valorDos = stack.pop(); //Saca el valor 2 para evaluar.

                switch(c) {
                    case '+':
                    stack.push(valorDos + valorUno); //Realiza la operacion de suma.
                    break;

                    case '-':
                    stack.push(valorDos - valorUno); //Realiza la operacion de resta.
                    break;

                    case '*':
                    stack.push(valorDos * valorUno); //Realiza la operacion de multiplicacion.
                    break;

                    case '/':
                    stack.push(valorDos / valorUno); //Realiza la operacion de division.
                    break;
                }
            }
        }

        int conversion = stack.pop();
        String resultado = Integer.toString(conversion);

        return resultado; //Regresa el resultado.
    }

}
