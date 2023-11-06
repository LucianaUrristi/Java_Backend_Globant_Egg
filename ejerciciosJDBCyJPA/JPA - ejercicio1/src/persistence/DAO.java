/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author lu_co
 * @param <T>
 */
public class DAO<T> {
    EntityManagerFactory EMF = Persistence.createEntityManagerFactory("JPA_-_ejercicio1PU");
    EntityManager em = EMF.createEntityManager();
    
    public void conectar(){
        if(!em.isOpen()){
            em = EMF.createEntityManager();
        }
    }
    
    public void desconectar(){
        if(em.isOpen()){
            em.close();
        }
    }
    
    public void guardar(T objetc) throws Exception{
        try {
            conectar();           
            em.getTransaction().begin();           
            em.persist(objetc);           
            em.getTransaction().commit();
            desconectar();            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminar(T objetc) throws Exception{
        try {
            conectar();           
            em.getTransaction().begin();           
            em.remove(em.merge(objetc));           
            em.getTransaction().commit();
            desconectar();
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificar(T objetc) throws Exception{
        try {
            conectar();
            em.getTransaction().begin();           
            em.merge(objetc);           
            em.getTransaction().commit();
            desconectar();
        } catch (Exception e) {
            throw e;
        }
    }
}
