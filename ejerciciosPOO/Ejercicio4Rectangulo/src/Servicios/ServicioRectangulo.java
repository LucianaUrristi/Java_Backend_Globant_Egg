/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class ServicioRectangulo {
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Rectangulo crearRectangulo(){
        System.out.println("Ingrese la base del rectángulo");
        float base1 = leer.nextInt();
        System.out.println("Ingrese la altura del rectángulo");
        float altura1 = leer.nextInt();        
        Rectangulo primerRectangulo = new Rectangulo(base1, altura1);        
        return primerRectangulo;
    }
    public float superficie(Rectangulo rectangulo){
        float superficie = (rectangulo.getBase() * rectangulo.getAltura());
        return superficie;
    }
    public float perimetro(Rectangulo rectangulo){
        float perimetro = (rectangulo.getBase() + rectangulo.getAltura()) * 2;
        return perimetro;
    }    
    public void grafico(Rectangulo rectangulo){
        for (int i = 1; i <= rectangulo.getAltura(); i++){
            for(int j = 1; j <= rectangulo.getBase(); j++){
                if ((i == 1 || i == rectangulo.getAltura()) || (j == 1 || j == rectangulo.getBase())){
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
    }
}
