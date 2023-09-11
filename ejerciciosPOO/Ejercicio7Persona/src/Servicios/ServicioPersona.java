/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;

/**
 *
 * @author lu_co
 */
public class ServicioPersona {

    public Persona crearPersona(String nombre, int edad, String sexo, float peso, float altura) {
        Persona persona = new Persona(nombre, edad, sexo, peso, altura);
        return persona;
    }
    
   /* Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.*/
    public int calcularIMC(Persona persona) {
        double formula = (double) persona.getPeso() / Math.pow(persona.getAltura(), 2);
        
        if (formula < 20) {
            return -1;
        } else if (formula >= 20 && formula <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
    //Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
    //devuelve un booleano.
    public boolean esMayorDeEdad(Persona persona){
        boolean mayor = false;
        if (persona.getEdad() >= 18){
            mayor = true;
        }
        return mayor;
    }



}
