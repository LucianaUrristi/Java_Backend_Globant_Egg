/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2figurasgeometricas;

import Entidades.Circulo;
import Entidades.Hexagono;
import Entidades.Pentagono;
import Entidades.Rectangulo;
import Entidades.Rombo;
import Entidades.Triangulo;
import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class EjercicioEXTRA2FigurasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean continuar = true;
        do {
            continuar = menu();
        } while (continuar);

    }

    public static boolean menu() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        System.out.println("Bienvenido, ¿Qué figura deseas crear?");
        System.out.println("1. Circulo");
        System.out.println("2. Hexagono.");
        System.out.println("3. Pentagono.");
        System.out.println("4. Rectangulo.");
        System.out.println("5. Cuadrado.");
        System.out.println("6. Rombo");
        System.out.println("7. Triangulo");
        System.out.println("8. Salir");

        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                Circulo circulo = new Circulo();
                circulo.crearCirculo();
                circulo.obtenerArea();
                circulo.obtenerPerimetro();
                break;
            case 2:
                Hexagono hexagono = new Hexagono();
                hexagono.crearHexagono();
                hexagono.obtenerArea();
                hexagono.obtenerPerimetro();
                break;
            case 3:
                Pentagono pentagono = new Pentagono();
                pentagono.crearPentagono();
                pentagono.obtenerArea();
                pentagono.obtenerPerimetro();
                break;
            case 4:
                Rectangulo rectangulo = new Rectangulo();
                rectangulo.crearRectangulo();
                rectangulo.obtenerArea();
                rectangulo.obtenerPerimetro();
                break;
            case 5:
                Rectangulo cuadrado = new Rectangulo();
                cuadrado.crearRectangulo();
                cuadrado.obtenerArea();
                cuadrado.obtenerPerimetro();
                break;
            case 6:
                Rombo rombo = new Rombo();
                rombo.crearRombo();
                rombo.obtenerArea();
                rombo.obtenerPerimetro();
                break;
            case 7:
                Triangulo triangulo = new Triangulo();
                triangulo.crearTriangulo();
                triangulo.obtenerArea();
                triangulo.obtenerPerimetro();
                break;
            case 8:
                return false;
        }
        return true;
    }
}
