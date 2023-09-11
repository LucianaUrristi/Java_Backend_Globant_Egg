/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.HashMap;

/**
 *
 * @author lu_co
 */
public class Tienda {
    private HashMap<String, Double> productos = new HashMap<>();

    public Tienda() {
    }

    public Tienda(HashMap<String, Double> productos) {
        this.productos = productos;
    }

    public HashMap<String, Double> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<String, Double> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Tienda{" + "productos=" + productos + '}';
    }

    public void put(String nombreProducto, Double precio){
        this.productos.put(nombreProducto, precio);
    } 
    
    
    
}
