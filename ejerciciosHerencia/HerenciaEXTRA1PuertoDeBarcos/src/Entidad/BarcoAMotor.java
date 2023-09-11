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
public class BarcoAMotor extends Barco{
    
    protected int potencia;

    public BarcoAMotor() {
    }

    public BarcoAMotor(int potencia, String matricula, int eslora, int anoDeFabricacion) {
        super(matricula, eslora, anoDeFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
}
