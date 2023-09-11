/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class ServicioOperacion {
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Operacion crearOperacion(){
        
        System.out.println("Ingrese el primer numero");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = leer.nextInt();
        
        Operacion primeraOperacion = new Operacion();
        primeraOperacion.setNumero1(numero1);
        primeraOperacion.setNumero2(numero2);
        
        return primeraOperacion;
    }
    public int sumar(int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
    }
    
    public int restar(int numero1, int numero2){
        int resta = numero1 - numero2;
        return resta;
    }
    /*Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
    fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
    Si no, se hace la multiplicación y se devuelve el resultado al main*/
    public int multiplicar (int numero1, int numero2){
        int multiplicacion = 1;
        if (numero1 == 0 || numero2 == 0){
            multiplicacion = 0;
            System.out.println("ERROR. Uno o ambos número es 0.");
        } else {
            multiplicacion = numero1 * numero2;
        }
        return multiplicacion;        
    }
    /*h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
    una división por cero, el método devuelve 0 y se le informa al usuario el error se le
    informa al usuario. Si no, se hace la división y se devuelve el resultado al main.*/
    public float dividir ( int numero1, int numero2){
        float division = 1;
        if (numero1 == 0 || numero2 == 0) {
            division = 0;
            System.out.println("ERROR. Uno o ambos número es 0.");
        } else {
            division = numero1 / numero2;
        }
        return division;
    }
}
