/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class AhorcadoService {
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*
    
 Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
 Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
 Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
 Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
 Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.

Un ejemplo de salida puede ser así:

Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:

q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades
    */
    
    /*
     Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
    */
    public Ahorcado llamado(){
        Ahorcado ahorcado = new Ahorcado();
        return ahorcado;
    }
    public void crearJuego(Ahorcado ahorcado){
       
        System.out.println("Ingrese la palabra a buscar:");
        String palabraIngresada = leer.nextLine();
        ahorcado.setPalabra(palabraIngresada.toCharArray());
        
        System.out.println("Ingrese la cantidad de jugadas maxima");
        ahorcado.setCantidadJugadasMax(leer.nextInt());
        int oportunidadesRestantes = ahorcado.getCantidadJugadasMax();
        ahorcado.setCantidadLetras(0);
        
        System.out.println("La longitud de la palabra es : " + ahorcado.getPalabra().length);
    }

    public void buscar(Ahorcado ahorcado, char letra, int oportunidadesRestantes) {
        boolean encontrada = false;
        int letrasEncontradas = 0;
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            if (ahorcado.getPalabra()[i] == letra) {
                encontrada = true;
                letrasEncontradas++;
                ahorcado.setCantidadLetras(letrasEncontradas);
            }
        }
        if (encontrada) {
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("La letra no pertenece a la palabra");
            oportunidadesRestantes--;
        }
        System.out.println("Número de letras (encontradas, faltantes): (" + ahorcado.getCantidadLetras() + "," + (ahorcado.getPalabra().length - ahorcado.getCantidadLetras()) + ")");
    }

    public boolean encontradas(char letra, Ahorcado ahorcado, int oportunidadesRestantes) {
            boolean encontrada = false;
            int letrasEncontradas = 0;
            
            for (int i = 0; i < ahorcado.getPalabra().length; i++) {
                if (ahorcado.getPalabra()[i] == letra) {
                encontrada = true;
                letrasEncontradas++;
                ahorcado.setCantidadLetras(letrasEncontradas);
            }
            }

            if (!encontrada) {
                oportunidadesRestantes--;
            }

            System.out.println("Número de letras (encontradas, faltantes): (" + ahorcado.getCantidadLetras() + "," + (ahorcado.getPalabra().length - ahorcado.getCantidadLetras()) + ")");

            return encontrada;
        }

        public void intentos(int oportunidadesRestantes) {
            System.out.println("Número de oportunidades restantes: " + oportunidadesRestantes);
        }

        public void juego(int oportunidadesRestantes, Ahorcado ahorcado) {
            

            while (ahorcado.getCantidadLetras() < ahorcado.getPalabra().length && oportunidadesRestantes > 0) {
                System.out.println("----------------------------------------------");
                System.out.println("Ingrese una letra: ");
                char letra = leer.nextLine().charAt(0);

                buscar(ahorcado, letra, oportunidadesRestantes);
                intentos(oportunidadesRestantes);
            }

            if (ahorcado.getCantidadLetras() == ahorcado.getPalabra().length) {
                System.out.println("¡Felicitaciones! Has descubierto toda la palabra.");
            } else {
                System.out.println("Lo sentimos, no hay más oportunidades. La palabra era: " + new String(ahorcado.getPalabra()));
            }
        }
}
