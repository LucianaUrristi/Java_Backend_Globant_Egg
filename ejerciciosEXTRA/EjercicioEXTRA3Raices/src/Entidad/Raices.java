/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class Raices {
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*
        Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
        ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
        Hay que insertar estos 3 valores para construir el objeto a través de un método
        constructor. Luego, las operaciones que se podrán realizar son las siguientes:
    */
    private double a;
    private double b;
    private double c;
    
    public Raices() {
    }
    
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Scanner getLeer() {
        return leer;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    
    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public void crearCoeficientes(){
        System.out.println("Ingrese el coeficiente a:");
        a = leer.nextDouble();
        System.out.println("Ingrese el coeficiente b:");
        b = leer.nextDouble();
        System.out.println("Ingrese el coeficiente c:");
        c = leer.nextDouble();
    }
    
    // Método getDiscriminante(): devuelve el valor del discriminante (double). El
    //  discriminante tiene la siguiente formula: (b^2)-4*a*c
    public double getDiscriminante(){
        double discriminante = (Math.pow(b, 2) - 4 * a * c);
       
        return discriminante;
    }
    
    // Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
    //  que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices(){
        boolean raices = false;
        if (getDiscriminante() >= 0){
            raices = true;
        }
        return raices;
    }
    
    // Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
    //  que esto ocurra, el discriminante debe ser igual que 0.
    
    public boolean tieneRaiz(){
        boolean raices = false;
        if (getDiscriminante() == 0 ){
            raices = true;
        }
        return raices;
    }
    
    // Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
    //  posibles soluciones.
    
    public void obtenerRaices(){
        if(tieneRaices() == true){
            double resolventeNeg = (-b - (Math.sqrt(Math.pow(b, 2)-(4*a*c))))/ (2 * a);
            double resolventePos = (-b + (Math.sqrt(Math.pow(b, 2)-(4*a*c))))/ (2 * a);
            System.out.println("La primer posible solución es:  " + resolventeNeg);
            System.out.println("La segunda posible solución es:  " + resolventePos);
        }
    }
    
    // Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
    //  Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz(){
        double resolventeNeg = (-b - Math.sqrt(((Math.pow(b, 2)-(4*a*c)))))/ (2 * a);
        double resolventePos = (-b + Math.sqrt(((Math.pow(b, 2)-(4*a*c)))))/ (2 * a);
        
        if(tieneRaiz() == true){
            if ((a * Math.pow(resolventeNeg, 2) + b * resolventeNeg + c) == 0){
                System.out.println(resolventeNeg);
            } else {
                System.out.println(resolventePos);
            }
            
            System.out.println();
        }
    }
    /*  Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
        pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
        obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
        de no existir solución, se mostrará un mensaje.

        Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
        delante de -b
     */
public void calcular(){
    tieneRaices();
    tieneRaiz();
    if (tieneRaices() == true || tieneRaiz() == true) {
      obtenerRaices();
      obtenerRaiz();
    } else {
        System.out.println("un mensaje");
    }
    
}
    
}
