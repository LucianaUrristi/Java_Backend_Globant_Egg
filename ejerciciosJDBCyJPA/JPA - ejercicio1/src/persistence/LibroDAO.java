/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

/**
 *
 * @author lu_co
 */
public class LibroDAO extends DAO<Libro> {
    
    @Override    
    public void guardar(Libro libro) throws Exception{
        super.guardar(libro);
    }
    
    public void eliminar(Integer id) throws Exception{
        Libro libro = buscarLibroPorId(id);
        super.eliminar(libro);
    }
    
    @Override
    public void modificar(Libro libro) throws Exception{
        super.modificar(libro);
    }
    
    public Libro buscarLibroPorId(Integer id) throws Exception{
        try {
            conectar();
            Libro libro = em.find(Libro.class, id);
            desconectar();
        
            return libro;
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Libro> listarLibros(){
        try {
            conectar();
        
            List<Libro> libros = em.createQuery("SELECT a FROM Libro a").getResultList();
        
            desconectar();
        
            return libros;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Libro buscarLibroPorISBN(Long isbn) throws Exception{
        try {
            conectar();
            Libro buscarIsbn = em.find(Libro.class, isbn);
            desconectar();
        
            return buscarIsbn;
        } catch (Exception e) {
            return null;
        }
    }
    
    public Libro buscarLibroPorTitulo(String titulo) throws Exception{
        try {
            conectar();
            Libro libro = (Libro) em.createQuery("SELECT a FROM Libro a WHERE a.titulo LIKE :titulo")
                    .setParameter("titulo", titulo).getSingleResult();
            desconectar();
        
            return libro;
        } catch (Exception e) {
            return null;
        }
    }
    public Libro buscarLibroPorAutor(Autor autor) throws Exception{
        try {
            conectar();
            Libro libro = (Libro) em.createQuery("SELECT a FROM Libro a WHERE a.autor LIKE :autor")
                    .setParameter("autor", autor).getSingleResult();
            desconectar();
        
            return libro;
        } catch (Exception e) {
            return null;
        }
    }
    public Libro buscarPorEditorial(Editorial editorial) throws Exception{
        try {
            conectar();
             Libro libro = (Libro) em.createQuery("SELECT a FROM Libro a WHERE a.editorial LIKE :editorial")
                    .setParameter("editorial", editorial).getSingleResult();
            desconectar();
        
            return libro;
        } catch (Exception e) {
            return null;
        }
    }

    
}   

