
package ejercicio2circunferencia;

import Entidad.Circunferencia;
import Service.ServicioCircunferencia;



/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
*/

/**
 *
 * @author lu_co
 */
public class Ejercicio2Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCircunferencia sc = new ServicioCircunferencia(); //mi nuevo objeto de tipo ServicioCircunferencia
        Circunferencia c1 = sc.crearCircunferencia(); //c1 es mi primer objeto de tipo Circunferencia
        //System.out.println(c1.getRadio()); para imprimir un atributo del objeto c1
        
       
        float perimetro1 = sc.perimetro(c1.getRadio()); //se pasa el valor de retorno del metodo getRadio()
        System.out.println(perimetro1);
        
        float area1 = sc.area(c1); //el metodo area recibe un objeto directamente, sin pasarle ningun valor de retorno de ningun metodo
    //    float area1 = sc.area(c1.getRadio()); //asigna a una variable
        System.out.println(area1); //imprimo esa variable
        //System.out.println(sc.area(c1.getRadio())); //se imprime directamente sin asignar a ninguna variable
    }
}
