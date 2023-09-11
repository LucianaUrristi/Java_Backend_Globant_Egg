/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra1vehiculo;

import Entidad.Vehiculo;
import Servicios.ServicioVehiculo;
import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class EjercicioEXTRA1Vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la marca");
        String marca = leer.next();
        System.out.println("Ingrese el modelo");
        String modelo = leer.next();
        System.out.println("Ingrese el año");
        int ano = leer.nextInt();
        System.out.println("Ingrese el tipo");
        String tipo = leer.next();
        
        ServicioVehiculo sV = new ServicioVehiculo();
        Vehiculo automovil = sV.crearVehiculo(marca, modelo, ano, tipo);
        Vehiculo motocicleta = sV.crearVehiculo(marca, modelo, ano, tipo);
        Vehiculo bicicleta = sV.crearVehiculo(marca, modelo, ano, tipo);
        
        System.out.println(sV.moverse((automovil), 5));
        System.out.println(sV.moverse((motocicleta), 5));
        System.out.println(sV.moverse((bicicleta), 5));
        
        System.out.println(sV.moverse((automovil), 10));
        System.out.println(sV.moverse((motocicleta), 10));
        System.out.println(sV.moverse((bicicleta), 10));
        
        System.out.println(sV.moverse((automovil), 60));
        System.out.println(sV.moverse((motocicleta), 60));
        System.out.println(sV.moverse((bicicleta), 60));
        
        int movAuto = sV.moverse(automovil, 300) + sV.frenar(automovil);
        int movMoto = sV.moverse(motocicleta, 300) + sV.frenar(motocicleta);
        int movBici = sV.moverse(bicicleta, 300) + sV.frenar(bicicleta);
        
        int max = Math.max(movAuto, Math.max(movBici, movMoto));
        
        System.out.println("Max: " + max);
        
    }
    
    
}
