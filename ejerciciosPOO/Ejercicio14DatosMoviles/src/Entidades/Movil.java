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
public class Movil {
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
   /* Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
        posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
        almacenar cada producto con su información. Crear una entidad Movil con los atributos
        marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
        un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
        correspondiente al código. A continuación, se implementarán los siguientes métodos:
         Un constructor por defecto.
         Un constructor con todos los atributos como parámetro.
         Métodos getters y setters de cada atributo.
    */
        
    
    private String marca;
    private double precio;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;
    private int[] codigo;

    public Movil() {
        this.codigo = new int[7];
    }

    public Movil(String marca, double precio, String modelo, int memoriaRam, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = new int[7];
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
    /* Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
        instanciar un objeto Celular y poder cargarlo en nuestro programa.
         Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
        números de un celular. Para ello, puede utilizarse un bucle repetitivo
        */
    public void cargarCelular(){
       
        System.out.println("Ingrese la marca del móvil");
        marca = leer.nextLine();
        System.out.println("Ingrese el precio");
        precio = leer.nextInt();
        System.out.println("Ingrese el modelo");
        modelo = leer.next();
        System.out.println("Ingrese la cantidad de memoria ram");
        memoriaRam = leer.nextInt();
        System.out.println("Ingrese la capacidad de almacenamiento");
        almacenamiento = leer.nextInt();
        ingresarCodigo();        
    }
    public void ingresarCodigo() {
        System.out.println("Ingrese el codigo.");
        for (int i = 0; i < codigo.length; i++) {
            
            codigo[i] = leer.nextInt();
        }
    }
    
}
