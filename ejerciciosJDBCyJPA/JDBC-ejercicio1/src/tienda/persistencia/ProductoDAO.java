/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import tienda.entidades.Producto;

/**
 *
 * @author lu_co
 */
public final class ProductoDAO extends DAO{
    public void guardarProducto(Producto producto) throws Exception{
        
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto.");
            }
            String sql = "INSERT INTO producto (nombre, precio, codigo de fabricante"
                    + "VALUES ( '" + producto.getNombre() + "' , '" + producto.getPrecio() + "' , '"
                    + producto.getCodigoFabricante() + "');";
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public void modificarProducto(Producto producto) throws Exception{
        
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto que desea modificar.");
            }
            String sql = "UPDATE Producto SET"
                    + "precio ( '" + producto.getPrecio() + "nombre ( '" + producto.getNombre() + "codigo ( '" 
                    + producto.getCodigo() + "' WHERE codigo =  '" + producto.getCodigo() + "');";
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    public void eliminarProducto(Producto producto) throws Exception{
        
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto que desea modificar.");
            }
            String sql = "DELETE FROM Producto WHERE nombre = '" + producto.getNombre() + "'";
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
}
