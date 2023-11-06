package jpa_act1.servicios;

import java.util.List;
import jpa_act1.entidades.Autor;
import jpa_act1.entidades.Editorial;
import jpa_act1.entidades.Libro;
import jpa_act1.persistencia.LibroDAO;


public class LibroServicio {
    
    private final LibroDAO DAO;
    
    public LibroServicio() {
        DAO = new LibroDAO();
    }
    
    public Libro crearLibro(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Autor autor, Editorial editorial) {
        
        Libro libro = new Libro();
        
        try {
            libro.setIsbn(isbn);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setEditorial(editorial);
            libro.setAutor(autor);
            libro.setAlta(Boolean.TRUE);
            
            DAO.guardar(libro);
            return libro;
        } catch (Exception e) {
            return null;
        }
        
    }
    
    public boolean eliminarLibro(Long isbn) {
        try {
            DAO.eliminar(isbn);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean editarLibro(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Autor autor, Editorial editorial, Boolean alta) {
        try {
            if (isbn == null) {
                throw new Exception("Debe ingresar el código ISBN");
            }
            Libro libro = DAO.buscarPorIsbn(isbn);
            
            libro.setIsbn(isbn);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setEditorial(editorial);
            libro.setAutor(autor);
            libro.setAlta(alta);
            
            DAO.editar(libro);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Libro buscarPorIsbn(Long isbn) {
        try {
            return DAO.buscarPorIsbn(isbn);
        } catch (Exception e) {
            return null;
        }
    }
    
    public Libro buscarPorTitulo(String titulo) {
        try {
            return DAO.buscarPorTitulo(titulo);
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Libro> buscarPorAutor(String nombre) {
        try {
            return DAO.buscarPorAutor(nombre);
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Libro> buscarPorEditorial(String nombre) {
        try {
            return DAO.buscarPorEditorial(nombre);
        } catch (Exception e) {
            return null;
        } 
    }
    
    public List<Libro> listarTodos() {
        try {
            return DAO.listarTodos();
        } catch (Exception e) {
            return null;
        } 
    }
    
    
    
}
