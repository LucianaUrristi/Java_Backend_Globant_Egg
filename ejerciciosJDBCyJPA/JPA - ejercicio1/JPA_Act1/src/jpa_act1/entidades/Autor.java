package jpa_act1.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author rodri
 */
@Entity
public class Autor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private Boolean alta;

    public Autor() {
    }

    public Autor(Integer id, String nombre, Boolean alta) {
        this.id = id;
        this.nombre = nombre;
        this.alta = alta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "Autor: " + "Id = " + id + ", Nombre = " + nombre + ", Alta = " + alta;
    }

    
}
