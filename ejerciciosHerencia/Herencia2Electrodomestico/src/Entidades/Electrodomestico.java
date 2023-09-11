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
public class Electrodomestico {
    protected Double precio;
    protected String color;
    protected char consumoEnergetico;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }


    
    //Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    //sino es correcta usara la letra F por defecto.Este método se debe invocar al crear el
    //objeto y no será visible.
    public boolean comprobarConsumoEnergetico(char letra){        
        return 'A' == letra || 'B' == letra || 'C' == letra || 'D' == letra || 'E' == letra || 'F' == letra || 'a' == letra || 'b' == letra || 'c' == letra || 'd' == letra || 'e' == letra || 'f' == letra;
    }
    
    //Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    //usa el color blanco por defecto
    //. Los colores disponibles para los electrodomésticos son blanco, negro, rojo, azul y gris
    //. No importa si el nombre está en mayúsculas o en
    //minúsculas.Este método se invocará al crear el objeto y no será visible

    public boolean comprobarColor(String color){
        return color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris");
    }
    
    //Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    //electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    //precio se le da un valor base de $1000.
    
    public void crearElectrodomestico(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el precio del electrodomestico");
       
        precio = (leer.nextDouble());
        
        System.out.println("Ingrese el color");
        color = leer.next();        
        
        if (comprobarColor(color) == false){
            color = "Blanco";
        }
        
        System.out.println("Ingrese el consumo");
        String consumo = leer.next();
        consumoEnergetico = consumo.charAt(0);
        if (comprobarConsumoEnergetico(consumoEnergetico) == false){
            consumoEnergetico = 'F';
        }
        
        System.out.println("Ingrese el peso");
        peso = leer.nextDouble(); 
        
    }
    
    //Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
    //precio. Esta es la lista de precios:
    
    public double precioFinal(){
        double valorBase = 1000d;
        return (precio + precioPorConsumo() + precioPorPeso() + valorBase);
        
    }
    
    private double precioPorConsumo(){
        switch (consumoEnergetico){
            case 'A':
                return 1000d;
            case 'B':
                return 800d;   
            case 'C':
                return 600d;        
            case 'D':
                return 500d;          
            case 'E':
                return 300d;         
            case 'F':
                return 100d;            
        }
        return precio;
    }
    

    private double precioPorPeso() {
        if (peso >= 1 && peso <= 19) {
            return 100d;
        } else {
            if (peso >= 20 && peso <= 49) {
                return 500d;
            } else {
                if (peso >= 50 && peso <= 79) {
                    return 800d;
                } else {
                    if (peso >= 80) {
                        return 1000d;
                    }
                }
            }
        }
        return precio;
    }
    
    
    
}
