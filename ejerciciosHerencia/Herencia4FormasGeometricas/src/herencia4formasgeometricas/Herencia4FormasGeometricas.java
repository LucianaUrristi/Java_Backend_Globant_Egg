/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4formasgeometricas;

import Entidades.Circulo;
import Entidades.Rectangulo;

/**
 *
 * @author lu_co
 */
public class Herencia4FormasGeometricas {

    /**
     * Se plantea desarrollar un programa que nos permita calcular el área y el
     * perímetro de formas geométricas, en este caso un círculo y un rectángulo.
     * Ya que este cálculo se va a repetir en las dos formas geométricas, vamos
     * a crear una Interfaz, llamada calculosFormas que tendrá, los dos métodos
     * para calcular el área, el perímetro y el valor de PI como constante.
     * Desarrollar el ejercicio para que las formas implementen los métodos de
     * la interfaz y se calcule el área y el perímetro de los dos. En el main se
     * crearán las formas y se mostrará el resultado final. Área circulo: PI *
     * radio ^ 2 / Perímetro circulo: PI * diámetro. Área rectángulo: base *
     * altura / Perímetro rectángulo: (base + altura) * 2.
     *
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Circulo c1 = new Circulo(10, 5);
        
        Rectangulo r1 = new Rectangulo(10, 2);
        
        //se llama a los metodos de los objetos creados, como ya tienen un sout
        //dentro del metodo no hace falta poner el sout aca, ademas de que son metodos void
        //si retornaran algo si tengo que poner el sout aca.
        c1.area();
        c1.perimetro();
        r1.area();
        r1.perimetro();
      
    }
    
}
