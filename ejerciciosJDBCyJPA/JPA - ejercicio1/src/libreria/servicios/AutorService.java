/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import persistence.AutorDAO;

/**
 *
 * @author lu_co
 */
public class AutorService {
    
    private final AutorDAO dao;
    private final Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    
    public AutorService() {
        this.dao = new AutorDAO();
    }

    
     public Autor crearAutor(String nombre) {
        Autor autor = new Autor();
        try {
            autor.setNombre(nombre);
            autor.setAlta(Boolean.TRUE);
            dao.guardar(autor);
            return autor;
        } catch (Exception e) {
            return null;
        }
    }
     
    public boolean eliminarAutor(Integer id){
        try {
            Autor autor = dao.buscarAutorPorId(id);
            dao.eliminar(autor);
            return true;
        } catch (Exception e) {
            System.out.println("Algo anda mal");
            return false;
        }
    }
    
    public void modificarAutor() {
        try {
            System.out.print("INGRESE ID DEL AUTOR: ");
            Autor aux = buscarAutorPorId(leer.nextInt());
            if (aux != null) {
                System.out.print("INGRESE NOMBRE: ");
                aux.setNombre(leer.next());
                System.out.println("AUTOR EDITADO");
            } else {
                System.out.println("AUTOR NO ENCONTRADO");
            }

            dao.modificar(aux);
        } catch (Exception e) {
            System.out.println("Algo anda mal");
        }
    }
    
    
    public Autor buscarAutorPorId(Integer id) throws Exception{
        try {
           Autor autor = dao.buscarAutorPorId(id);
           return autor; 
        } catch (Exception e) {
            System.out.println("No existe el autor");
            return null;
        }
    }
    
    public void darAutorDeAlta(Integer id) throws Exception {
        
        Autor autor = buscarAutorPorId(id);
        try {
            if (autor.getAlta().equals(Boolean.TRUE)) {
                
                System.out.println("El autor ya está dado de alta en el sistema");
            }else{
                autor.setAlta(Boolean.TRUE);
                System.out.println("Autor dado de alta con exito!");
            }
            dao.modificar(autor);
        } catch (Exception e) {
            System.out.println("MAL");
        }

    }
    public void darAutorDeBaja(Integer id) {

        try {
            Autor autor = buscarAutorPorId(id);
            if (autor.getAlta().equals(Boolean.TRUE)) {               
                
                System.out.println("El autor ya está dado de alta en el sistema");
            }else{
                autor.setAlta(Boolean.TRUE);
                System.out.println("Autor dado de alta con exito!");
            }
            dao.modificar(autor);
        } catch (Exception e) {
            System.out.println("MAL");
        }

    }
    
    public Autor buscarPorNombre(String nombreAutor){
        try {
            Autor nombre = dao.buscarAutorPorNombre(nombreAutor);
            return nombre;
        } catch (Exception e) {
            System.out.println("No existe el autor");
            return null;
        }
    }
    
    public List<Autor> listarAutores() {
        try {
            return dao.listarAutores();
        } catch (Exception e) {
            return null;
        }
    }
}
