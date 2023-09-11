/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class ServicioCuenta {
 
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public Cuenta crearCuenta(){
        System.out.println("Por favor, ingrese su numero de cuenta");
        int nCuenta1 = (leer.nextInt());
        System.out.println("Por favor ingrese su número de DNI");
        long dni1 = leer.nextLong();        
        System.out.println("Por favor, ingrese su saldo actual");
        int saldo1 = leer.nextInt();
        
        Cuenta cuenta1 = new Cuenta(nCuenta1, dni1, saldo1);
        
        return cuenta1;
    }
    
    // d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
    //y se la sumara a saldo actual.
    public void ingresar(Cuenta cuenta, double ingreso){
        
        cuenta.setSaldoActual((int) (cuenta.getSaldoActual() + ingreso));
        
    }
    /*e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
    la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    pondrá el saldo actual en 0.*/
    public void retirar(Cuenta cuenta, double retiro) {
       
        if (cuenta.getSaldoActual() > retiro) {
            cuenta.setSaldoActual((int) (cuenta.getSaldoActual()-retiro));
        } else {
            cuenta.setSaldoActual(0);
        }
    }
    //f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
    //usuario no saque más del 20%.
    public void extraccionRapida(Cuenta cuenta) {
        cuenta.setSaldoActual((int) (cuenta.getSaldoActual() - (cuenta.getSaldoActual() * 0.2)));       
       
    }
    //g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public int consultarSaldo(Cuenta cuenta){
        return cuenta.getSaldoActual();
    }
    
    //h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
    public String consultarDatos(Cuenta cuenta){
        String algo = "Su numero de cuenta es: " + cuenta.getNumeroCuenta() + "\nSu DNI es: " + cuenta.getDNI() + "\nSu saldo actual es: " + cuenta.getSaldoActual();
        
        return algo;   
    }
}

