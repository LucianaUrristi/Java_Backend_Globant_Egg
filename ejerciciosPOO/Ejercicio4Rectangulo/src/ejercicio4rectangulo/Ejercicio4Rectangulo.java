/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4rectangulo;

import Entidad.Rectangulo;
import Servicios.ServicioRectangulo;

/**
 *
 * @author lu_co
 */
public class Ejercicio4Rectangulo {

    /*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioRectangulo sr = new ServicioRectangulo();

        Rectangulo rectangulo = sr.crearRectangulo();

        System.out.println("La superficie del rectangulo ingresado es : " + sr.superficie(rectangulo));
        System.out.println("El perimetro del rectangulo ingresado es : " + sr.perimetro(rectangulo));

        sr.grafico(rectangulo);

    }

}
