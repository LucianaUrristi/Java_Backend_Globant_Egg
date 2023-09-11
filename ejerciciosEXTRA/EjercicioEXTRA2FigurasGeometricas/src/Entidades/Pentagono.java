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
public class Pentagono {

    private Scanner leer = new Scanner(System.in);

    public int lado;
    public int apotema;

    public Pentagono() {
    }

    public Pentagono(int lado) {
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

    public void crearPentagono() {

        System.out.println("Ingresa el valor del lado pentagono");
        lado = leer.nextInt();
        System.out.println("Ingresa el valor del apotema pentagono");
        apotema = leer.nextInt();
    }

    public void obtenerArea() {

        System.out.println("El área es: " + (5 * lado * apotema) / 2);

    }

    public void obtenerPerimetro() {

        System.out.println("El perimetro es: " + 5 * lado);

    }
}
