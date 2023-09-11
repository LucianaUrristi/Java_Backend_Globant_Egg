/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Comparadores.Comparadores;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class PeliculaService {

    ArrayList<Pelicula> peliculas = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void guardarPelicula() {
        
        boolean respuesta = true;
        
        while (respuesta) {
            System.out.println("Por favor, ingrese el nombre de la película: ");
            String titulo = leer.nextLine();
            System.out.println("Ingrese el director de la película: ");
            String director = leer.nextLine();
            System.out.println("Ingrese la duración de la película en horas: ");
            Double duracion = leer.nextDouble();
            leer.nextLine();
            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            peliculas.add(pelicula);
            
            System.out.println("¿Desea ingresar otra?s/n");
            if (leer.nextLine().equalsIgnoreCase("n")) {
                System.out.println("Las peliculas ingresadas son: ");
                for (Pelicula peli : peliculas) {
                    System.out.println(peli.toString());
                    
                }     
                mostrarPeliculaDuracionMayorUnaHora();
                ordenarPelis();
                break;
            } else {
                respuesta = true;
            }
        }
        
    }
    
    public void mostrarPeliculaDuracionMayorUnaHora() {
        ArrayList<Pelicula> peliculaMayorUnaHora = new ArrayList();

        for (Pelicula pelicula : peliculas) {

            if (pelicula.getDuracion() > 1) {
                peliculaMayorUnaHora.add(pelicula);
            }
        }
        System.out.println("-------------------");
        System.out.println("Las peliculas con una duracion mayor a 1 hora son: ");
        for (Pelicula pelicula : peliculaMayorUnaHora){
            System.out.println(pelicula);    
        }
        
    }
    
    public void ordenarPelis() {
        System.out.println("-------------------");
        System.out.println("Ordenando películas según duración ascendente...");
        System.out.println("-------------------");
        Collections.sort(peliculas, Comparadores.ordenarPorOrdenAscendente);
        for (Pelicula pelicula : peliculas){
            System.out.println(pelicula);    
        }
        System.out.println("-------------------");

        System.out.println("Ordenando películas según duración descendente...");
        System.out.println("-------------------");
        Collections.sort(peliculas, Comparadores.ordenarPorOrdenDescendente);
        for (Pelicula pelicula : peliculas){
            System.out.println(pelicula);    
        }
        System.out.println("-------------------");
        System.out.println("Ordenando películas según titulo...");
        System.out.println("-------------------");
        Collections.sort(peliculas, Comparadores.ordenarPorTitulo);
        for (Pelicula pelicula : peliculas){
            System.out.println(pelicula);    
        }
        System.out.println("-------------------");
        System.out.println("Ordenando películas según director...");
        System.out.println("-------------------");
        Collections.sort(peliculas, Comparadores.ordenarPorDirector);
        for (Pelicula pelicula : peliculas){
            System.out.println(pelicula);    
        }
        System.out.println("-------------------");
    }
    
}
