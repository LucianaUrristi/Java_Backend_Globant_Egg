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
public class Triangulo {

    private Scanner leer = new Scanner(System.in);

    public int base;
    public int altura;
    public int lado1;
    public int lado2;
    public int lado3;

    public void crearTriangulo() {
        System.out.println("Ingresa el valor de la base");
        base = leer.nextInt();
        System.out.println("Ingresa el valor de la altura");
        altura = leer.nextInt();
        System.out.println("Ingresa el valor del lado 1");
        lado1 = leer.nextInt();
        System.out.println("Ingresa el valor del lado 2");
        lado2 = leer.nextInt();
        System.out.println("Ingresa el valor del lado 3");
        lado3 = leer.nextInt();
    }

    public void obtenerArea() {
        System.out.println("El área es: " + (base * altura) / 2);
    }

    public void obtenerPerimetro() {
        System.out.println("El perimetro es: " + lado1 + lado2 + lado3);
    }
}
