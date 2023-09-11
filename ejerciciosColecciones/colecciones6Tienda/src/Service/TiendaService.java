/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Tienda;
import static colecciones6tienda.Colecciones6Tienda.menu;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author lu_co
 */

public class TiendaService {
   
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Tienda tienda = new Tienda();
    

    public void guardarProducto() {

        boolean respuesta = true;

        while (respuesta) {
            
            System.out.println("Por favor, ingrese el producto: ");
            String nombreProducto = leer.nextLine();
            System.out.println("Por favor, ingrese el precio del producto: ");
            Double precio = leer.nextDouble();
            leer.nextLine();
                        
            tienda.put(nombreProducto, precio);
               
            System.out.println("¿Desea ingresar otra?s/n");
            String opcion = leer.nextLine();
            if (opcion.equalsIgnoreCase("n")) {
                menu(this);
                break;
            } else {
                respuesta = true;                
            }
        }

    }
    
    
    public void mostrarProductosOrdenados(){
        TreeMap<String, Double> productosOrdenados = new TreeMap<>();
        for (Map.Entry<String, Double> merch : tienda.getProductos().entrySet()){
            productosOrdenados.put(merch.getKey(), merch.getValue());
        }
        
        System.out.println("Los productos ordenados alfabéticamente son: ");
        for(Map.Entry<String, Double> mercancia : productosOrdenados.entrySet()){
            System.out.println(mercancia.getKey() + ": " + mercancia.getValue());
        }
        menu(this);
    }
    
    public void modificarPrecio() {
        System.out.println("Por favor, ingrese el producto que desea modificar.");
        String productoModificar = leer.nextLine();        
        
        if (tienda.getProductos().containsKey(productoModificar)){
            System.out.println("Ingrese el nuevo precio");
            Double precioNuevo = leer.nextDouble();
            tienda.getProductos().put(productoModificar, precioNuevo); 
            leer.nextLine();
        } else {
            System.out.println("Producto inválido");
        }
        
        menu(this);
    }
  
    public void eliminarProducto(){
        System.out.println("Por favor, ingrese el producto que desea eliminar.");
        String productoEliminar = leer.nextLine();
        
        if (tienda.getProductos().containsKey(productoEliminar)){
            tienda.getProductos().remove(productoEliminar); 
            System.out.println("Se ha eliminado el producto.");
        } else {
            System.out.println("Producto inválidooooo");
        }
       
        menu(this);
    } 
}
