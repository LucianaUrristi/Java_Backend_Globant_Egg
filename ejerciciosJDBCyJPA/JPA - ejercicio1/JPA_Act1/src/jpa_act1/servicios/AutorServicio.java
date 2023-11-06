package jpa_act1.servicios;

import java.util.List;
import jpa_act1.entidades.Autor;
import jpa_act1.persistencia.AutorDAO;


public class AutorServicio {
    
    private final AutorDAO DAO;
    
    public AutorServicio() {
        this.DAO = new AutorDAO();
    }
    
    public Autor crearAutor(String nombre) {
        Autor autor = new Autor();
        try {
            autor.setNombre(nombre);
            autor.setAlta(Boolean.TRUE);
            DAO.guardar(autor);
            return autor;
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean eliminarPorId(Integer id) {
        try {
            DAO.eliminar(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean editarAutor(Integer id, String nombre) throws Exception {
        try {
            if (id == null) {
                throw new Exception("Debe ingresar el ID");
            }
            
            Autor autor = DAO.buscarPorId(id);
            autor.setNombre(nombre);
            
            DAO.editar(autor);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Autor buscarPorNombre(String nombre) {
        try {
            return DAO.buscarPorNombre(nombre);
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Autor> listarAutores() {
        try {
            return DAO.listarAutores();
        } catch (Exception e) {
            return null;
        }
    }
    
    
    
}
