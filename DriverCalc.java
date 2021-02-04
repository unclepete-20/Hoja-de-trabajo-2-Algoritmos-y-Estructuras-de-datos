/**
 * @author Pedro Arriola
 * Carnet 20188
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de datos
 * Seccion 10
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DriverCalc {

    public static void main(String[] args) {

        //Instancia de la calculadora postfix.
        CalculadoraPostfix calc = new CalculadoraPostfix();
        ArrayList<String> expresiones = new ArrayList<String>();

        try {
            File archivo = new File("Datos.txt");
            Scanner scanner = new Scanner(archivo); //Lectura del archivo.

            while(scanner.hasNextLine()){
                String str = scanner.nextLine();

                char[] chars = str.toCharArray(); //Borra los espacios en blanco de las expresiones, si fuera necesario.
                String exp = "";

                for(int i = 0; i < chars.length; i++){
                    if(chars[i] != ' '){
                        exp = exp + chars[i]; //Regresa el String unido.
                    }
                }

                expresiones.add(exp); //Se añade a la lista de expresiones por evaluar.
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("\nNo se logro encontrar el archivo.\n");
            e.printStackTrace();
        }

        for (String expressions : expresiones) {
            System.out.println("\nLa evaluacion Postfix realizada en la expresión dio como resultado: " + calc.calculo(expressions));
        }

    }
}
