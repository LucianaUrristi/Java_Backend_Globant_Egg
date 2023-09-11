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
public class YateDeLujo extends BarcoAMotor {
    
    protected int numeroDeCamarotes;

    public YateDeLujo() {
    }

    public YateDeLujo(int numeroDeCamarotes, int potencia, String matricula, int eslora, int anoDeFabricacion) {
        super(potencia, matricula, eslora, anoDeFabricacion);
        this.numeroDeCamarotes = numeroDeCamarotes;
    }

    public int getNumeroDeCamarotes() {
        return numeroDeCamarotes;
    }

    public void setNumeroDeCamarotes(int numeroDeCamarotes) {
        this.numeroDeCamarotes = numeroDeCamarotes;
    }

    
    
    
}
