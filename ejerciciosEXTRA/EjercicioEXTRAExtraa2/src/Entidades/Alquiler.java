/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author lu_co
 */
public class Alquiler {
    private Pelicula peliculaAlquilada;
    private Date fechaDeInicio;
    private Date fechaDeFin;
    private double precio;

    public Alquiler() {
    }

    public Alquiler(Pelicula peliculaAlquilada, Date fechaDeInicio, Date fechaDeFin, double precio) {
        this.peliculaAlquilada = peliculaAlquilada;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFin = fechaDeFin;
        this.precio = precio;
    }

    public void setPeliculaAlquilada(Pelicula peliculaAlquilada) {
        this.peliculaAlquilada = peliculaAlquilada;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public void setFechaDeFin(Date fechaDeFin) {
        this.fechaDeFin = fechaDeFin;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pelicula getPeliculaAlquilada() {
        return peliculaAlquilada;
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public Date getFechaDeFin() {
        return fechaDeFin;
    }

    public double getPrecio() {
        return precio;
    }
    
    
    
}
