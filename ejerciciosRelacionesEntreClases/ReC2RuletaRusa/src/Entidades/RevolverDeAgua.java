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
public class RevolverDeAgua {
    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    public void llenarRevolver() {

        this.posicionAgua = (int) (Math.random() * (5 - 0) + 0);

        this.posicionActual = (int) (Math.random() * (5 - 0) + 0);
    }
    
    public boolean mojar(){
             
        return posicionAgua == posicionActual;
    }    
    
    public void siguienteChorro(){
        
        if (posicionActual < 5){
            this.posicionActual++;
        } else {
            this.posicionActual = 0;
        }
    }

    
    
    
    
    
    
}
