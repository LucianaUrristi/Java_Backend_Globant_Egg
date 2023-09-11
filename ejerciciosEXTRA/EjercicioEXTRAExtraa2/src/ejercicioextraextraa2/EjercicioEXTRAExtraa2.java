/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextraextraa2;

import Entidades.Alquiler;
import Entidades.Pelicula;
import Servicios.AlquilerService;
import Servicios.PeliculaService;
import java.text.ParseException;
import java.util.Arrays;

/**
 *
 * @author lu_co
 */
public class EjercicioEXTRAExtraa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        /*
        Escribir un programa en Java que simule un servicio de alquiler de películas. El programa debe tener una clase Pelicula
que represente los datos de una película, como el título, el género, el año y la duración. El programa también debe tener
una clase Alquiler que represente los datos de un alquiler, como la película alquilada, la fecha de inicio, la fecha de fin y
el precio.
El programa puede usar la clase Date para manejar las fechas, la clase Arrays para almacenar y ordenar las películas y
los alquileres, la clase Math para calcular el precio según la duración y el género de la película, y la clase String para
manipular los textos.
El programa debe permitir al usuario ingresar los datos de las películas disponibles y los datos de los alquileres
realizados, y mostrar por pantalla un menú con las opciones de cargar una pelicula, hacer una lista de todas las peliculas
disponibles, crear un alquiler, realizar una lista de todos los alquileres, buscar peliculas por titulo o por genero y buscar
alquileres por fecha.
        
        Metodos de ambas entidades (realizar los metodos en las clases de
servicio):
Crear Película
Crear Alquiler
Listar todas las películas disponibles
Listar todas las películas alquiladas
Buscar una película por título (Decir si se existe o no)
Buscar una película por género (Decir si se existe o no)
Buscar un alquiler por fecha (Decir si se existe o no, y si existe, mostrar los datos del alquiler)
Calcular el ingreso total del servicio (El alquiler cuesta $10, por 3 días. Por cada día extra, se aumenta un 10% de
interés.)
El programa debe validar que los datos ingresados por el usuario sean correctos y mostrar mensajes de error en caso
contrario. El programa debe terminar cuando el usuario elija la opción de salir.
        
        Deben:
Se deben crear al menos 5 películas, junto con todos sus datos.
Se deben realizar 3 alquileres de películas.
Mostrar todas las películas cargadas.
Mostrar todos los alquileres realizados.
Será importante que al realizar el programa, hacer sus respectivos servicios (AlquilerService y PeliculasService).
        */
        PeliculaService pS = new PeliculaService();
        AlquilerService aS = new AlquilerService();
        

        Pelicula pelicula = pS.crearPelicula(); 
        Alquiler alquiler = aS.crearAlquiler();
        
        /*
        Pelicula pelicula1 = pS.crearPelicula("Mama Mía", "Drama", 2008, 108);
        Pelicula pelicula2 = pS.crearPelicula("Terminator", "Acción", 1984, 107);
        Pelicula pelicula3 = pS.crearPelicula("Lilo y Stitch", "Infantil", 2002, 85);
        Pelicula pelicula4 = pS.crearPelicula("Madagascar", "Infantil", 2005, 86);
        Pelicula pelicula5 = pS.crearPelicula("Buscando a Nemo", "Infantil", 2003, 100);
        
        Alquiler alquiler = aS.crearAlquiler("Terminator", 25/2/2002, 29/2/2002);
        Alquiler alquiler = aS.crearAlquiler();
        Alquiler alquiler = aS.crearAlquiler();
        */
                
        
        pS.listarPeliculas();
        
        if (pS.buscarPorTitulo(pelicula, pS.listarPeliculas()) == true) {
            System.out.println("La película aparece en el listado");
        } else {
            System.out.println("La pelicula está fuera del listado");
        }
        
        if (pS.buscarPorGenero(pelicula, pS.listarGeneros()) == true) {
            System.out.println("La película aparece en el listado");
        } else {
            System.out.println("La pelicula está fuera del listado");
        }
        
      /*   if (pS.buscarPorFecha(pelicula, pS.listarFecha()) == true) {
            System.out.println("La película aparece en el listado");
        } else {
            System.out.println("La pelicula está fuera del listado");
        }
*/
       if (aS.buscarPorFecha(alquiler, aS.listarAlquiler(), aS.listarFechaFin()) == true) {
            System.out.println("La película aparece en el listado");
        } else {
            System.out.println("La pelicula está fuera del listado");
        }
       if (aS.buscarPorFecha(alquiler, aS.listarAlquiler(), aS.listarFechaFin()) == true) {
            System.out.println(aS.calcularPrecio(alquiler));
        } else {
            System.out.println("La pelicula está fuera del listado");
        }
        
       

    }
    
    
    
    
    

}
