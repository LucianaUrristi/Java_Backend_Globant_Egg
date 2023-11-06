/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.util.List;
import libreria.entidades.Autor;

/**
 *
 * @author lu_co
 */
public class AutorDAO extends DAO<Autor>{
   
    @Override    
    public void guardar(Autor autor) throws Exception{
        super.guardar(autor);
    }
    
    public void eliminar(Integer id) throws Exception{
        Autor autor = buscarAutorPorId(id);
        super.eliminar(autor);
    }
    
    @Override
    public void modificar(Autor autor) throws Exception{
        super.modificar(autor);
    }
    
    public Autor buscarAutorPorId(Integer id) throws Exception{
        try {
            conectar();
            Autor autor = em.find(Autor.class, id);
            desconectar();
        
            return autor;
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Autor> listarAutores(){
        try {
            conectar();        
            List<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
            desconectar();
        
            return autores;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Autor buscarAutorPorNombre(String nombre) {

        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getSingleResult();
        desconectar();

        return autor;

    }
    
    
}
