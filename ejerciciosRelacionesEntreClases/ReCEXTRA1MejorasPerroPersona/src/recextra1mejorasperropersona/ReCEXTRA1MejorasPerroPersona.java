/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recextra1mejorasperropersona;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author lu_co
 */
public class ReCEXTRA1MejorasPerroPersona {

    /**
     * Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona.
     * Nuestro programa va a tener que contar con muchas personas y muchos
     * perros. El programa deberá preguntarle a cada persona, que perro según su
     * nombre, quiere adoptar. Dos personas no pueden adoptar al mismo perro, si
     * la persona eligió un perro que ya estaba adoptado, se le debe informar a
     * la persona. Una vez que la Persona elige el Perro se le asigna, al final
     * deberemos mostrar todas las personas con sus respectivos perros.
     *
     * @param args
     */
    public static void main(String[] args) {
        List<Perro> perros = new ArrayList();
        List<Persona> p = new ArrayList();
        
        Perro m1 = new Perro("Aneu", "Salchicha", 1, "Pequeño");
        Perro m2 = new Perro("Homero", "Golden", 8, "Mediano");
        Perro m3 = new Perro("Samira", "Golden Retrucha", 11, "Mediano");
                
        perros.add(m1);
        perros.add(m2);
        perros.add(m3);
        
        Persona p1 = new Persona("Martin", "Piñeiro", 30, 37121231, m1);
        Persona p2 = new Persona("Luciana", "Urristi", 29, 38400854, m2);
                
        p.add(p1);
        p.add(p2);
        
        
        for (Persona persona : p){
            System.out.println("Hola " + persona.getNombre() + ", esta es la lista de perros en adopcion:");
            
            for (Perro dog : perros){
                if(!dog.isAdoptado()){
                    System.out.println(dog.toString());
                }
            }
            
            System.out.println("Elegí el perro que deseas adoptar:");
            Scanner leer = new Scanner(System.in);
            String perroElegido = leer.next();
            
            if (!perroElegido.equalsIgnoreCase("No")){
                Perro perroAdoptar = null;
                for (Perro perro : perros){
                    if (perro.getNombre().equalsIgnoreCase(perroElegido) && !perro.isAdoptado()) {
                        perroAdoptar = perro;
                        break;
                    }
                }
                persona.adoptarPerro(perroAdoptar);
            }
            
        }
        
        System.out.println("Lista de personas y sus perros");
        for (Persona persona : p){
            System.out.println(persona.toString());
        }
       
    }
    
}
