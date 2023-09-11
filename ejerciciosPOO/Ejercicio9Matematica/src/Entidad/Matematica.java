/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author lu_co
 */
public class Matematica {
    
    private int numero1;
    private int numero2;

    public Matematica() {
    }

    public Matematica(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

     //a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public int devolverMayor() {
        System.out.println(numero1 + "    " + numero2);
        if (numero1 < numero2) {
            
            return numero2;
        } else {
            return numero1;
        }
    }

    //    b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
    //    elevado al menor número. Previamente se deben redondear ambos valores.
    public int calcularPotencia() {
        System.out.println(numero1 + "    " + numero2);
        if (numero1 < numero2) {
            return (int) (Math.pow(numero2, numero1));
        } else {
            return (int) (Math.pow(numero1, numero2));
        }
    }

    //    c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    //    Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    
    public double calcularRaiz(){
         System.out.println(numero1 + "    " + numero2);
        if (numero1 < numero2) {
            double absoluto = Math.abs(numero1);
            return (double) (Math.sqrt(absoluto));
        } else {
            double absoluto = Math.abs(numero2);
            return (double) (Math.sqrt(absoluto));
        }
    }
    
}





