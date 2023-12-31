/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra1puertodebarcos;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcoAMotor;
import Entidad.Velero;
import Entidad.YateDeLujo;

/**
 *
 * @author lu_co
 */
public class HerenciaEXTRA1PuertoDeBarcos {

    /**
     * En un puerto se alquilan amarres para barcos de distinto tipo. Para cada
     * Alquiler se guarda: el nombre, documento del cliente, la fecha de
     * alquiler, fecha de devolución, la posición del amarre y el barco que lo
     * ocupará. Un Barco se caracteriza por: su matrícula, su eslora en metros y
     * año de fabricación. Sin embargo, se pretende diferenciar la información
     * de algunos tipos de barcos especiales: • Número de mástiles para veleros.
     * • Potencia en CV para barcos a motor. • Potencia en CV y número de
     * camarotes para yates de lujo. Un alquiler se calcula multiplicando el
     * número de días de ocupación (calculado con la fecha de alquiler y
     * devolución), por un valor módulo de cada barco (obtenido simplemente
     * multiplicando por 10 los metros de eslora). En los barcos de tipo
     * especial el módulo de cada barco se calcula sacando el módulo normal y
     * sumándole el atributo particular de cada barco. En los veleros se suma el
     * número de mástiles, en los barcos a motor se le suma la potencia en CV y
     * en los yates se suma la potencia en CV y el número de camarotes.
     * Utilizando la herencia de forma apropiada, deberemos programar en Java,
     * las clases y los métodos necesarios que permitan al usuario elegir el
     * barco que quiera alquilar y mostrarle el precio final de su alquiler.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alquiler alquiler1 = new Alquiler();
        
        Barco b = new Barco();
        Velero v = new Velero();
        BarcoAMotor bam = new BarcoAMotor();
        YateDeLujo ydl = new YateDeLujo();
        
        alquiler1.crearAlquiler(b, v, bam, ydl);
        
        
        System.out.println("El precio final del alquiler es de: " + alquiler1.calcularAlquiler(b, v, bam, ydl));
        
        //funciona pero puede que haya problemas con el date ya que no puse para calculara con cambio de mes
    }
    
}
