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
public class NIF {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Integer dni;
    private String letra;

    public NIF() {
    }

    public NIF(Integer dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Integer getDni() {
        return dni;
    }

    public String getLetra() {
        return letra;
    }

    /*
     Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
        corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
        resultado del calculo.*/
    public String crearNif() {
        System.out.println("Ingrese número de DNI");
        dni = leer.nextInt();
        
        String[] letras = new String[23];
        letras[0] = "T";
        letras[1] = "R";
        letras[2] = "W";
        letras[3] = "A";
        letras[4] = "G";
        letras[5] = "M";
        letras[6] = "Y";
        letras[7] = "F";
        letras[8] = "P";
        letras[9] = "D";
        letras[10] = "X";
        letras[11] = "B";
        letras[12] = "N";
        letras[13] = "J";
        letras[14] = "Z";
        letras[15] = "S";
        letras[16] = "Q";
        letras[17] = "V";
        letras[18] = "H";
        letras[19] = "L";
        letras[20] = "C";
        letras[21] = "K";
        letras[22] = "E";
        
        for (int i = 0; i < letras.length; i++){
            if (i == (dni%23)){
                letra = letras[i];
            }             
        }
        return letra;
            
    }

    /*    Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
        en mayúscula; por ejemplo: 00395469-F).
        La letra correspondiente al dígito verificador se calculará a traves de un método que
        funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
        número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
        buscar en un array (vector) de caracteres la posición que corresponda al resto de la
        división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
     */
    public void mostrar(){
        System.out.println("El NIF es: ");
        System.out.println(dni + "-" + letra.toUpperCase());
    }
}
