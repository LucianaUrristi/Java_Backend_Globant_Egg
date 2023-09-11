/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cadena;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author lu_co
 */
public class ServicioCadena {

    public Cadena crearCadena() {
        Cadena frase = new Cadena();
        return frase;
    }

    /*Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
        frase ingresada.*/
    public int mostrarVocales(Cadena cadena) {
        int vocales = 0;

        List<Character> voc = Arrays.asList('a', 'e', 'i', 'o', 'u');

        for (char caracter : cadena.getFrase().toLowerCase().toCharArray()) {
            if (voc.contains(caracter)) {
                vocales++;
            }
        }
        return vocales;
    }

    //b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
    //    ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public String invertirFrase(Cadena cadena) {
        String esarf = "";

        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {

            esarf += cadena.getFrase().charAt(i);
        }
        return esarf;
    }
    //c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
    //    contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    //    d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

    public int vecesRepetido(Cadena cadena, String letra) {
        int repetido = 0;
        char caracter = letra.toLowerCase().charAt(0);

        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (caracter == cadena.getFrase().charAt(i)) {
                repetido++;
            }
        }
        return repetido;
    }

    //e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
    //   compone la clase con otra nueva frase ingresada por el usuario.
    public boolean compararLongitud(Cadena cadena, String nuevafrase) {
        boolean iguales = false;
        int longi = nuevafrase.length();

        if (cadena.getLongitud() == longi) {
            iguales = true;
        }
        return iguales;
    }

    //f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
    //con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public String unirFrases(Cadena cadena, String nuevafrase2) {
        String concatenada = cadena.getFrase() + " " + nuevafrase2;
        return concatenada;
    }

    // g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    //encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
    // la frase resultante.
    public String reemplazar(Cadena cadena, String reemplazo) {
        String reemplazada = "";
        char reempla = reemplazo.charAt(0);
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().charAt(i) == 'a') {
                reemplazada += cadena.getFrase().replace('a', reempla);
            }
        }
        return reemplazada;
    }

    //h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    //ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public boolean contine(Cadena cadena, String letraABuscar) {
        boolean contiene = false;
        char letraAB = letraABuscar.charAt(0);
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().charAt(i) == letraAB) {
                contiene = true;
            }
        }
        return contiene;

    }
}
