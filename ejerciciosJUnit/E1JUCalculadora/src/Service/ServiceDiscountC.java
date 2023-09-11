/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import entidad.DiscountCalculator;
import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class ServiceDiscountC {
   // public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public DiscountCalculator crearObjeto(){
        DiscountCalculator dC = new DiscountCalculator();
        return dC;
    }
    
    public double ingresoDePrecio(DiscountCalculator dC){
       // System.out.println("Por favor, ingrese el precio del producto");
        
        dC.setPrecio(100);
        return dC.getPrecio();
    }
    
     public double ingresoDeDescuento(DiscountCalculator dC){
     //   System.out.println("Por favor, ingrese el descuento a aplicar");
        
        dC.setDescuento(10);
        return dC.getDescuento();
    }
    public double precioFinal(DiscountCalculator dC){
       double precioFinal = (dC.getPrecio() - ((dC.getDescuento() / 100 ) * dC.getPrecio()));
        
       return precioFinal;
        //System.out.println("El precio final a pagar es: " + precioFinal);
    }
}
