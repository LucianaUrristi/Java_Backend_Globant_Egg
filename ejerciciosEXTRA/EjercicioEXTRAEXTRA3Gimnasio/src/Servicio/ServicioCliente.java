/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class ServicioCliente {
    
    
    ArrayList<Cliente> listaDeClientes = new ArrayList<>();
    
    public void registrarCliente() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("REGISTRAR CLIENTE");
        System.out.println("ID");
        int id = leer.nextInt();
        System.out.println("NOMBRE");
        String nombre = leer.next();
        System.out.println("EDAD");
        int edad = leer.nextInt();
        System.out.println("ALTURA");
        double altura = leer.nextInt();
        System.out.println("PESO");
        double peso = leer.nextInt();
        System.out.println("OBJETIVO");
        String objetivo = leer.next();
        
        Cliente cl = new Cliente(id, nombre, edad, altura, peso, objetivo);
    
        listaDeClientes.add(cl);
    }
    
    public void obtenerClientes() {
        listaDeClientes.forEach((obj) -> {
            System.out.println(obj);
        });
    }
    
    public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {
        for (int i = 0; i < listaDeClientes.size(); i++) {
            if ( listaDeClientes.get(i).getId() == id ) {
                listaDeClientes.get(i).setId(id);
                listaDeClientes.get(i).setNombre(nombre);
                System.out.println("ACTUALIZANDO CLIENTES:");
            }
        }
    }
    
    public void eliminarCliente(int id) {
        for (int i = 0; i < listaDeClientes.size(); i++) {
            if ( listaDeClientes.get(i).getId() == id ) {
                listaDeClientes.remove(i);
            }
        }
        System.out.println("ELIMINANDO CLIENTES:");
    }
    
    /*
        // Agregar elementos a un ArrayList
        nombreArrayList.add("Elemento 1");
        nombreArrayList.add("Elemento 2");
        nombreArrayList.add("Elemento 3");

        // Leer elementos de un ArrayList
        System.out.println("Elemento en la posición 0: " + nombreArrayList.get(0));

        // Actualizar elementos de un ArrayList
        nombreArrayList.set(1, "Nuevo Elemento 2");

        // Eliminar elementos de un ArrayList
        nombreArrayList.remove(2);

        // Mostrar elementos del ArrayList
        System.out.println("Elementos en el ArrayList:");
        for (String elemento : nombreArrayList) {
            System.out.println(elemento);
        }

        // Eliminar todos los elementos del ArrayList
        nombreArrayList.clear();

        // Verificar si el ArrayList está vacío
        System.out.println("El ArrayList está vacío: " + nombreArrayList.isEmpty());
    
    */
}
