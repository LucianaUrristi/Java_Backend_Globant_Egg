/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Enum.Palo;

/**
 *
 * @author lu_co
 */
public class Baraja {
    
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> cartasEntregadas = new ArrayList<>();
    

    public Baraja() {
        cartas = new ArrayList<>();
        for (Palo palo : Palo.values()) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    cartas.add(new Carta(i, palo));
                }
            }
        }
        barajar();
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
    //barajar(): cambia de posición todas las cartas aleatoriamente. •

    public final void barajar() {        
        Collections.shuffle((List<Carta>) cartas);
    }    
    
    //siguienteCarta(): devuelve la siguiente carta que está en la baraja,
    // cuando no haya más o se haya llegado al final, se indica al usuario que
    // no hay más cartas.
    public Carta siguienteCarta(){
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
        cartasEntregadas.add(cartas.get(0));
        return cartas.remove(0);
    }
    
    // cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public int cartasDisponibles(){
        
        return cartas.size();
    }
    
    //darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de cartas. En caso de que haya menos
    //cartas que las pedidas, no devolveremos nada, pero debemos indicárselo al
    //usuario.
    public ArrayList<Carta> darCartas(int numCartas){
        ArrayList<Carta> cartasDadas = new ArrayList<>();
        if (numCartas > cartas.size()) {
            System.out.println("No hay suficientes cartas disponibles.");
            return null;
        }

        for (int i = 0; i < numCartas; i++) {
            cartasDadas.add(cartas.get(0));
            siguienteCarta();
        }
        return cartasDadas;
    }
    
    //cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario
    public void cartasMonton(){
        if (cartasEntregadas.isEmpty()) {
            System.out.println("No ha salido ninguna carta aún.");
            return;
        }

        System.out.println("Cartas en el montón:");
        for (Carta carta : cartasEntregadas) {
            System.out.println(carta);
        }
    }
    
    //mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y luego
    //se llama al método, este no mostrara esa primera carta.
    public void mostrarBaraja(){
        for (Carta carta : cartas) {
            System.out.println(cartas.indexOf(carta) + " " + carta );
        }
    }
}
