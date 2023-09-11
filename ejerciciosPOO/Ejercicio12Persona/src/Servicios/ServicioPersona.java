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
//        Agregar un método de creación del objeto que respete la siguiente firma:
//        crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
//        usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
//        fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    public Persona crearPersona(){
            Persona p1 = new Persona();
            return p1;
        }
    
//        
    
//         Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
//        edad y retorna true en caso de que el receptor tenga menor edad que la persona que
//        se recibe como parámetro, o false en caso contrario.
    public boolean menorQue(Persona p1, int edad){
        boolean menor = false;
        
        if (p1.calcularEdad() > edad){
            menor = true;
        }
        
        return menor;
    }

}
