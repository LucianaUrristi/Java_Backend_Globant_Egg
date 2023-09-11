package ejercicios;

//import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lu_co
 */
public class guia1 {

    /*protected static void ej(int numEj) throws NoSuchMethodException {
        Method metodo = guia1.class.getDeclaredMethod("ejercicio" + numEj);
        metodo.invoke();
    };
    */
     protected static void ejercicio1(){
         /*Crear un proyecto de Java y definir al menos 6 variables 
         en tu IDE de distintos tipos de datos.*/
        boolean trueFalse;
        double decimal;
        char chhar;
        String caracteres;
        int num;
        float decimales;
     };
     protected static void ejercicio2(){
         /*¿Recuerdas las variables que creaste en el ejercicio anterior? 
        Ahora deberás asignarles un valor.*/
        boolean trueFalse = false;
        double decimal = 0.25;
        char chhar = 'u';
        String caracteres = "Hola, ¿qué tal?";
        int num = 25;
        float decimales;
         decimales = (float) 0.02455;
         System.out.println(trueFalse);
         System.out.println(decimal);
         System.out.println(chhar);
         System.out.println(caracteres);
         System.out.println(num);
         System.out.println(decimales);
     };
     protected static void ejercicio3(){
         /*Define variables donde puedas alojar los resultados 
         y prueba usar dos operadores de cada tipo.*/
        int num1 = 5;
        int num2 = 4;
        
        int resultado1;
        int resultado2;
        
        resultado1 = num1 + num2;
        resultado2 = resultado1 / 3;
         System.out.println("El resultado de la suma es: " + resultado1);
         System.out.println("El resultado de la división es: " + resultado2); 
     };
     protected static void ejercicio4(){
       /*Define una variable que aloje tu nombre y 
       otra que guarde tu edad. Imprime ambas variables por pantalla.*/
        String nombre = "Luciana";
        int edad = 28;
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su edad es: " + edad);
     };
     protected static void ejercicio5(){
        /*Define una variable de tipo boolean, double y char.
        Guarda información en ellas a través del Scanner.*/
        System.out.println("Ingrese un booleano, un decimal y un char: ");
        Scanner leer = new Scanner(System.in);
        boolean trueFalse = leer.nextBoolean();
        double decimal = leer.nextDouble();
        char caracter = 'u';
        
        System.out.println(trueFalse + "" + decimal + caracter);
       // System.out.println(decimal);
        //System.out.println(caracter);
                
     };
     protected static void ejercicio6(){
        /*Implementar un programa que le pida dos números enteros
        a usuario y determine si ambos o alguno de ellos es mayor a 25.*/
        System.out.println("Ingrese un número: ");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número: ");
        int num2 = leer.nextInt();
        if (num1>25 || num2>25){
            System.out.println("Uno o ambos de los números es mayor a 25");
        } else {
            System.out.println("Ningun número es mayor a 25");
        }
    };
     protected static void ejercicio7(){
        /*Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
        que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y
        permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
        o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
        o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de
        gasolina”.
        o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de
        hormigón”.
        o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta
        alimenticia”.
        o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
        válido para tipo de bomba”*/
        int tipoMotor;
        System.out.println("Ingrese el tipo de motor: ");
        Scanner motor = new Scanner(System.in);
        tipoMotor = motor.nextInt();
        switch(tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua.");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina.");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón.");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia.");
                break;
            default:
                System.out.println("No existe valor valido para tipo de bomba.");
                break;     
        }
    };
     protected static void ejercicio8(){
        /*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
        pedirá de nuevo hasta que la nota sea correcta.*/
        Scanner leer = new Scanner(System.in);
        int nota;
        System.out.println("Ingrese su nota: ");
        do {
            
            nota = leer.nextInt();
           if (nota >= 11 || nota <= -1) { //preguntar por que no toma el mayor/menor igual que..
               //si ponía: nota >= 10 cuando ponía 10, entraba en q no estaba entre 0 y 10 en vez de entrar al else.
               System.out.println("Su nota " + nota + " no está entre 0 y 10, ingrese otra: ");
           } else {
               System.out.println("Su nota " + nota + " está entre 0 y 10.");
           }           
        } while (nota <= -1 || nota >= 11);
        
    };
     protected static void ejercicio9(){
        /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
        bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
        resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
        Nota: recordar el uso de la sentencia break.
        */
        System.out.println("Ingrese 20 números enteros: ");
        Scanner leer = new Scanner(System.in);
         int num;
         int suma = 0;
         int acumulador = 0;
        do {
         num = leer.nextInt();
         if (num == 0) {
         System.out.println("Se capturó el número cero");
         } else {
            suma = suma + num;
            acumulador ++;
         }
         if (acumulador == 20){
             System.out.println("No se ha encontrado el 0 en los valores ingresados");
         }
        } while (num != 0 && acumulador < 20);
        System.out.println("La suma de los números ingresados es: " + suma);
    };
     protected static void ejercicio10(){
        /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
        ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
        5 *****
        3 ***
        11 ***********
        2 **
        */
        
        Scanner leer = new Scanner(System.in);
         int num;
        System.out.println("Ingrese un número enteros: ");
        for (int i = 0; i < 4; i++) {
            num = leer.nextInt();
            System.out.print(num + " ");
            for (int j = 0; j < num; j++){
                System.out.print("*");
        }
            System.out.println(" ");
        }
     }; 
     protected static void ejercicio11(){
        /*Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
        en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
        reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
        vocales acentuadas) se mantienen sin cambios.

        a e i o u
        @ # $ % *

        Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
        correspondiente. Utilice la estructura “según” para la transformación.
        Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
        La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
        */
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase o palabra, para finalizar escriba un . (punto)");
        frase = leer.nextLine();
        
        String fraseCod;
        char letra;
        String resultado = " ";
        int longitud = frase.length();
        for (int i = 0; i < longitud; i++){
            letra = frase.charAt(i);
            letra = caracter(letra);
            resultado = (resultado + letra);
        }
        fraseCod = resultado;
        System.out.println("La frase codificada sería: " + fraseCod);
     }
        public static char caracter(char letra){
        char resultado;
        resultado = letra;
        if (letra == 'a' || letra == 'A'){
	resultado = '@';
        }
	if (letra == 'e' || letra == 'E'){
        resultado = '#';
        }
	if (letra == 'i' || letra == 'I'){
	resultado = '$';
        }
	if (letra == 'o' || letra == 'O'){
	resultado = '%';
        }
	if (letra == 'u' || letra == 'U') {
	resultado = '*';
        }
        return resultado;
        }

     protected static void ejercicio12(){
        /*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
        que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
        segundo, sino informe que no lo son.
        */ 
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int n1 = leer.nextInt();
        System.out.println("Ingrese otro número: ");
        int n2 = leer.nextInt(); 
        boolean resultado = esMultiplo(n1, n2);
         System.out.println("El resultado es: " + resultado);
     };
        public static boolean esMultiplo(int n1, int n2){
        boolean resultado = false;
        if (n2 % n1 == 0){
            resultado = true;
        }
        return resultado;
        };
     
     protected static void ejercicio13y14(){
        /*Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
        define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
        EJERCICIO 14: Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor, ingresá la cantidad de compañeros de equipo: ");
        int cantidad = leer.nextInt();
        leer.nextLine();
        System.out.println("Por favor, ingresá los nombres de tus compañeros de equipo: ");
        String[] equipo = new String[cantidad];
        
        for (int i = 0; i < cantidad; i++){
        equipo[i] = leer.nextLine();
        }
         for (int i = 0; i < cantidad; i++){
        System.out.println(equipo[i]);
        
        } 
//        System.out.println("cuantos son?");
//        int n=leer.nextInt();
//        leer.nextLine();
//        String[] equipo= new String[n];
//    
//        for (int i=0; i<n;i++){
//            System.out.println("escribi el miembro "+ (i+1));
//            equipo[i]=leer.nextLine();
//        }
//        System.out.println(Arrays.toString(equipo));
     }
};


   