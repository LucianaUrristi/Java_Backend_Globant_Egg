/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rec2ruletarusa;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class ReC2RuletaRusa {

    /**
     * Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben,
     * el juego se trata de un número de jugadores, que, con un revolver de
     * agua, el cual posee una sola carga de agua, se dispara y se moja. Las
     * clases por hacer del juego son las siguientes: Clase Revolver de agua:
     * esta clase posee los siguientes atributos: posición actual (posición del
     * tambor que se dispara, puede que esté el agua o no) y posición agua (la
     * posición del tambor donde se encuentra el agua). Estas dos posiciones, se
     * generarán aleatoriamente. Métodos: • llenarRevolver(): le pone los
     * valores de posición actual y de posición del agua. Los valores deben ser
     * aleatorios. • mojar(): devuelve true si la posición del agua coincide con
     * la posición actual • siguienteChorro(): cambia a la siguiente posición
     * del tambor • toString(): muestra información del revolver (posición
     * actual y donde está el agua) Clase Jugador: esta clase posee los
     * siguientes atributos: id (representa el número del jugador), nombre
     * (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
     * (indica si está mojado o no el jugador). El número de jugadores será
     * decidido por el usuario, pero debe ser entre 1 y 6. Si no está en este
     * rango, por defecto será 6. Métodos: • disparo(Revolver r): el método,
     * recibe el revolver de agua y llama a los métodos de mojar() y
     * siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y
     * si el revolver tira el agua, el jugador se moja. El atributo mojado pasa
     * a false y el método devuelve true, sino false. Clase Juego: esta clase
     * posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
     * Revolver Métodos: • llenarJuego(ArrayList<Jugador>jugadores, Revolver r):
     * este método recibe los jugadores y el revolver para guardarlos en los
     * atributos del juego.
     *
     * 10 • ronda(): cada ronda consiste en un jugador que se apunta con el
     * revolver de agua y aprieta el gatillo. Sí el revolver tira el agua el
     * jugador se moja y se termina el juego, sino se moja, se pasa al siguiente
     * jugador hasta que uno se moje. Si o si alguien se tiene que mojar. Al
     * final del juego, se debe mostrar que jugador se mojó. Pensar la lógica
     * necesaria para realizar esto, usando los atributos de la clase Juego.
     */
    public static void main(String[] args) {
        ArrayList<Jugador>jugadores = new ArrayList<>();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de jugadores");
        int cantidad = leer.nextInt();
        if (cantidad > 6) {
            System.out.println("Cantidad invalida, máximo 6");
            cantidad = 6;
        }
        
        
        for (int i = 0; i < cantidad; i++){
            
            System.out.println("Ingrese el id del jugador " + i);
            int id = leer.nextInt();            
            Jugador j = new Jugador(id, ("Jugador " + id), false);
            jugadores.add(j);
            
        }
        
        RevolverDeAgua r = new RevolverDeAgua();
        
        
        Juego juego = new Juego();
        juego.llenarJuego(jugadores, r);
        juego.ronda();
        
        
        
        
    }
    
}
