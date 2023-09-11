/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextraextra3gimnasio;

import Servicio.ServicioCliente;

/**
 *
 * @author lu_co
 */
public class EjercicioEXTRAEXTRA3Gimnasio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCliente clService = new ServicioCliente();
        
        for (int i = 0; i < 2; i++) {
            clService.registrarCliente();
        }
        
        clService.obtenerClientes();
        clService.actualizarCliente(1, "Oscar", 28, 190, 100, "Dominio total de mundo");
        clService.obtenerClientes(); // VERIFICANDO ACTUALIZAR CLIENTES
        clService.eliminarCliente(1);
        clService.obtenerClientes(); // VERIFICANDO ELIMINAR CLIENTES
    }
    
}
