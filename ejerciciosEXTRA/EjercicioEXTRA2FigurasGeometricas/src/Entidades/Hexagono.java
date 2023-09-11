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
public class Hexagono {

    private Scanner leer = new Scanner(System.in);

    public int lado;

    public Hexagono() {
    }

    public Hexagono(int lado) {
        this.lado = lado;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void crearHexagono() {

        System.out.println("Ingresa el valor del lado hexagono");
        lado = leer.nextInt();

    }

    public void obtenerArea() {

        System.out.println("El área es: " + (3 * Math.sqrt(3) * (lado ^ 2)) / 2);

    }

    public void obtenerPerimetro() {

        System.out.println("El perimetro es: " + 6 * lado);

    }

}
