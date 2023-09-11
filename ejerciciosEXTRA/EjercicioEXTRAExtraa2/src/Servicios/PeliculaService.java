/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class PeliculaService {
    
    /*
    Listar todas las películas disponibles
Listar todas las películas alquiladas
Buscar una película por título (Decir si se existe o no)
Buscar una película por género (Decir si se existe o no)
*/
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Pelicula crearPelicula(){
        Pelicula pelicula = new Pelicula();
                
        return pelicula;
    }
    public String[] listarPeliculas(){
        String[] listado = {"Mama mia", "Terminator", "Lilo y Stitch", "Madagascar", "Buscando a Nemo"};
        System.out.println("Las peliculas disponibles son: ");
        for (int i = 0; i < listado.length; i++){
            System.out.println(listado[i]);
        }
        return listado;
    }
     public String[] listarGeneros(){
        String[] listado = {"Drama", "Accion", "Infantil"};
        
        return listado;
    }
    
    public int[] listarFecha() {
        int[] listado = {2007, 1990, 2002, 2004, 2003};
        
        return listado;
    }
    
    public boolean buscarPorTitulo(Pelicula pelicula, String[] listado){
        boolean busqueda = false;
        System.out.println("Ingrese la pelicula a buscar: ");
        pelicula.setTitulo(leer.nextLine());    
        
        for (int i = 0; i < listado.length; i++){            
            if (pelicula.getTitulo().equals(listado[i])) {
                busqueda = true;               
            }
        }
        return busqueda;        
    }
    public boolean buscarPorGenero(Pelicula pelicula, String[] listado){
        boolean busqueda = false;
        System.out.println("Ingrese el género de la pelicula a buscar: ");
        pelicula.setGenero(leer.nextLine());    
        
        for (int i = 0; i < listado.length; i++){            
            if (pelicula.getGenero().equals(listado[i])) {
                busqueda = true;               
            }
        }
        return busqueda;        
    }
    
}
