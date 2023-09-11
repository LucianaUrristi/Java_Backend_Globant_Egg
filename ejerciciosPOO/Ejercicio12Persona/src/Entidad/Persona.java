/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author lu_co
 */
public class Persona {
//    Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
//        (Tipo Date), constructor vacío, constructor parametrizado, get y set. 
    private String nombre;
    private Date fechaDeNacimiento;

    public Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
//     Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
//        en cuenta que para conocer la edad de la persona también se debe conocer la fecha
//        actual.
    public int calcularEdad(){
        Date fechaActual = new Date ();
        int anioInicio = fechaDeNacimiento.getYear();
        int anioFin = fechaActual.getYear();

        if (fechaActual.getMonth() < fechaDeNacimiento.getMonth()
                || (fechaActual.getMonth() == fechaDeNacimiento.getMonth() && fechaActual.getDate() < fechaDeNacimiento.getDate())) {
            anioFin--;
        }

        return anioFin - anioInicio;
    }
    //         Metodo mostrarPersona(): este método muestra la persona creada en el método
//        anterior.
    public void mostrarPersona(){
            System.out.println("La persona se llama: " + nombre);
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNac = formato.format(fechaDeNacimiento);
            System.out.println("Su fecha de naciemiento es: " + fechaNac);
        
    }
}
