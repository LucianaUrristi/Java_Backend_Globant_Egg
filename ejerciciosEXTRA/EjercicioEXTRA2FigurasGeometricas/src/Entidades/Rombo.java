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
public class Rombo {
       
      private Scanner leer = new Scanner(System.in);

    public int diagmayor;
    public int diagmenor;
    public int lado;

    public Rombo() {
    }

    public Rombo(int diagmayor, int diagmenor, int lado) {
        this.diagmayor = diagmayor;
        this.diagmenor = diagmenor;
        this.lado = lado;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getDiagmayor() {
        return diagmayor;
    }

    public void setDiagmayor(int diagmayor) {
        this.diagmayor = diagmayor;
    }

    public int getDiagmenor() {
        return diagmenor;
    }

    public void setDiagmenor(int diagmenor) {
        this.diagmenor = diagmenor;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public void crearRombo(){
         
         System.out.println("Ingresa el valor de la diagonal mayor");
         diagmayor = leer.nextInt();
         System.out.println("Ingresa el valor de la diagonal menor");
         diagmenor = leer.nextInt();
         System.out.println("Ingresa el valor del lado");
         lado = leer.nextInt();        
    }
    
    public void obtenerArea(){
         
        System.out.println("El área es: " + (diagmayor*diagmenor)/2 );        
    }
    
    public void obtenerPerimetro(){
       
        System.out.println("El perimetro es: " + 4*lado );       
    }        
} 