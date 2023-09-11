/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Vehiculo;

/**
 *
 * @author lu_co
 */
public class ServicioVehiculo {
     public Vehiculo crearVehiculo(String marca, String modelo, int ano, String tipo){
        Vehiculo vehiculo = new Vehiculo(marca, modelo, ano, tipo);
        return vehiculo;
    }
    public int moverse(Vehiculo vehiculo, int segundos){
        return getVelocidad(vehiculo) * segundos;
    }
    public int getVelocidad(Vehiculo vehiculo){
        switch (vehiculo.getTipo()){
            case "automovil": return 3;                
            case "motocicleta": return 2;                
            case "bicicleta": return 1;
            default: return 0;
        }
    }
    public int frenar(Vehiculo vehiculo){
        if (vehiculo.getTipo().equals("bicicleta")){
            return 0;
        } else {
            return 2;
        }
        // OPERADOR TERNARIO
        //return vehiculo.getTipo().equals("bicicleta") ? 0 : 2;
    }
}
