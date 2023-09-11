/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9matematica;

import Entidad.Matematica;


/**
 *
 * @author lu_co
 */
public class Ejercicio9Matematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realizar una clase llamada Matemática que tenga como atributos dos números reales con
        los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
        constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
        Math.random para generar los dos números y se guardaran en el objeto con su
        respectivos set. Deberá además implementar los siguientes métodos:

        a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
        b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
        elevado al menor número. Previamente se deben redondear ambos valores.
        c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
        Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
        
         */
        Matematica matematica = new Matematica();
        
        matematica.setNumero1((int) (Math.random() * 10));
        matematica.setNumero2((int) (Math.random() * 10));
        
        System.out.println(matematica.devolverMayor());
        System.out.println(matematica.calcularPotencia());
        System.out.println(matematica.calcularRaiz());
        
    }
    
}
