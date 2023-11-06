/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.util.List;
import libreria.entidades.Editorial;

/**
 *
 * @author lu_co
 */
public class EditorialDAO extends DAO<Editorial>{
    

    @Override    
    public void guardar(Editorial editorial) throws Exception{
        super.guardar(editorial);
    }
    
    public void eliminar(Integer id) throws Exception{
        Editorial editorial = buscarEditorialPorId(id);
        super.eliminar(editorial);
    }
    
    @Override
    public void modificar(Editorial editorial) throws Exception{
        super.modificar(editorial);
    }
    
    
    public Editorial buscarEditorialPorId(Integer id) throws Exception{
        try {
            conectar();
            Editorial editorial = em.find(Editorial.class, id);
            desconectar();
        
            return editorial;
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Editorial> listarEditoriales(){
        try {
            conectar();
        
            List<Editorial> editoriales = em.createQuery("SELECT a FROM Editorial a").getResultList();
        
            desconectar();
        
            return editoriales;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Editorial buscarEditorialPorNombre(String nombre) throws Exception{
        try {
            conectar();
            Editorial editorial = (Editorial) em.createQuery("SELECT a FROM Editorial a WHERE a.nombre LIKE :nombre")
                    .setParameter("nombre", nombre).getSingleResult();
            desconectar();
        
            return editorial;
        } catch (Exception e) {
            return null;
        }
    } 
}
     
