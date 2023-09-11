/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Interfaces.calculosFormas;

/**
 *
 * @author lu_co
 */
public class Circulo implements calculosFormas {
    protected int radio;
    protected int diametro;

    public Circulo() {
    }

    public Circulo(int radio, int diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }
    
    //Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro. 
    
    @Override
    public void area() {
        System.out.println("El área del círculo es: " + (CONSTANTE * radio));
    }

    @Override
    public void perimetro() {
        System.out.println("El perímetro del círculo es: " + (CONSTANTE * diametro));
    }

    
    
    
    
}
