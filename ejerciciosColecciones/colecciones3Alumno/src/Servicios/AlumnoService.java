/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class AlumnoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Alumno> ingresarAlumno() {
        boolean respuesta = false;
        ArrayList<Alumno> alumnos = new ArrayList();       
        
        while (!respuesta) {
            System.out.println("Ingrese el nombre del alumno, al finalizar ingrese 'fin': ");
            String nombre = leer.nextLine();            
            ArrayList<Integer> notas = new ArrayList();
            if (!nombre.equals("fin")) {
                System.out.println("Ingrese la primera nota: ");
                notas.add(leer.nextInt());
                System.out.println("Ingrese la segunda nota: ");
                notas.add(leer.nextInt());
                System.out.println("Ingrese la tercera nota: ");
                notas.add(leer.nextInt());                
                alumnos.add(new Alumno(nombre, notas));
                leer.nextLine();
            } else {
                respuesta = true;
            }
        }
        return alumnos;
    }

    public String notaFinal(ArrayList<Alumno> listaAlumnos) {
        System.out.println("Ingrese el nombre del alumno que desea calcular la nota: ");
        String nombreAlumno = leer.nextLine();        
        Iterator<Alumno> iterator = listaAlumnos.iterator();
        while(iterator.hasNext()){
            Alumno alumno = iterator.next();
            if(alumno.getNombre().equals(nombreAlumno)){
                return alumno.calcularPromedio().toString();
            }else {
                return "No se encuentra nada en la lista.";
            }            
        }
        return "No hay nada en la lista.";
    }
    

}
