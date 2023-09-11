/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10arrays;

import java.util.Arrays;

/**
 *
 * @author lu_co
 */
public class Ejercicio10Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
        de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
        programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
        Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
        ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
        0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
        20.
        */
        float[] A = new float[50];
        float[] B = new float[20];

        //relleno del arreglo A
        for (int i = 0; i < 50; i++) {
            A[i] = (float) (Math.random() * 10);
        }
        //muestra por pantalla el arreglo A
//        System.out.println("Array A:");
//        for (int i = 0; i < 50; i++){
//            System.out.println(A[i]);
//        }
        //ordena de menor a mayor el arreglo A
        Arrays.sort(A);
        System.out.println("Array A ordenado");
        for (int i = 0; i < 50; i++){
            System.out.println(A[i]);
        }
        
        //copia los primeros 10 numeros ordenados de A a B
        System.arraycopy(A, 0, B, 0, 10);
        //rellena el arreglo B desde la posicion 11 hasta la 19 con 0.5
//        for (int i = 0; i < B.length; i++){
//            B[i] = 0.5f;
//        }
        Arrays.fill(B, 10, B.length, 0.5f);
        
        //muestra por pantalla el arreglo B
        System.out.println("Array B");
        for (int i = 0; i < B.length; i++){            
            System.out.println(B[i]);
        }
        
    }

}
