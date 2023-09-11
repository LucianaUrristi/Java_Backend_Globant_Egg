/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author lu_co
 */
public class Ahorcado {
   /* Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a palabra, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
*/
    private char[] palabra;
    private int cantidadLetras;
    private int cantidadJugadasMax;

    public Ahorcado() {
        palabra = null;
        cantidadLetras = 0;
        cantidadJugadasMax = 0;
    }

    public Ahorcado(char[] palabra, int cantidadLetras, int cantidadJugadasMax) {
        this.palabra = palabra;
        this.cantidadLetras = 0;
        this.cantidadJugadasMax = cantidadJugadasMax;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getCantidadLetras() {
        return cantidadLetras;
    }

    public void setCantidadLetras(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }

    public int getCantidadJugadasMax() {
        return cantidadJugadasMax;
    }

    public void setCantidadJugadasMax(int cantidadJugadasMax) {
        this.cantidadJugadasMax = cantidadJugadasMax;
    }

   
    
    
    
}
