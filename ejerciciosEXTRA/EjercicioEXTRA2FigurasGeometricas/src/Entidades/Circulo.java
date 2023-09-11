/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class Circulo {

    private Scanner leer = new Scanner(System.in);

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCirculo() {

        System.out.println("Ingresa el valor del radio de la circunferencia");
        radio = leer.nextDouble();

    }

    public void obtenerArea() {

        System.out.println("El área es: " + radio * radio * Math.PI);

    }

    public void obtenerPerimetro() {

        System.out.println("El perimetro es: " + 2 * radio * Math.PI);

    }

}
