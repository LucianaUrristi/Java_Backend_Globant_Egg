/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import persistence.LibroDAO;

/**
 *
 * @author lu_co
 */
public class LibroService {
    private final LibroDAO dao;
    AutorService as = new AutorService();
    private final Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    public LibroService(){
        this.dao = new LibroDAO();
    }
     
    
    public void crearLibro(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Boolean alta, Autor autor, Editorial editorial){
        try {
            Libro libro = new Libro(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, autor, editorial);
            libro.setAlta(Boolean.TRUE);
            dao.guardar(libro);
        } catch (Exception e) {
            System.out.println("Algo anda mal");
        }
    }
    
    public boolean eliminarLibro(Integer id){
        try {
            dao.eliminar(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public void modificarLibro() throws Exception{
        
        try {
           System.out.print("INGRESE ISBN DEL LIBRO: ");
                    Libro aux = buscarLibroPorISBN(leer.nextLong());
                    if (aux != null) {
                        
                        System.out.println("INGRESE LOS NUEVOS DATOS");
                        System.out.print("TITULO: ");
                        aux.setTitulo(leer.next());
                        System.out.print("AÑO: ");
                        aux.setAnio(leer.nextInt());
                        System.out.print("EJEMPLARES: ");
                        aux.setEjemplares(leer.nextInt());
                        System.out.print("EJEMPLARES PRESTADOS: ");
                        aux.setEjemplaresprestados(leer.nextInt());
                        System.out.print("EJEMPLARES RESTANTES: ");
                        aux.setEjemplaresrestantes(leer.nextInt());
                        System.out.println("AUTOR: ");
                        aux.setAutorId(as.buscarPorNombre(leer.next()));
                        System.out.println("LIBRO EDITADO");
                        
                    } else {
                        System.out.println("ISBN NO ENCONTRADO");
                    }
            dao.modificar(aux);
        } catch (Exception e) {
            System.out.println("Algo anda mal");
        }
    }
    
     
    public Libro buscarLibroPorISBN(Long isbn) throws Exception{
        try {
           Libro buscarISBN = dao.buscarLibroPorISBN(isbn);
           return buscarISBN; 
        } catch (Exception e) {
            System.out.println("No existe el autor");
            return null;
        }
    }
    
    public Libro buscarLibroPorTitulo(String titulo) throws Exception{
        try {
            Libro buscarTitulo = dao.buscarLibroPorTitulo(titulo);
            return buscarTitulo;
        } catch (Exception e) {
            System.out.println("No existe el autor");
            return null;
        }
    }
    
    public Libro buscarLibroPorAutor(Autor nombre) throws Exception{
        try {
            return dao.buscarLibroPorAutor(nombre);
        } catch (Exception e) {
            return null;
        }
    }
    
    public Libro buscarPorEditorial(Editorial nombre) {
        try {
            return dao.buscarPorEditorial(nombre);
        } catch (Exception e) {
            return null;
        } 
    }
    
    public List<Libro> listarTodos() {
        try {
            return dao.listarLibros();
        } catch (Exception e) {
            return null;
        } 
    }
     
}
