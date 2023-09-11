/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enum.Palo;

/**
 *
 * @author lu_co
 */
public class Carta {
    private int numCarta;
    private Palo palo;

    public Carta() {
    }

    public Carta(int numCarta, Palo palo) {
        this.numCarta = numCarta;
        this.palo = palo;
    }

    public int getNumCarta() {
        return numCarta;
    }

    public void setNumCarta(int numCarta) {
        this.numCarta = numCarta;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "numCarta=" + numCarta + ", palo=" + palo + '}';
    }

      
 
}
