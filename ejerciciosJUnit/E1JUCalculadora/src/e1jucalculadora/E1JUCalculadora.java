/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1jucalculadora;

import Service.ServiceDiscountC;
import entidad.DiscountCalculator;

/**
 *
 * @author lu_co
 */
public class E1JUCalculadora {

    /**
     * @param args the command line arguments
     */
    
    /*
    1. Calculadora de Descuentos:
Crea una clase DiscountCalculator que calcule el descuento aplicado a un producto.
Escribe pruebas unitarias para verificar que el cálculo del descuento se realiza correctamente
para diferentes escenarios (por ejemplo, descuento del 10%, descuento máximo, sin descuento, etc.).
    */
    public static void main(String[] args) {
        DiscountCalculator dC = new DiscountCalculator();
        ServiceDiscountC sDC = new ServiceDiscountC();
        
        sDC.ingresoDePrecio(dC);
        sDC.ingresoDeDescuento(dC);
        sDC.precioFinal(dC);
        
        
    }
    
}
