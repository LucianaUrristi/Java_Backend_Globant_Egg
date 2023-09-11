/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8cadena;

import Entidad.Cadena;
import Servicios.ServicioCadena;
import java.util.Scanner;


/**
 *
 * @author lu_co
 */
public class Ejercicio8Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
        String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
        una frase que puede ser una palabra o varias palabras separadas por un espacio en
        blanco y a través de los métodos set, se guardará la frase y la longitud de manera
        automática según la longitud de la frase ingresada. Deberá además implementar los
        siguientes métodos:
        a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
        frase ingresada.
        b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
        ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
        c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
        contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
        d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
        e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
        compone la clase con otra nueva frase ingresada por el usuario.
        f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
        con una nueva frase ingresada por el usuario y mostrar la frase resultante.
        g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
        encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
        la frase resultante.
        h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
        ingresa el usuario y devuelve verdadero si la contiene y falso si no.
                */
 
        ServicioCadena sC = new ServicioCadena();
        System.out.println("Ingrese una frase, puede ser una palabra o varias palabras separadas por un espacio en blanco.");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena cadena = sC.crearCadena();
        cadena.setFrase(leer.nextLine());

        cadena.setLongitud(cadena.getFrase().length());
        
        System.out.println("La frase posee " + sC.mostrarVocales(cadena) + " vocales.");
        System.out.println("La frase invertida es " + sC.invertirFrase(cadena));
        System.out.println("Ingrese el caracter que para saber la cantidad de veces que se repite.");
        String letra = leer.nextLine();
        System.out.println("La letra " + letra + " se repite " + sC.vecesRepetido(cadena, letra) + " veces.");
        System.out.println("Ingrese una nueva frase para saber si es de la misma longitud");
        String nuevafrase = leer.nextLine();
        if (sC.compararLongitud(cadena, nuevafrase) == true) {
            System.out.println("Ambas frases poseen la misma longitud.");
        } else {
            System.out.println("Las frases poseen diferente longitud.");
        }
        System.out.println("Ingrese otra frase: ");
        String nuevafrase2 = leer.nextLine();
        System.out.println("Su frase concatenada es: " + sC.unirFrases(cadena, nuevafrase2));
        System.out.println("Ingrese el caracter por el que desea reemplazar");
        String reemplazo = leer.nextLine();
        System.out.println("Su frase reemplazada es: " + sC.reemplazar(cadena, reemplazo));
        System.out.println("Ingrese la letra que desea buscar dentro de la frase");
        String letraABuscar = leer.nextLine();
        if (sC.contine(cadena, letraABuscar) == true) {
            System.out.println("La letra está dentro de la frase ingresada.");
        } else {
            System.out.println("La letra NO está dentro de la frase ingresada.");
        }

    }
}
