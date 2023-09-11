/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author lu_co
 */
public class Velero extends Barco {
    protected int numeroDeMastiles;

    public Velero(int numeroDeMastiles, String matricula, int eslora, int anoDeFabricacion) {
        super(matricula, eslora, anoDeFabricacion);
        this.numeroDeMastiles = numeroDeMastiles;
    }

    public Velero() {
    }

    public int getNumeroDeMastiles() {
        return numeroDeMastiles;
    }

    public void setNumeroDeMastiles(int numeroDeMastiles) {
        this.numeroDeMastiles = numeroDeMastiles;
    }
    
    
}
