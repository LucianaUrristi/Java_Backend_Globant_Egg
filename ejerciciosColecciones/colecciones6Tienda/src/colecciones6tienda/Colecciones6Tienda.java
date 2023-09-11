/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones6tienda;

import Entidad.Tienda;
import Service.TiendaService;
import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class Colecciones6Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
        productos que venderemos y el precio que tendrán. Además, se necesita que la
        aplicación cuente con las funciones básicas.
        Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
        eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
        Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
        Realizar un menú para lograr todas las acciones previamente mencionadas. 
        */
        TiendaService tS = new TiendaService();
        menu(tS);       
    }
    
    public static void menu(TiendaService tS) {
        System.out.println("Menú de opciones: ");
        System.out.println("1. Ingresar un nuevo producto.");
        System.out.println("2. Modificar el precio de un producto.");
        System.out.println("3. Eliminar un producto.");
        System.out.println("4. Mostrar los productos actuales.");
        System.out.println("5. Salir.");
        
        System.out.println("Por favor, ingrese la opción que desea realizar.");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
        
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                tS.guardarProducto();
                break;
            case 2:
                tS.modificarPrecio();
                break;
            case 3:
                tS.eliminarProducto();
                break;
            case 4:
                tS.mostrarProductosOrdenados();
                break;
            case 5:
                System.out.println("Saliendo...");
                System.exit(0);
                break;
            default:
                System.out.println("Opción inválida, por favor ingrese la opción nuevamente");
                break;
        }
    }

}
