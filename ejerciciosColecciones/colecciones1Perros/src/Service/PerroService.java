/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Raza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class PerroService {

    ArrayList<String> razaPerro = new ArrayList();

    public void guardarRaza() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Por favor, ingrese la raza: ");
        boolean respuesta = true;
        while (respuesta) {
            razaPerro.add(leer.nextLine());
            System.out.println("¿Desea ingresar otra?s/n");
            if (leer.nextLine().equalsIgnoreCase("n")) {
                System.out.println("Las razas ingresadas son: ");
                for (String raza : razaPerro) {
                    System.out.println(raza);
                }
                break;
            } else {
                respuesta = true;
            }
        }

    }
    /*2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
        un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
        está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
        ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
        la lista ordenada.
    */
    public void buscarPerro(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el perro a buscar:");
        String perro = leer.nextLine();
        boolean flag = false;
        Iterator iterador = razaPerro.iterator();
        
        
        while (iterador.hasNext()){
            if (iterador.next().equals(perro)){
                iterador.remove();
                flag = true;
            } 
        }
        if(!flag){
            System.out.println("Perro desaparecido."); 
        }
        System.out.println("Las razas son: ");        
        for(String raza: razaPerro){
            System.out.println(raza);
        }     
        
    }
}
