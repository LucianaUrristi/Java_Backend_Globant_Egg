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
public class Circunferencia {
    //atributo
    private float radio;
    private float area;
    private float perimetro;
    
    //constructor
    public Circunferencia() {
    }

    public Circunferencia(float radio) {
        this.radio = radio;
        this.area = (float) (Math.PI * Math.pow(radio, 2));
        this.perimetro = (float) (2 * Math.PI * radio);
    }
    
//getter y setter
    
    public void setRadio(float radio) {
            this.radio = radio;
        } 
    
    public float getRadio() {
        return radio;
    }
    
    public float getArea(){
        return area; //usando el atributo area que se esta calculado dentro del constructor, a partir del radio.
    //    return (float) (Math.PI * Math.pow(radio, 2)); para calcular el area en este metodo get de la circunferencia
    }
    
    
}
