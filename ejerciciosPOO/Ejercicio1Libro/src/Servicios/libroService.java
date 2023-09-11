/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import libreria.Libro;

/**
 *
 * @author lu_co
 */
public class libroService {
    public static void ingreso() {
    Scanner leer = new Scanner(System.in);

    System.out.println("Por favor, ingrese el ISBN del libro.");
        int ISBN = leer.nextInt();
        leer.nextLine();
    System.out.println("Por favor, ingrese el título del libro.");
        String titulo = leer.nextLine();    
    System.out.println("Por favor, ingrese el número de páginas del libro.");
        int numeroDePaginas = leer.nextInt();
        leer.nextLine();
    System.out.println("Por favor, ingrese el autor del libro.");
        String autor = leer.nextLine();
    Libro miLibro = new Libro(ISBN, titulo, autor, numeroDePaginas);


    System.out.println("Los datos cargados son: ");
    System.out.println("El ISBN: " + miLibro.getISBN());
    System.out.println("El título: " + miLibro.titulo);
    System.out.println("El autor: " + miLibro.autor);
    System.out.println("El número de páginas: " + miLibro.numeroDePaginas);
    } 
}
