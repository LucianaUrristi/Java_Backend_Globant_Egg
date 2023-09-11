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
public class Puntos {
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*
        Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
        atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
        usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
        los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
        que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
        calcular la distancia entre dos puntos consulte el siguiente link:
        http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
        */
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    
    public void crearPuntos(){
        System.out.println("Ingrese la primera coordenada [x, y]");
        x1 = leer.nextDouble();
        y1 = leer.nextDouble();
        System.out.println("Ingrese la segunda coordenada [x, y]");
        x2 = leer.nextDouble();
        y2 = leer.nextDouble();
        
    }
    public double calcularDistancia(){      
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }
}
