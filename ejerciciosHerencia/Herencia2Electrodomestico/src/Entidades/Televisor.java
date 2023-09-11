/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class Televisor extends Electrodomestico{
    protected int resolucion;
    protected boolean sintonizadorTDT;

    public Televisor() {        
    }   

    public Televisor(int resolucion, boolean sintonizadorTDT, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        String sintonizador;
        if(sintonizadorTDT){
            sintonizador = "Si";
        } else {
            sintonizador = "No";
        }
        return "Televisor{" + "precio=" + precio + ", color=" + color + ", resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizador + '}';
    }
    
    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico();
        System.out.println("Ingrese la resolucion en pulgadas");
        resolucion = leer.nextInt(); 
        System.out.println("¿Posee sintonizador TDT incorporado?");
        String sintonizador = leer.next();
        sintonizadorTDT = sintonizador.equalsIgnoreCase("si");
    }
    
    
    public double precioFinal(){
        double precioBase = super.precioFinal();
        if (resolucion > 40 && sintonizadorTDT == true){
            return ((precioBase * 0.3) + 500d + precioBase);
        } else {
           if (resolucion > 40){
               return ((precioBase * 0.3) + precioBase);
                
            }
        }
        return precioBase;
    }
    
}
