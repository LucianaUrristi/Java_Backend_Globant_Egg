/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12persona;

import Entidad.Persona;
import Servicios.ServicioPersona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class Ejercicio12Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
        (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
        métodos:
         Agregar un método de creación del objeto que respete la siguiente firma:
        crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
        usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
        fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
         Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
        en cuenta que para conocer la edad de la persona también se debe conocer la fecha
        actual.
         Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
        edad y retorna true en caso de que el receptor tenga menor edad que la persona que
        se recibe como parámetro, o false en caso contrario.
         Metodo mostrarPersona(): este método muestra la persona creada en el método
        anterior.
        */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre de la persona.");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la fecha de nacimiento de la persona. (Día, mes, año)");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();

        Date fechaNac = new Date(anio - 1900, mes - 1, dia);

        ServicioPersona sP = new ServicioPersona();
        Persona p1 = sP.crearPersona();
        p1.setNombre(nombre);
        p1.setFechaDeNacimiento(fechaNac);
       
        System.out.println(p1.getNombre() + " actualmente tiene " + p1.calcularEdad() + " años.");
        
        System.out.println("Ingrese la edad de otra persona");
        int edad = leer.nextInt();
        
        System.out.println(sP.menorQue(p1, edad));
       
        p1.mostrarPersona();
       
       
        
        
        
    }
    
}
