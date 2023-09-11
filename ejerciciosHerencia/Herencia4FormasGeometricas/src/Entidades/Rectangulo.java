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
public class Rectangulo implements calculosFormas {
    protected int base;
    protected int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    //Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
    
    @Override
    public void area() {
        System.out.println("El área del rectángulo es: " + (base * altura));
    }

    @Override
    public void perimetro() {
        System.out.println("El perímetro del rectángulo es: " + ((base + altura) * 2));
    }

    
    
    
}
