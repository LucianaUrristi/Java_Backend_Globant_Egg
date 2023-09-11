/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class Ejercicio11Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
        clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
        Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
        usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
        deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
        se puede conseguir instanciando un objeto Date con constructor vacío.
        Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
        Ejemplo fecha actual: Date fechaActual = new Date();
        */
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor, ingrese el día");
        int dia = leer.nextInt();
        System.out.println("Por favor, ingrese el mes");
        int mes = leer.nextInt();        
        System.out.println("Por favor, ingrese el año");
        int anio = leer.nextInt();
        
        Date fechaIngresada = new Date(anio - 1900, mes -1, dia);
        Date fechaActual = new Date ();
        
        int anios = calcularDiferenciaAnios(fechaIngresada, fechaActual);
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaIngresadaStr = formato.format(fechaIngresada);
        String fechaActualStr = formato.format(fechaActual);
        
        System.out.println("Fecha ingresada: " + fechaIngresadaStr);
        System.out.println("La fecha actual: " + fechaActualStr);
        System.out.println("La diferencia de años entre una fecha y la otra es de: " + anios);
        
        
    }
    private static int calcularDiferenciaAnios(Date fechaInicio, Date fechaFin){
        int anioInicio = fechaInicio.getYear();
        int anioFin = fechaFin.getYear();

        if (fechaFin.getMonth() < fechaInicio.getMonth()
                || (fechaFin.getMonth() == fechaInicio.getMonth() && fechaFin.getDate() < fechaInicio.getDate())) {
            anioFin--;
        }

        return anioFin - anioInicio;
    }
 
}
