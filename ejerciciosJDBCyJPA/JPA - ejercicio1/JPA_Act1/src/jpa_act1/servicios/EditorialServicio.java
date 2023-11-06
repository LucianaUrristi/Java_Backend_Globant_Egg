package jpa_act1.servicios;

import java.util.List;
import jpa_act1.entidades.Editorial;
import jpa_act1.persistencia.EditorialDAO;


public class EditorialServicio {
    
    private final EditorialDAO DAO;
    
    public EditorialServicio() {
        this.DAO = new EditorialDAO();
    }
    
    public Editorial crearEditorial(String nombre) {
        Editorial editorial = new Editorial();
        try {
            editorial.setNombre(nombre);
            editorial.setAlta(Boolean.TRUE);
            DAO.guardar(editorial);
            return editorial;
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean eliminarPorId(Integer id) {
//        try {
            DAO.eliminar(id);
            return true;
//        } catch (Exception e) {
//            return false;
//        }
    }
    
    public boolean editarEditorial(Integer id, String nombre) throws Exception {
        try {
            if (id == null) {
                throw new Exception("Debe ingresar el ID");
            }
            
            Editorial editorial = DAO.buscarPorId(id);
            editorial.setNombre(nombre);            

            DAO.editar(editorial);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Editorial buscarPorNombre(String nombre) {
        try {
            return DAO.buscarPorNombre(nombre);
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Editorial> listarEditorial() {
        try {
            return DAO.listarTodos();
        } catch (Exception e) {
            return null;
        }
    }
            
}
