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
public class Rectangulo {

    private Scanner leer = new Scanner(System.in);

    public int base;
    public int altura;

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

    public void crearRectangulo() {

        System.out.println("Ingresa el valor de la base del rectangulo");
        base = leer.nextInt();
        System.out.println("Ingresa el valor de la altura del rectangulo");
        altura = leer.nextInt();

    }

    public void obtenerArea() {

        System.out.println("El área es: " + altura * base);

    }

    public void obtenerPerimetro() {

        System.out.println("El perimetro es: " + ((2 * altura) + (2 * base)));

    }
}
