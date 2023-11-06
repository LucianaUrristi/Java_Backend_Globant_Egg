package jpa_act1.persistencia;

import java.util.List;
import jpa_act1.entidades.Editorial;


public class EditorialDAO extends DAO<Editorial>{
    
    @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }
    
    public void eliminar(int id) {
        Editorial editorial = buscarPorId(id);
        super.eliminar(editorial);
    }
    
    @Override
    public void editar(Editorial editorial) {
        super.editar(editorial);
    }
    
    public Editorial buscarPorId(int id) {
        conectar();
        Editorial editorial = em.find(Editorial.class, id);
        desconectar();
        return editorial;
    }
    
    public Editorial buscarPorNombre(String nombre) {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return editorial;
    }
    
    public List<Editorial> listarTodos() {
        conectar();
        List<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e")
                .getResultList();
        desconectar();
        return editoriales;
    }
    
}
