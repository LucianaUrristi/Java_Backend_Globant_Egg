/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5cuentab;

import Entidad.Cuenta;
import Servicios.ServicioCuenta;
import java.util.Scanner;


/**
 *
 * @author lu_co
 */
public class Ejercicio5CuentaB {

    /*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    
     */
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       ServicioCuenta serviceCuenta = new ServicioCuenta(); //mi nuevo objeto de tipo ServicioCircunferencia
       Cuenta cuenta = serviceCuenta.crearCuenta(); 
       menu(cuenta, serviceCuenta);
    }
    public static void menu(Cuenta cuenta, ServicioCuenta serviceCuenta){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        System.out.println("Bienvenido, ¿Qué operación desea realizar?");
        System.out.println("1. Depositar dinero");
        System.out.println("2. Retirar dinero.");
        System.out.println("3. Realizar una extracción rápida.");
        System.out.println("4. Consultar saldo actual.");
        System.out.println("5. Consultar datos.");
        System.out.println("6. Salir");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese la cantidad de dinero que quiere depositar.");
                int deposito = leer.nextInt();
                
                serviceCuenta.ingresar(cuenta, deposito);
                menu(cuenta, serviceCuenta);
                break;
            case 2:
                System.out.println("Ingrese la cantidad de dinero que quiere retirar.");
                int retiro = leer.nextInt();
                serviceCuenta.retirar(cuenta, retiro);
                menu(cuenta, serviceCuenta);
                break;
            case 3:
                serviceCuenta.extraccionRapida(cuenta);
                menu(cuenta, serviceCuenta);
                break;
            case 4:
                int saldo = serviceCuenta.consultarSaldo(cuenta);
                System.out.println(saldo);
                menu(cuenta, serviceCuenta);
                break;
            case 5:
                String datos = serviceCuenta.consultarDatos(cuenta);
                System.out.println(datos);
                menu(cuenta, serviceCuenta);
                break;
            case 6:
                break;
        }
    }

}
