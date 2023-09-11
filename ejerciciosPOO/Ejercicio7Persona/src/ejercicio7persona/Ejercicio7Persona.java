/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7persona;

import Entidad.Persona;
import Servicios.ServicioPersona;
import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class Ejercicio7Persona {

    /**
     * @param args the command line arguments
     */
    /*
    Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServicioPersona sP = new ServicioPersona();
        
       /* System.out.println("Ingrese el nombre de la persona.");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la edad de la persona.");
        int edad = leer.nextInt();
        String sexo = "";
        while ((sexo.equals("O") || sexo.equals("H") || sexo.equals("M"))) {
            if ((sexo.equals("O") || sexo.equals("H") || sexo.equals("M"))) {
                System.out.println("Ingrese el sexo de la persona H(Hombre), M(Mujer) u O(Otro).");
                sexo = leer.nextLine();
            } else {
                System.out.println("Incorrecto, vuelva a ingresar.");
            }
        }
        System.out.println("Ingrese el peso de la persona.");
        float peso = leer.nextFloat();
        System.out.println("Ingrese la altura de la persona.");
        float altura = leer.nextFloat();
        */
       /*Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.*/
        Persona persona1 = sP.crearPersona("Hari", 28, "H", 63, (float) 1.73);
        Persona persona2 = sP.crearPersona("Dante", 16, "H", 130, (float) 1.70);
        Persona persona3 = sP.crearPersona("Puma", 26, "M", 46, (float) 1.55);
        Persona persona4 = sP.crearPersona("Marto", 29, "H", 72, (float) 1.84);
        int mayor = 0;
        int menor = 0;
        int equilibrado = 0;
        int sobrePeso = 0;
        int bajoPeso = 0;
        int p1 = sP.calcularIMC(persona1);
        if (p1 == 0) {
            equilibrado++;
            System.out.println(persona1.getNombre() + " está en su peso ideal.");
        } else if (p1 == -1) {
            bajoPeso++;
            System.out.println(persona1.getNombre() + " está por debajo de su peso ideal.");
        } else {
            sobrePeso++;
            System.out.println(persona1.getNombre() + " tiene sobrepeso.");
        }
        boolean pP1 = sP.esMayorDeEdad(persona1);
        if (pP1 == true) {
            mayor++;
            System.out.println(persona1.getNombre() + " es mayor de edad.");
        } else {
            menor++;
            System.out.println(persona1.getNombre() + " es menor de edad.");
        }

        int p2 = sP.calcularIMC(persona2);
        if (p2 == 0) {
            equilibrado++;
            System.out.println(persona2.getNombre() + " está en su peso ideal.");
        } else if (p1 == -1) {
            bajoPeso++;
            System.out.println(persona2.getNombre() + " está por debajo de su peso ideal.");
        } else {
            sobrePeso++;
            System.out.println(persona2.getNombre() + " tiene sobrepeso.");
        }
        boolean pP2 = sP.esMayorDeEdad(persona2);
        if (pP2 == true) {
            mayor++;
            System.out.println(persona2.getNombre() + " es mayor de edad.");
        } else {
            menor++;
            System.out.println(persona2.getNombre() + " es menor de edad.");
        }
        int p3 = sP.calcularIMC(persona3);
        if (p3 == 0){
            equilibrado++;
            System.out.println(persona3.getNombre() + " está en su peso ideal.");
        } else if (p3 == -1) {
            bajoPeso++;
            System.out.println(persona3.getNombre() + " está por debajo de su peso ideal.");
        } else {
            sobrePeso++;
            System.out.println(persona3.getNombre() + " tiene sobrepeso.");
        }
        boolean pP3 = sP.esMayorDeEdad(persona3);
        if (pP3 == true) {
            mayor++;
            System.out.println(persona3.getNombre() + " es mayor de edad.");
        } else {
            menor++;
            System.out.println(persona3.getNombre() + " es menor de edad.");
        }
        int p4 = sP.calcularIMC(persona4);
        if (p4 == 0) {
            equilibrado++;
            System.out.println(persona4.getNombre() + " está en su peso ideal.");
        } else if (p1 == -1) {
            bajoPeso++;
            System.out.println(persona4.getNombre() + " está por debajo de su peso ideal.");
        } else {
            sobrePeso++;
            System.out.println(persona4.getNombre() + " tiene sobrepeso.");
        }
        boolean pP4 = sP.esMayorDeEdad(persona4);
        if (pP4 == true) {
            mayor++;
            System.out.println(persona4.getNombre() + " es mayor de edad.");
        } else {
            menor++;
            System.out.println(persona4.getNombre() + " es menor de edad.");
        }
        /*Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
        distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
        cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
        también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores*/
        System.out.println("Hay un " + (equilibrado * 25) + "% de personas en su peso ideal.");
        System.out.println("Hay un " + (bajoPeso * 25) + "% de personas por debajo de su peso ideal.");
        System.out.println("Hay un " + (sobrePeso * 25) + "% de personas por encima de su peso ideal.");
        System.out.println("Hay un " + (mayor * 25) + "% de mayores de edad.");
        System.out.println("Hay un " + (menor * 25) + "% de menores de edad.");
        
        
    }
}
