/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Alquiler se guarda: el nombre, documento del cliente, la fecha de
     * alquiler, fecha de devolución, la posición del amarre y el barco que lo
     * ocupará.
 *
 * @author lu_co
 */
public class Alquiler {
    private String nombre;
    private Integer dni;
    private Date fechaDeAlquiler;
    private Date fechaDeDevolucion;
    private String posicionDelAmarre; //??
    private Barco barcoAlquilado;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer dni, Date fechaDeAlquiler, Date fechaDeDevolucion, String posicionDelAmarre, Barco barcoAlquilado) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.posicionDelAmarre = posicionDelAmarre;
        this.barcoAlquilado = barcoAlquilado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Date getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(Date fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public Date getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(Date fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public String getPosicionDelAmarre() {
        return posicionDelAmarre;
    }

    public void setPosicionDelAmarre(String posicionDelAmarre) {
        this.posicionDelAmarre = posicionDelAmarre;
    }

    public Barco getBarcoAlquilado() {
        return barcoAlquilado;
    }

    public void setBarcoAlquilado(Barco barcoAlquilado) {
        this.barcoAlquilado = barcoAlquilado;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", fechaDeAlquiler=" + fechaDeAlquiler + ", fechaDeDevolucion=" + fechaDeDevolucion + ", posicionDelAmarre=" + posicionDelAmarre + ", barcoAlquilado=" + barcoAlquilado + '}';
    }
    
    public Scanner leer = new Scanner(System.in);
    
    public void crearAlquiler(Barco b, Velero v, BarcoAMotor bam, YateDeLujo ydl){
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        System.out.println("Ingrese su dni");
        dni = leer.nextInt();
        
        System.out.println("Por favor, ingrese el día de alquiler");
        int dia = leer.nextInt();
        System.out.println("Por favor, ingrese el mes de alquiler");
        int mes = leer.nextInt();        
        System.out.println("Por favor, ingrese el año de alquiler");
        int anio = leer.nextInt();
        
        fechaDeAlquiler = new Date(anio - 1900, mes - 1, dia);
        System.out.println(fechaDeAlquiler);
        
        System.out.println("Por favor, ingrese el día de devolucion");
        int diaD = leer.nextInt();
        System.out.println("Por favor, ingrese el mes de devolucion");
        int mesD = leer.nextInt();        
        System.out.println("Por favor, ingrese el año de devolucion");
        int anioD = leer.nextInt();
        
        fechaDeDevolucion = new Date(anioD - 1900, mesD - 1, diaD);
        
        System.out.println("Ingrese la posicion de amarre");
        posicionDelAmarre = leer.next();
        seleccionarBarco(b, v, bam, ydl);
    }
    
    
    public Barco seleccionarBarco(Barco b, Velero v, BarcoAMotor bam, YateDeLujo ydl) {
        System.out.println("Indique el tipo de barco que desea alquilar: ");
        System.out.println("1. Barco común");
        System.out.println("2. Velero");
        System.out.println("3. Barco a motor");
        System.out.println("4. Yate de lujo");
        int tipoBarco = leer.nextInt();
        //Barco b = new Barco();
        
        System.out.println("Ingrese matricula");
        b.setMatricula(leer.next());
        System.out.println("Ingrese eslora");
        b.setEslora(leer.nextInt());
        System.out.println("Ingrese el año de fabricacion");
        b.setAnoDeFabricacion(leer.nextInt());
        
//        Velero v = new Velero();
//        BarcoAMotor bam = new BarcoAMotor();
//        YateDeLujo ydl = new YateDeLujo();
        
        switch (tipoBarco) {
            case 1:
                return b;
            case 2:                
                System.out.println("Ingrese el número de mástiles");
                v.setNumeroDeMastiles(leer.nextInt());
                return v;
            case 3:                
                System.out.println("Ingrese la potencia en CV");
                bam.setPotencia(leer.nextInt());
                return bam;
            case 4:                
                System.out.println("Ingrese el número de camarotes");
                ydl.setNumeroDeCamarotes(leer.nextInt());
                System.out.println("Ingrese la potencia en CV");
                ydl.setPotencia(leer.nextInt());
                return ydl;
        }   
        calcularAlquiler(b, v, bam, ydl);
        return b;
    }
    
//    Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de alquiler y
//    devolución), por un valor módulo de cada barco (obtenido simplemente
//    multiplicando por 10 los metros de eslora).En los barcos de tipo
//    especial el módulo de cada barco se calcula sacando el módulo normal y
//    sumándole el atributo particular de cada barco. En los veleros se suma el
//    número de mástiles, en los barcos a motor se le suma la potencia en CV y
//    en los yates se suma la potencia en CV y el número de camarotes.
    
    public int calcularAlquiler(Barco b, Velero v, BarcoAMotor bam, YateDeLujo ydl){
        
        System.out.println("Indique el tipo de barco que desea alquilar: ");
        String tipoBarco = b.toString();
        
       
        int precio = calcularDiferenciafecha(fechaDeAlquiler, fechaDeDevolucion) * (b.eslora * 10);
                
        switch (tipoBarco){
            case "Velero":                
                return precio + v.getNumeroDeMastiles();                
            case "Barco a motor":                
                return precio + bam.getPotencia();
            case "Yate de lujo":               
                return precio + ydl.getNumeroDeCamarotes() + ydl.getPotencia();
        }
                                            
        return precio;
        
    }
    
    private static int calcularDiferenciafecha(Date fechaDeAlquiler, Date fechaDeDevolucion){
        int diaInicio = fechaDeAlquiler.getDate();
        int diaFin = fechaDeDevolucion.getDate();
        

        return diaFin - diaInicio;
    }
    
}
