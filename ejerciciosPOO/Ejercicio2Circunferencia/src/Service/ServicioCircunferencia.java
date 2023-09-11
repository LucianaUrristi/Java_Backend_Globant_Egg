/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;


import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class ServicioCircunferencia {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Circunferencia crearCircunferencia(){
        
        System.out.println("Ingrese el radio de la circunferencia a calcular.");
        float radio = leer.nextFloat();
        
        //Circunferencia c = new Circunferencia(radio);
        //return c;
        return new Circunferencia(radio);
    }
    
    public float perimetro(float radio) {  //se pasa el atributo del objeto y hace la operacion
        float perimetro = (float) (2 * Math.PI * radio); 
        return perimetro;
    }
    public float area(Circunferencia c) { //pasamos directamente el objeto ya que este ya tiene un metodo que devuelve el area
        
        return c.getArea();
    }
}
    