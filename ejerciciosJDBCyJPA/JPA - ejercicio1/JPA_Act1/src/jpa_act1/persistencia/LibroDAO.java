package jpa_act1.persistencia;

import java.util.List;
import jpa_act1.entidades.Libro;


public class LibroDAO  extends DAO<Libro>{
    
    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }
    
    public void eliminar(Long isbn) {
        Libro libro = buscarPorIsbn(isbn);
        super.eliminar(libro);
    }
    
    @Override
    public void editar(Libro libro) {
        super.editar(libro);
    }
    
    public List<Libro> listarTodos() {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l")
                .getResultList();
        desconectar();
        return libros;
    }
    
    public Libro buscarPorIsbn(Long isbn) {
        conectar();
        Libro libro = em.find(Libro.class, isbn);
        desconectar();
        return libro;
    }
    
    public Libro buscarPorTitulo(String titulo) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo")
                .setParameter("titulo", titulo).getSingleResult();
        desconectar();
        return libro;
    }
    
    public List<Libro> buscarPorAutor(String nombre) {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.autor a WHERE a.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getResultList();
        desconectar();
        return libros;
    }
    
    public List<Libro> buscarPorEditorial(String nombre) {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.editorial e WHERE e.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getResultList();
        desconectar();
        return libros;
    }
    
}
