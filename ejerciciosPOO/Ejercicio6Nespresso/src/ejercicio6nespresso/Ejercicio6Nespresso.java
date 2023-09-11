/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6nespresso;

import Entidad.Cafetera;
import Servicios.ServicioCafetera;
import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class Ejercicio6Nespresso {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    /*
    Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
    */
    public static void main(String[] args) throws InterruptedException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioCafetera serviceCafetera = new ServicioCafetera(); //mi nuevo objeto de tipo ServicioCircunferencia
        System.out.println("Ingrese la capacidad maxima de la cafetera.");
        int capacidadM = leer.nextInt();
        System.out.println("Ingrese la cantidad actual.");
        int cantidadA = leer.nextInt();
        Cafetera cafetera = serviceCafetera.crearCafetera(capacidadM, cantidadA);
    //    Cafetera pepito = serviceCafetera.crearCafetera(500, 250); PARA CREAR MAS CAFETERAS SIN PEDIR LOS DATOS AL USUARIO
        menu(cafetera, serviceCafetera); //para usar otra cafetera, se pasa en el menu el nombre de la otra. Ej: en vez de cafetera, paso pepito
    }
    public static void menu(Cafetera cafetera, ServicioCafetera serviceCafetera) throws InterruptedException{
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        System.out.println("Bienvenido, ¿Qué operación desea realizar?");
        System.out.println("1. Llenar cafetera.");
        System.out.println("2. Servir taza.");
        System.out.println("3. Vaciar cafetera.");
        System.out.println("4. Agregar café.");
        System.out.println("5. Salir.");
       
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Llenando...");
                
                serviceCafetera.llenarCafetera(cafetera);               
                System.out.println("Listo, su cafetera ha sido llenada, ahora su cantidad acutal es de " + cafetera.getCantidadActual() + " cc de café.");
                menu(cafetera, serviceCafetera);                
                break;
            case 2:
                System.out.println("Ingrese el tamaño de la taza vacia: ");
                int tazaVacia = leer.nextInt();
                System.out.println("Sirviendo...");          
                serviceCafetera.servirTaza(cafetera, tazaVacia);
                
                menu(cafetera, serviceCafetera);
                break;
            case 3:
                serviceCafetera.vaciarCafetera(cafetera);
                System.out.println("Su cafetera ha sido vaciada.");
                menu(cafetera, serviceCafetera);
                break;
            case 4:
                System.out.println("Ingrese la cantidad de cafe que desea agregar: ");
                int cafe = leer.nextInt();
                serviceCafetera.agregarCafe(cafetera, cafe);
                
                menu(cafetera, serviceCafetera);
                break;
            case 5:
                break;
            
        }
    }
}
