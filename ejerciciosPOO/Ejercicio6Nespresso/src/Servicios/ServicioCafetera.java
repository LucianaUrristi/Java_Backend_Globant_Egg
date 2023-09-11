/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cafetera;

/**
 *
 * @author lu_co
 */

public class ServicioCafetera {
    
    public Cafetera crearCafetera(int capacidadM, int cantidadA){
        Cafetera cafetera = new Cafetera(capacidadM, cantidadA);
        return cafetera;
    }
    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.

    public void llenarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        
    }
    /*Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    cuanto quedó la taza.*/
    public void servirTaza(Cafetera cafetera, int tazaVacia){
        int tazaLlena;
        if (cafetera.getCantidadActual() < tazaVacia){
            tazaLlena = cafetera.getCantidadActual();
            System.out.println("No había suficiente café para llenar la taza, su taza quedó en " + cafetera.getCantidadActual() + " cc.");
            cafetera.setCantidadActual(0);
        } else {
            tazaLlena = tazaVacia;
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tazaLlena);
            System.out.println("Su taza ha sido llenada, ahora su cantidad actual es de " + cafetera.getCantidadActual() + " cc de café.");cafetera.setCantidadActual(cafetera.getCantidadActual() - tazaLlena);
        }        
    }
    //Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
    }
    //Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    //recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(Cafetera cafetera, int cafe){
        if (cafetera.getCantidadActual() + cafe <= cafetera.getCapacidadMaxima()) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cafe);
            System.out.println("Se ha agregado la cantidad deseada. \nSu cafetera ahora posee un total de " + cafetera.getCantidadActual() + " cc de cafe.");
        } else {           
            System.out.println("La cantidad de café que desea agregar excede la capacidad máxima de su cafetera. Se llenó hasta su capacidad máxima.");
            System.out.println("Ha sobrado " + (cafe - (cafetera.getCapacidadMaxima() - cafetera.getCantidadActual())) + " cc de café.");
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        }
        
    }
}
