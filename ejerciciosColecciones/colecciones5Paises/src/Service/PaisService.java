/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Comparadores.Comparadores;
import Entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author lu_co
 */
public class PaisService {

    HashSet<Pais> paises = new HashSet();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void guardarPais() {

        boolean respuesta = true;

        while (respuesta) {
            System.out.println("Por favor, ingrese el país: ");
            String nombre = leer.nextLine();
            Pais pais = new Pais(nombre);
            paises.add(pais);
            
            System.out.println("¿Desea ingresar otra?s/n");
            if (leer.nextLine().equalsIgnoreCase("n")) {
                mostrarPaises();
                break;
            } else {
                respuesta = true;
            }
        }

    }
    
    private void mostrarPaises() {
        System.out.println("Los paises ingresadas son: ");
        for (Pais pais : paises) {
            System.out.println(pais.toString());

        }
        mostrarPaisesOrdenados();
    }
    
    private void mostrarPaisesOrdenados(){
        Set<String> paisesOrdenados = new TreeSet<>();
        for (Pais pais : paises){
            paisesOrdenados.add(pais.getPais());
        }
        System.out.println("Los paises ordenados alfabéticamente son: ");
        for(String nombre : paisesOrdenados){
            System.out.println(nombre);
        }
        System.out.println("¿Desea eliminar un país?s/n");
        if (leer.nextLine().equalsIgnoreCase("s")) {
            eliminarPais();
        } else {
            System.out.println("Finalizando programa...");
        }
        
    }
    
    private void eliminarPais(){
        System.out.println("Por favor, ingrese el pais que desea eliminar.");
        String paisEliminar = leer.nextLine();
        boolean paisEncontrado = false;
        Iterator<Pais> iterator = paises.iterator();
        
        while (iterator.hasNext()){
            Pais pais = iterator.next();
            if (pais.getPais().equalsIgnoreCase(paisEliminar)){
                iterator.remove();
                paisEncontrado = true;
            }
        }
        
        if (paisEncontrado){
            System.out.println("Se ha eliminado el país.");
        } else {
            System.out.println("No se ha encontrado el país en la lista.");
        }
        
        mostrarPaisesOrdenados();
    }
}
