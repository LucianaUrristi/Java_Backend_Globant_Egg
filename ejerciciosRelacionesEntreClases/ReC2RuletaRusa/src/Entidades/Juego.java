/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author lu_co
 * Clase Juego: esta clase
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
public class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r) {
        this.jugadores = jugadores;
        this.revolver = r;
    }

    public void ronda() {
        revolver.llenarRevolver();
        System.out.println("Iniciando ronda...");
        
        Iterator<Jugador> it = jugadores.iterator();
        while (true){
            if (it.hasNext()) {
                
                Jugador jugador = it.next();
                jugador.disparo(revolver);
                System.out.println("Turno del jugador " + jugador.getNombre());
                if (jugador.isMojado()) {
                    System.out.println(jugador.getNombre() + " mojado, chau");
                    
                    it.remove();
                    break;
                } else {
                    System.out.println("Safaste, continúa el juego...");
                    
                }
            } else {
                it = jugadores.iterator();
            }
        }
        System.out.println("Fin de juego.");
    }

}
