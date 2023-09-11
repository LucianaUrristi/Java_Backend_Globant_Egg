/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alquiler;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

/**
 *
 * @author lu_co
 */
public class AlquilerService {
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*
    Listar todas las películas alquiladas
    Buscar un alquiler por fecha (Decir si se existe o no, y si existe, mostrar los datos del alquiler)
    Calcular el ingreso total del servicio (El alquiler cuesta $10, por 3 días. Por cada día extra, se aumenta un 10% de
    interés.)
    */
    public Alquiler crearAlquiler(){
        Alquiler alquiler = new Alquiler();
        return alquiler;
    }
    
    public Date[] listarAlquiler() throws ParseException{
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date[] fechas = new Date[5]; //  (2007, 6, 30), (1990, 8, 12), (2004, 4, 10), (2003, 7, 19)};
        Date[] fechasFin = new Date[5];
        
        fechas[0] = dateFormat.parse("25/2/2002"); // Almacena la fecha en el array en el índice deseado       
        fechas[1] = dateFormat.parse("30/6/2007"); // Almacena la fecha en el array en el índice deseado   
        fechas[2] = dateFormat.parse("12/8/1999"); // Almacena la fecha en el array en el índice deseado       
        fechas[3] = dateFormat.parse("10/4/2004"); // Almacena la fecha en el array en el índice deseado
        fechas[4] = dateFormat.parse("19/7/2003"); // Almacena la fecha en el array en el índice deseado
 
        return fechas;
               
    }
    public Date[] listarFechaFin() throws ParseException{
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        Date[] fechasFin = new Date[5];
        
        fechasFin[0] = dateFormat.parse("25/6/2002");
        fechasFin[1] = dateFormat.parse("30/9/2007");  
        fechasFin[2] = dateFormat.parse("12/10/1999");    
        fechasFin[3] = dateFormat.parse("10/7/2004"); 
        fechasFin[4] = dateFormat.parse("19/8/2003");
        
        return fechasFin;
               
    }
    
    public boolean buscarPorFecha(Alquiler alquiler, Date[] fechas, Date[] fechasFin) throws ParseException{
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        boolean busqueda = false;
        System.out.println("Ingrese la fecha de inicio del alquiler a buscar: ");
        
        alquiler.setFechaDeInicio(dateFormat.parse(leer.nextLine()));
        
         System.out.println("Ingrese la fecha de fin del alquiler a buscar: ");
        
        alquiler.setFechaDeFin(dateFormat.parse(leer.nextLine()));
        
        for (int i = 0; i < fechas.length; i++){            
            if (fechas[i].equals(alquiler.getFechaDeInicio()) || fechas[i].equals(alquiler.getFechaDeFin())) {
                busqueda = true;               
            }
        }
        return busqueda;        
    }
    
    public double calcularPrecio(Alquiler alquiler) {
        int diasAlquilados = (int) ((alquiler.getFechaDeFin().getTime() - alquiler.getFechaDeInicio().getTime()) / (24 * 60 * 60 * 1000));        
        int diasBase = 3;
        double precioBase = 10.0;
        if (diasAlquilados <= diasBase) {
            return precioBase;
        } else {
            int diasExtras = diasAlquilados - diasBase;
            
            double precioExtra = precioBase * 0.1 * diasExtras; //Math.pow(1 + interesPorDiaExtra, diasExtras);
           
            return precioBase + precioExtra;
        }
    }
}
