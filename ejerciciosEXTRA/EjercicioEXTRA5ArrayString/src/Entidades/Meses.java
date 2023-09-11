/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class Meses {
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*
    Crea una clase en Java donde declares una variable de tipo array de Strings que
        contenga los doce meses del año, en minúsculas. A continuación, declara una variable
        mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
        mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
        usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
        el mes secreto. Un ejemplo de ejecución del programa podría ser este:
        Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
        No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
        ¡Ha acertado!
    */
    private String[] meses;
    private String mesSecreto;

    public Meses() {
        this.meses = new String[12];
    }

    public Meses(String[] meses, String mesSecreto) {
        this.meses = new String [12];
        this.mesSecreto = mesSecreto;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getMeses() {
        return meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void crearMes(){
        
        meses[0] = "enero";
        meses[1] = "febrero";
        meses[2] = "marzo";
        meses[3] = "abril";
        meses[4] = "mayo";
        meses[5] = "junio";
        meses[6] = "julio";
        meses[7] = "agosto";
        meses[8] = "septiembre";
        meses[9] = "octubre";
        meses[10] = "noviembre";
        meses[11] = "diciembre";
        
    }
    
    public void mesSecreto(){
        String mes = "";
        crearMes();
        mesSecreto = meses[7];
        
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas");
        do{
            
            mes = leer.nextLine();
            if (!(mes.equals(mesSecreto))) {
                
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes.");
                
            } else {
                System.out.println("¡Ha acertado!");
            }   
        } while (!mes.equals(mesSecreto));
    }
    
}
