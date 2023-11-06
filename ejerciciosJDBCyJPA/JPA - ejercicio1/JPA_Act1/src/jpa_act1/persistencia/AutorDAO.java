package jpa_act1.persistencia;

import java.util.List;
import jpa_act1.entidades.Autor;


public class AutorDAO extends DAO<Autor>{
    
    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
    }
    
    public void eliminar(Integer id) {
        Autor autor = buscarPorId(id);
        super.eliminar(autor);
    }
    
    @Override
    public void editar(Autor autor) {
        super.editar(autor);
    }
    
    public Autor buscarPorId(Integer id) {
        conectar();
        Autor autor = em.find(Autor.class, id);
        desconectar();
        return autor;
    }
    
    public Autor buscarPorNombre(String nombre) {
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return autor;
    }
    
    public List<Autor> listarAutores() {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a from Autor a")
                .getResultList();
        desconectar();
        return autores;
    }
    
    
    
}
