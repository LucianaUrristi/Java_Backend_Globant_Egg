/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author lu_co
 */
public interface calculosFormas {
    //vamos a crear una Interfaz, llamada calculosFormas que tendrá, los dos métodos
    //para calcular el área, el perímetro y el valor de PI como constante.
    
    public void area();
    
    public void perimetro();
    
    public final Double CONSTANTE = Math.PI;

}
