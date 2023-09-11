/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import static ejercicios.ejerciciosDeAprendizaje.leer;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import static jdk.nashorn.internal.objects.NativeRegExp.ignoreCase;

/**
 *
 * @author lu_co
 */
public class ejerciciosExtra {
    protected static void ejercicio1(){
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
        usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
        */
        System.out.println("Ingrese el tiempo en minutos:");
        int minutos = leer().nextInt();
        int horas;
        int dias;
        int min;
        
        
        dias = minutos / 1440;
        min = minutos % 1440;
        horas = min / 60;
        int resto = min % 60;
        
        
        
        System.out.println(dias + " día/s, " + horas + " hora/s y " + resto + " minuto/s." );
    };
    protected static void ejercicio2(){
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
        una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
        tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
        iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
        */
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int aux;
        System.out.println("Los valores iniciales son:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        aux = B;
        B = C;
        C = A ; 
        A = D;
        D = aux;
        System.out.println("Los valores finales son:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
    };
    protected static void ejercicio3(){
        /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
        Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
        */
      String vocal = "";
        System.out.println("Ingrese las letras que desee y cuando quiera finalizar ingrese un punto(.) ");
        while (!vocal.equals(".")){
            vocal = leer().nextLine();
            
            if (((vocal.equalsIgnoreCase("A")) || (vocal.equalsIgnoreCase("E")) || (vocal.equalsIgnoreCase("I")) || (vocal.equalsIgnoreCase("O")) || (vocal.equalsIgnoreCase("U")))){
                System.out.println("Ha ingresedo una vocal.");
            } else if (vocal.equals(".")){
                System.out.println("Ha finalizado el ingreso de letras.");
                } else {
                    System.out.println("La letra ingresada no es una vocal.");
                }
        }
    };
    protected static void ejercicio4(){
        /*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
        equivalente en romano.*/
        System.out.println("Por favor, ingrese un número entre el 1 y el 10.");
        int num = leer().nextInt();
        //usando diccionario:
        Map<Integer, String> romans = new HashMap<>();
        romans.put(1, "I");
        romans.put(2, "II");
        romans.put(3, "III");
        romans.put(4, "IV");
        romans.put(5, "V");
        romans.put(6, "VI");
        romans.put(7, "VII");
        romans.put(8, "VIII");
        romans.put(9, "IX");
        romans.put(10, "X");
        
        System.out.println(romans.get(num));
        
        //debe haber una forma mas efectiva...
//        switch (num){
//            case 1:
//                System.out.println("Su equivalente en romanos es: I");
//                break;
//            case 2:
//                System.out.println("Su equivalente en romanos es: II");
//                break;
//            case 3:
//                System.out.println("Su equivalente en romanos es: III");
//                break;
//            case 4:
//                System.out.println("Su equivalente en romanos es: VI");
//                break;
//            case 5:
//                System.out.println("Su equivalente en romanos es: V");
//                break;
//            case 6:
//                System.out.println("Su equivalente en romanos es: VI");
//                break;
//            case 7:
//                System.out.println("Su equivalente en romanos es: VII");
//                break;
//            case 8:
//                System.out.println("Su equivalente en romanos es: VIII");
//                break;
//            case 9:
//                System.out.println("Su equivalente en romanos es IX");
//                break;
//            case 10:
//                System.out.println("Su equivalente en romanos es X");
//                break;
//        }
    };
    protected static void ejercicio5(){
        /*Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
        */
        
       
        System.out.println("Ingrese su clase de socio:");
        System.out.println(" 'A' para tipo A");
        System.out.println(" 'B' para tipo B");
        System.out.println(" 'C' para tipo C");
        char tipo = leer().next().charAt(0);
        System.out.println("Ingrese el valor real del costo del tratamiento:");
        double costoT = leer().nextDouble();
        
        switch (tipo){
            case 'A':
                costoT = costoT * 0.5;
                System.out.println("Su plan cuenta con un %50 de descuento. Usted deberá abonar en efectivo: $" + costoT);
                break;
            case 'B':
                costoT = costoT * 0.35;
                System.out.println("Su plan cuenta con un %35 de descuento. Usted deberá abonar en efectivo: $" + costoT);
                break;
            case 'C':
                System.out.println("Ustede deberá abonar en efectivo: $" + costoT);
                break;
        }
        
    };
    protected static void ejercicio6(){
        /*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
        debajo de 1.60 mts. y el promedio de estaturas en general.
        */
        int acumulador = 0;
        int acumuladorG = 0;
        double suma = 0;
        double sumaG = 0;
        double altura;
        System.out.println("Ingrese la altura en metros. Teclee 1 para finalizar.");
        do { 
            altura = leer().nextDouble();
            if (altura <= 1.60 && altura != 0){
                acumulador++;
                suma = suma + altura;
            } else {
                acumuladorG++;
                sumaG = sumaG + altura;
            }
        } while (altura != 0);
        double total = suma / acumulador;
        double totalG = (suma + sumaG) / (acumulador + (acumuladorG - 1)); //acumuladorG - 1 porque toma el ingreso del 0 para cortar el bucle.
       
        System.out.println("El promedio de las alturas debajo de 1.60 mts es: " + total + " mts. Y el promedio general de alturas es: " + totalG);
        
    };
    protected static void ejercicio7(){
        /*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
        de n números (n>0). El valor de n se solicitará al principio del programa y los números
        serán introducidos por el usuario. Realice dos versiones del programa, una usando el
        bucle “while” y otra con el bucle “do - while”.
        */
        int n = 1;
        int contador = 0;
        int suma = 0;
        int contMax = 0;
        int contMin = 0;
        
        if (n != 0){
            System.out.println("Ingrese un número y para finalizar ingrese 0");
            do{
                contador++;
                suma = suma + n;
                n = leer().nextInt();
                if (n > contMax || contMax == 0){
                    contMax = n;
                }
                if ((n < contMin) && (n != 0) || (contMin == 0)){
                    contMin = n;
                }
            } while (n != 0);
            if (contador > 1){
                double prom = ((double) suma - 1) / ((double)contador - 1);
                System.out.println("El número máximo ingresado es: " + contMax);
                System.out.println("El número mínimo ingresado es: " + contMin);
                System.out.println("El promedio de los números ingresados es: " + prom);
            }
        }
    };
    protected static void ejercicio8(){
        /*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
        */
        System.out.println("Escriba números enteros.");
        int num;
        int acumulador = 0;
        int contP = 0;
        int contI = 0;
        
        do{
            num = leer().nextInt();
            acumulador++;
            
            if (num%2 == 0){
                contP++;
            } else{
                contI++;
            }
        } while (num%5 != 0 && num >= 0);
        
        System.out.println("La cantidad de números leidos es: " + acumulador);
        System.out.println("La cantidad de números pares leidos es: " + contP);
        System.out.println("La cantidad de números impares leidos es: " + contI);
    };
    protected static void ejercicio9(){
        /*Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
        */
        System.out.println("Ingrese el dividendo");
        int dividendo = leer().nextInt();
        System.out.println("Ingrese el divisor");
        int divisor = leer().nextInt();
        int cociente = 1;
        int resto = dividendo - divisor;
        do{
            resto = resto - divisor;
            cociente = cociente + 1;
        } while (resto > divisor);
        System.out.println("El residuo es " + resto + " y el cociente es " + cociente);
        
    };
    protected static void ejercicio10(){
        /*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
    dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
    si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
    al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
    utilizar la función Math.random() de Java.
        */
        Random ran = new Random();
        int aleatorios1 = ran.nextInt(11);
        int aleatorios2 = ran.nextInt(11);
        int respuesta;
        int resultado = aleatorios1 * aleatorios2;
        
        System.out.println("Adivina el resultado!");
        do {
            respuesta = leer().nextInt();

            if (respuesta == resultado){
                System.out.println("¡FELICITACIONES, ADIVINASTE!");
            } else {
                System.out.println("Seguí participando.");
            }
        } while (respuesta != resultado);
    };
    protected static void ejercicio11(){
        /*Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
        */
        System.out.println("Ingrese un número entero");
        int num = leer().nextInt();
	int i = 0;
        while (num != 0){
            num = num / 10;
            i++;
        }
        System.out.println("El número de dígitos del número ingresado es: " + i);
    };
    protected static void ejercicio12(){
        /*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
        0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
        Ejemplo:
        0-0-0
        0-0-1
        0-0-2
        0-0-E
        0-0-4
        0-1-2
        0-1-E
        Nota: investigar función equals() y como convertir números a String.
        */
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    String digito1 = i == 3 ? "E" : String.valueOf(i);
                    String digito2 = j == 3 ? "E" : String.valueOf(j);
                    String digito3 = k == 3 ? "E" : String.valueOf(k);
                    
                    System.out.println(digito1 + "-" + digito2 + "-" + digito3);
                }
            }
        }
    };
    protected static void ejercicio13(){
        /*Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
        */
        System.out.println("Por favor, ingrese la altura");
        int altura = leer().nextInt();
        
        for (int i = 1; i <= altura; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("");
    };
    protected static void ejercicio14(){
        /*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
        hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
        de hijos para averiguar la media de edad de los hijos de todas las familias.
        */
        
        System.out.println("Ingrese la cantidad de familias:");
        int n = leer().nextInt();

        int totalHijos = 0;
        int totalEdades = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese la cantidad de hijos para la familia " + i + ":");
            int m = leer().nextInt();

            for (int j = 1; j <= m; j++) {
                System.out.println("Ingrese la edad del hijo " + j + " de la familia " + i + ":");
                int edad = leer().nextInt();

                totalHijos++;
                totalEdades += edad;
            }
        }

        double mediaEdad = (double) totalEdades / totalHijos;

        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad);
    
    };
    protected static void ejercicio15(){
        /*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
        restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
        matemática y deben devolver sus resultados para imprimirlos en el main.
        */
        System.out.println("Ingrese dos números: ");
        int n1 = leer().nextInt();
        int n2 = leer().nextInt();
        int opcion;
        do{
            System.out.println("Elija la opción deseada: ");
            System.out.println("1.Sumar.");
            System.out.println("2.Restar.");
            System.out.println("3.Multiplicar.");
            System.out.println("4.Dividir.");
            System.out.println("5.Salir.");
            opcion = leer().nextInt();
            
        
        
            switch (opcion) {
                case 1:
                    System.out.println("El resultado es: " + sumar(n1, n2));
                    break;
                case 2:
                    System.out.println("El resultado es: " + restar(n1, n2));
                    break;
                case 3:
                    System.out.println("El resultado es: " + multiplicar(n1, n2));
                    break;
                case 4:
                    System.out.println("El resultado es: " + dividir(n1, n2));
                    break;
            }
        } while (opcion != 5);
    };
        private static int sumar(int n1, int n2){
            int suma = n1 + n2;
            return suma;
        };
        private static int restar(int n1, int n2){
            int resta = n1 - n2;
            return resta;
        };
        private static int multiplicar(int n1, int n2){
            int multipli = n1 * n2;
            return multipli;
        };
        private static double dividir(int n1, int n2){
            double division = (double) n1 /(double) n2;
            return division;
        };
    protected static void ejercicio16(){
        /*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
        */
        String opcion;
        String nombre;
        int edad;
        int cont = 1;
        
        do{
            System.out.println("Ingrese el nombre: ");
            nombre = leer().nextLine();
            System.out.println("Ingrese la edad: ");
            edad = leer().nextInt();
            
            System.out.println("El nombre de la persona " + cont + " es " + nombre);
            System.out.println("Su edad es " + edad + " años.");

            if (edad < 18){
                System.out.println("Es MENOR de edad.");
            } else {
                System.out.println("Es MAYOR de edad.");            
            }

            System.out.println("¿Desea continuar? si/no");
            opcion = leer().nextLine();
            cont++;
        } while(opcion.equalsIgnoreCase("si"));
        
    };

    protected static void ejercicio17(){
        /*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
¿Qué son los números primos?
Básicamente, un número primo es un número natural que tiene solo dos divisores o
factores: 1 y el mismo número. Es decir, es primo aquel número que se puede dividir por
uno y por el mismo número.
El primer número primo es 2, y hay 25 números primos entre 1 y 100, ellos son: 2, 3, 5, 7, 11,
13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97.
        */
        System.out.println("Ingrese un número");
        int num = leer().nextInt();
        System.out.println("El número " + num + ", ¿es primo?: " + primo(num));
        
    };
        private static boolean primo(int num){
            int contador = 0;
            boolean resultado = true;
            for (int i = 1; i < num; i++){
                if (num % i == 0){
                    contador++;
                }
            }
            if (contador == 2){
                resultado = false;
            }
        return resultado;
        }
        
    protected static void ejercicio18(){
        /*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
        */
        System.out.println("Ingrese el tamaño del vector:");
        int n = leer().nextInt();
        int[] vector = new int[n];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = leer().nextInt();
        }
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += vector[i];
        }
        System.out.println("La suma de los elementos del vector es: " + suma);
    
    };

    protected static void ejercicio19(){
        /*Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
        */
          System.out.println("Ingrese el tamaño de los vectores:");
        int n = leer().nextInt();

        int[] vector1 = new int[n];
        int[] vector2 = new int[n];

        System.out.println("Ingrese los elementos del primer vector:");

        for (int i = 0; i < n; i++) {
            vector1[i] = leer().nextInt();
        }

        System.out.println("Ingrese los elementos del segundo vector:");

        for (int i = 0; i < n; i++) {
            vector2[i] = leer().nextInt();
        }

        boolean sonIguales = true;

        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                sonIguales = false;
                break;
            }
        }

        if (sonIguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores son diferentes.");
        }
    };
    protected static void ejercicio20(){
        /*Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
        parámetro. Después haremos otra función o procedimiento que imprima el vector.
        */
        int[] vector = new int[5]; // Tamaño del vector

        llenarVectorAleatorio(vector);
        imprimirVector(vector);
    }

        private static void llenarVectorAleatorio(int[] vector) {
            Random random = new Random();

            for (int i = 0; i < vector.length; i++) {
                vector[i] = random.nextInt(100); // Números aleatorios del 0 al 99
            }
        }

        private static void imprimirVector(int[] vector) {
            for (int i = 0; i < vector.length; i++) {
                System.out.print(vector[i] + " ");
            }
            System.out.println();
        }
    protected static void ejercicio21(){
        /*Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
        */
        int cantidadAlumnos = 10;
        double[] promedios = new double[cantidadAlumnos];
        int aprobados = 0;
        int desaprobados = 0;

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese las notas del alumno " + (i + 1) + ":");

            double nota1 = leer().nextDouble();
            double nota2 = leer().nextDouble();
            double nota3 = leer().nextDouble();
            double nota4 = leer().nextDouble();

            double promedio = calcularPromedio(nota1, nota2, nota3, nota4);
            promedios[i] = promedio;

            if (promedio >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    };

        private static double calcularPromedio(double nota1, double nota2, double nota3, double nota4) {
            double promedio = nota1 * 0.1 + nota2 * 0.15 + nota3 * 0.25 + nota4 * 0.5;
            return promedio;

        };
    protected static void ejercicio22(){
        /*Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
        muestre la suma de sus elementos.
        */
        int n = 3; // Filas de la matriz
        int m = 4; // Columnas de la matriz
        
        int[][] matriz = new int[n][m];

        rellenarMatrizAleatoria(matriz);
        int suma = sumarMatriz(matriz);

        System.out.println("La suma de los elementos de la matriz es: " + suma);
    };
    
        private static void rellenarMatrizAleatoria(int[][] matriz) {
            Random random = new Random();
        
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = random.nextInt(100); // Números aleatorios del 0 al 99
                }
            }
        }
    
        private static int sumarMatriz(int[][] matriz) {
            int suma = 0;

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    suma += matriz[i][j];
                }
            }

            return suma;
        }
    

    protected static void ejercicio23(){
        /*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
        */
         String[] palabras = new String[5];

        // Leer las palabras del usuario
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Ingrese una palabra de 3 a 5 caracteres:");
            palabras[i] = leer().nextLine();
        }

        // Crear la sopa de letras
        char[][] sopa = new char[20][20];

        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                sopa[i][j] = getRandomChar();
            }
        }

        // Ubicar las palabras en una fila aleatoria
        int fila = (int) (Math.random() * 20);

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];

            for (int j = 0; j < palabra.length(); j++) {
                if (j < 20 && fila < 20) {
                    sopa[fila][j] = palabra.charAt(j);
                }
            }

            fila++;
        }

        // Rellenar los espacios no utilizados con números aleatorios
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                if (sopa[i][j] == '\u0000') {
                    sopa[i][j] = getRandomDigit();
                }
            }
        }

        // Imprimir la sopa de letras
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    };

        private static char getRandomChar() {
            String letras = "abcdefghijklmnopqrstuvwxyz";
            int indice = (int) (Math.random() * letras.length());
            return letras.charAt(indice);
        };

        private static char getRandomDigit() {
            int digito = (int) (Math.random() * 10);
            return Character.forDigit(digito, 10);
        };
    //no me pone las palabras aleatorias, sino que una abajo de la otra
    protected static void ejercicio24(){
        /*Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente...
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente link:
https : // quantdare.com/numeros-de-fibonacci/
        */
        System.out.println("Ingrese la cantidad de números de la sucesión de Fibonacci que desea generar:");
        int n = leer().nextInt();

        long[] fibonacci = new long[n];

        calcularFibonacci(fibonacci);

        System.out.println("Sucesión de Fibonacci de " + n + " números:");

        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }

        private static void calcularFibonacci(long[] fibonacci) {
            if (fibonacci.length >= 1) {
                fibonacci[0] = 1;
            }

            if (fibonacci.length >= 2) {
                fibonacci[1] = 1;
            }

            for (int i = 2; i < fibonacci.length; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
    }
};