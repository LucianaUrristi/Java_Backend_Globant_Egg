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
public class Cancion {
    /* Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
        definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
        vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
        además definir los métodos getters y setters correspondientes.*/
    private String titulo;
    private String autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}
