package ejercicios;

import java.util.Random;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author lu_co
 */
public class ejerciciosDeAprendizaje {
    protected static void ejercicio1(){
        /*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
        dos. El programa deberá después mostrar el resultado de la suma
        */  
        System.out.println("Ingrese dos múmeros: ");
        int n1 = leer().nextInt();
        int n2 = leer().nextInt(); 
        System.out.println("El resultado es: " + (n1 + n2));    
    };
    protected static void ejercicio2(){
        /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
        pantalla.
        */
        System.out.println("Por favor, ingresá tu nombre: ");
        String name = leer().nextLine();
        System.out.println("Su nombre es: " + name);
    };
    protected static void ejercicio3(){
        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
        en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        */
        System.out.println("Escriba una frase: ");
        String frase = leer().nextLine();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        
    };
    protected static void ejercicio4(){
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
        Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        */
        System.out.println("Ingrese la cantidad de grados en centígrados: ");
        float gradosCent = leer().nextFloat(), F;
        F = 32 + (9 * gradosCent / 5);
        System.out.println(gradosCent + "ºC equivalen a " + F + "ºF");
    };
    protected static void ejercicio5(){
        /*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
        doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
        */
        System.out.println("Ingrese un número entero: ");
        int numE = leer().nextInt(), numD, numT;
        double numR;
        numD = numE * 2;
        numT = numE * 3;
        numR = Math.sqrt(numE);
        System.out.println("El doble del número " + numE + " es: " + numD);
        System.out.println("El triple del número " + numE + " es: " + numT);
        System.out.println("La raíz cuadrada del número " + numE + " es: " + numR);
    };
    
    //EJERCICIOS CON CONDICIONALES
    
    protected static void ejercicio6(){
        //Crear un programa que dado un numero determine si es par o impar.
        System.out.println("Ingrese un número: ");
        int n = leer().nextInt();
        if (n % 2 == 0){
            System.out.println("El número " + n + " es par.");
        } else {
            System.out.println("El número " + n + " es impar.");
        }
    };
    protected static void ejercicio7(){
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
        pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
        la función equals() en Java.        
        */
        System.out.println("Ingrese una frase: ");
        String frase = leer().nextLine();
        if (frase.equals("eureka")){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    };
    protected static void ejercicio8(){
        /*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
        usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
        pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
        Nota: investigar la función Lenght() en Java.        
        */
         System.out.println("Ingrese una frase: ");
        String frase = leer().nextLine();
        if (8 == frase.length()){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    };
    protected static void ejercicio9(){
        /*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
        es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
        diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
        la función Substring y equals() de Java. 
        */
          System.out.println("Ingrese una frase: ");
        String frase = leer().nextLine(), cadena;
      
        if ("A".equals(frase.substring(0, 1))){
          System.out.println("CORRECTO");
        } else {
         System.out.println("INCORRECTO");
        }
    };
    
    //BUCLES Y SENTENCIAS DE SALTO BREAK Y CONTINUE
    
    protected static void ejercicio10(){
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
        números al usuario hasta que la suma de los números introducidos supere el límite inicial.        
        */
        System.out.println("Ingrese un valor límite positivo: ");
        int numLim = leer().nextInt(), suma;
        suma = 0;
        
        do {
            System.out.println("Ingrese un valor valores: "); 
            int valores = leer().nextInt();
            suma = suma + valores;
        } while (suma <= numLim);
       
        System.out.println("El límite ingresado es: " + numLim + " y la suma de los números ingresados es : " + suma);
    };
    protected static void ejercicio11(){
        /*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
        pantalla el siguiente menú:

        MENU
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir
        5. Salir
        Elija opción:

        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
        y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
        Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
        directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
        desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
        programa, caso contrario se vuelve a mostrar el menú.
        */
        boolean N = false;
        System.out.println("Ingrese dos múmeros enteros positivos: ");
         int n1 = leer().nextInt();
         int n2 = leer().nextInt();
         
        while (N == false){
          
         System.out.println("Elija una opción: ");
         System.out.println("MENU");
         System.out.println("1. Sumar");
         System.out.println("2. Restar");
         System.out.println("3. Multiplicar");
         System.out.println("4. Dividir");
         System.out.println("5. Salir");
         int opcion = leer().nextInt();
         String respuesta;
        
            switch (opcion) {
                case 1:
                 System.out.println("El resultado de la suma de " + n1 + " + " + n2 + " es igual a: " + (n1+n2));
                    N = false;
                    break;
                case 2:
                 System.out.println("El resultado de la resta de " + n1 + " - " + n2 + " es igual a: " + (n1-n2));
                     N = false;
                    break;
                case 3:
                 System.out.println("El resultado de la multiplicación de " + n1 + " x " + n2 + " es igual a: " + (n1*n2));
                    N = false;
                    break;
                case 4:
                 System.out.println("El resultado de la división de " + n1 + " / " + n2 + " es igual a: " + (n1/n2));
                    N = false;
                    break;
                case 5:
                 System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    respuesta = leer().nextLine();
                    respuesta = toUpperCase(respuesta);
                    if (respuesta.equals("S")){
                     N = true;
                    }           
                    break;
                }
        }    
    };
        
    protected static void ejercicio12(){
        /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
        dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
        fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
        X y el último tiene que ser una O.
        Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
        especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
        de FDE, que no respete el formato se considera incorrecta.
        Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
        incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
        siguientes funciones de Java Substring(), Length(), equals().        
        */
        
        String FD;
        int acumuladorC = 0;
        int acumuladorI = 0;
        String FDE = "&&&&&";
        do {
            System.out.println("Ingrese su cadena");
            FD = leer().nextLine(); 
            int largo = FD.length();
  
            String letra1 = toUpperCase(FD.substring(0, 1));
            String letra2 = toUpperCase(FD.substring(largo - 1));
            if ((letra1.equals("X")) && (letra2.equals("O")) && (largo == 5)) {
                acumuladorC++;
            } else {
                acumuladorI++;
            }
        }while (!FDE.equals(FD));
        
        System.out.println("Cantidad de ingresos correctos: " + acumuladorC);
        System.out.println("Cantidad de ingresos incorrectos: " + (acumuladorI-1));   
            
    };
    
    protected static void ejercicio13(){
        /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
        cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        * * * *
        *     *
        *     *
        * * * * 
        */
        System.out.println("Ingrese el tamaño del cuadrado");
        int tam = leer().nextInt();
        
        for (int i = 1; i <= tam; i++){
            for (int j = 1; j <= tam; j++){
                if ((i == 1 || i == tam) || (j == 1 || j == tam)){
                    System.out.print(" * ");
                } else {    
                    System.out.print("   ");
                }
            }
           System.out.println(" ");
        }
    };
    
    //FUNCIONES EN JAVA
    
    protected static void ejercicio14(){
        /*Crea una aplicación que a través de una función nos convierta una cantidad de euros
        introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
        (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €
        */
        System.out.println("Por favor, elija el tipo de cambio: ");
        System.out.println("Libras.");
        System.out.println("Dolares.");
        System.out.println("Yenes.");
        String moneda = leer().nextLine();
        System.out.println("Ingrese la cantidad de euros que desea convertir: ");
        double euros = leer().nextDouble();
        convertidor(euros, moneda);
        
    };
        public static void convertidor(double euros, String moneda){
        double cambio = 0;
        switch (moneda) {
            case "Libras":
                double libras = 0.86 * euros;
                System.out.println("En total son: £ " + libras);
            break;
            case "Dolares":
                double dolares = 1.28611 * euros;
                System.out.println("En total son: u$d " + dolares);
            break;
            case "Yenes":
                double yenes = 129.852 * euros;
                System.out.println("En total son: ¥ " + yenes);
            break;
        }
    };
        
    //VECTORES Y MATRICES EN JAVA
    
    protected static void ejercicio15(){
        /*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
        muestre por pantalla en orden descendente.        
        */
        int[] num = new int[100];
        for (int i = 0; i < 100; i++){
            num[i] = i + 1;
        }
        for (int i = 99; i >= 0; i--){
            System.out.println(num[i]);
        }
    };
    protected static void ejercicio16(){
        /*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
        usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
        numero y si se encuentra repetido
        */
        System.out.println("Ingrese el tamaño del vector: ");
        int N = leer().nextInt();
        
        int pos = 0;
        int acumulador = 0;
        Random ran = new Random();
        int[] vector = new int[N];
       
        System.out.println("Ingrese el número que desea buscar: ");
        int num = leer().nextInt();
        
        for (int i = 0; i < N; i++){
            int aleatorios = ran.nextInt(11);
            vector[i] = aleatorios;
            
            if (vector[i]==num){
                pos = i;
                acumulador++;
            }        
        }
        switch (acumulador) {
            case 1:
                System.out.println("El número se ha encontrado 1 vez, en la posición: " + pos);
                break;
            case 0:
                System.out.println("El número no se ha encontrado.");
                break;
            default:
                System.out.println("El número se ha encontrado repetido " + acumulador + " veces, la última vez apareció en la posición: " + pos);
                break;       
        }
    };
    protected static void ejercicio17(){
        /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
        de 2 dígitos, etcétera (hasta 5 dígitos).
        */
        System.out.println("Ingrese el tamaño del vector: ");
        int N = leer().nextInt();
        
        int acumuladorU = 0;
        int acumuladorD = 0;
        int acumuladorC = 0;
        int acumuladorM = 0;
        int acumuladorMM = 0;
        int[] vector = new int[N];
       
        System.out.println("Ingrese los números : ");
        for (int i = 0; i < N; i++){
            vector[i] = leer().nextInt();
             //se podria hacer con mod quizas       
            if (vector[i] < 10 && vector[i] > -10){
                acumuladorU++;                
            }        
            if ((vector[i] >= 10 || vector[i] <= -10) && (vector[i] < 100 || vector[i] < -100)){
                acumuladorD++;                
            }
            if ((vector[i] >= 100 || vector[i] <= -100) && (vector[i] < 1000 || vector[i] < -1000)){
                acumuladorC++;                
            }
            if ((vector[i] >= 1000 || vector[i] <= -1000) && (vector[i] < 10000 || vector[i] < -10000)){
                acumuladorM++;                
            }
            if ((vector[i] >= 10000 || vector[i] <= -10000) && (vector[i] < 100000 || vector[i] < -100000)){
                acumuladorMM++;                
            }
        }
        System.out.println("Se ingresaron: ");
        System.out.println(acumuladorU + "numeros de 1 dígito.");
        System.out.println(acumuladorD + "numeros de 2 dígitos.");
        System.out.println(acumuladorC + "numeros de 3 dígitos.");
        System.out.println(acumuladorM + "numeros de 4 dígitos.");
        System.out.println(acumuladorMM + "numeros de 5 dígitos.");
    };
    protected static void ejercicio18(){
        /*Realizar un programa que rellene un matriz de 3 x 3 de valores aleatorios y muestre la
        traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
        cambiando sus filas por columnas (o viceversa).   
        MATRIZ A:       MATRIZ B:
        1 0 4           1 0 6
        0 5 0      ->   0 5 0
        6 0-9           4 0-9
        */
        int[][] matriz = new int[3][3];
        System.out.println("Ingresa los valores de la matriz");
        
        //relleno
        for (int i = 0; i < 3;i++){
            for (int j = 0; j < 3 ; j++){
                matriz[i][j] = leer().nextInt();
            }
        }    
        //muestro matriz rellena para controlar
        for (int i = 0; i < 3;i++){
            for (int j = 0; j < 3 ; j++){
                System.out.print("[" + matriz[i][j] + "]");
            }    
            System.out.println("");
        }
        System.out.println("");
        //invierto matriz intercambiando las variables de los for, al principio tenia matriz[i][j] y ahora lo cambio por  matriz[j][i]
         for (int i = 0; i < 3;i++){
            for (int j = 0; j < 3 ; j++){
                System.out.print("[" + matriz[j][i] + "]");
            }    
            System.out.println("");
        }
        
        
    };
    protected static void ejercicio19(){
        /*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
        matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
        signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
        denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
        MATRIZ:       MATRIZ TRANSPUESTA:
         0-2 4           0 2-4
         2 0 2      ->  -2 0-2
        -4-2 0           4 2 0
        En este caso la matriz es anti simétrica.
        */
        int[][] matriz = new int[3][3];
        System.out.println("Ingresa los valores de la matriz");
        
        //relleno
        for (int i = 0; i < 3;i++){
            for (int j = 0; j < 3 ; j++){
                matriz[i][j] = leer().nextInt();
            }
        }    
        //muestro matriz rellena para controlar
        System.out.println("La matriz ingresada es: ");
        for (int i = 0; i < 3;i++){
            for (int j = 0; j < 3 ; j++){
                
                System.out.print("[" + matriz[i][j] + "]");
            }    
            System.out.println("");
        }
        System.out.println("");
        //invierto matriz intercambiando las variables de los for, al principio tenia matriz[i][j] y ahora lo cambio por  matriz[j][i]
        System.out.println("La matriz transpuesta es: ");
        for (int i = 0; i < 3;i++){
            for (int j = 0; j < 3 ; j++){
                System.out.print("[" + matriz[j][i] + "]");
            }    
            System.out.println("");
        }
        System.out.println("");
        boolean antisimetrica = false;
        for (int i = 0; i < 3;i++){
            for (int j = 0; j < 3 ; j++){
                if (matriz[i][j] != (matriz[j][i])){
                    antisimetrica = true;
                }
            }
                
        }    
        System.out.println("");
        if (antisimetrica == true){
                    System.out.println("La matriz es antisimétrica");
                } else {
                    System.out.println("La matriz es simétrica");
                }
    };
    protected static void ejercicio20(){
        /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
        suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
        permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
        El programa deberá comprobar que los números introducidos son correctos, es decir,
        están entre el 1 y el 9.
        *VER IMAGEN DE EJEMPLO EN LA GUIA*
        */
        int[][] matriz = new int[3][3];
        int[] vecFilas = new int[3];
        int[] vecColumnas = new int[3];
        int [] diagonal = new int [2];
        
        System.out.println("Ingresa valores entre 1 y 9: ");
        
        //relleno
                            
        for (int i = 0; i < 3;i++){
            for (int j = 0; j < 3 ; j++){
             matriz[i][j] = leer().nextInt();
            }
        }
        //muestro matriz rellena para controlar
        System.out.println("La matriz ingresada es: ");
        for (int i = 0; i < 3;i++){
            for (int j = 0; j < 3 ; j++){
                
                System.out.print("[" + matriz[i][j] + "]");
            }    
            System.out.println("");
        }
        System.out.println("");
        
        //suma de filas e impresion de los resultados
        
        for (int i = 0; i < 3;i++){
            vecFilas[i] = 0;
            for (int j = 0; j < 3 ; j++){
                vecFilas[i] = vecFilas[i] + matriz[i][j];
            }    
            System.out.println("La fila " + (i + 1)+ " suma: " + vecFilas[i]);
        }
        System.out.println("");
        
        //suma de columnas e impresion de los resultados
        for (int i = 0; i < 3;i++){
            vecColumnas[i] = 0;
            for (int j = 0; j < 3 ; j++){
                vecColumnas[i] = vecColumnas[i] + matriz[j][i];
            }    
            System.out.println("La columna " + (i + 1)+ " suma: " + vecColumnas[i]);
        }
        System.out.println("");
        
        diagonal[0] = 0;
        diagonal[1] = 0;
        
        //suma de diagonal principal
        for (int i = 0; i < 3;i++){
            for (int j = 0; j < 3 ; j++){
                if (j == i){
                    diagonal[0] = diagonal[0] + matriz[i][j];
                }
            }    
           
        }
        System.out.println("La diagonal principal suma: " + diagonal[0]);
        System.out.println("");
        
        //suma de diagonal secundaria
        int aux = 3;
        for (int i = 0; i < 3;i++){
            aux = aux - 1;
            for (int j = 0; j < 3 ; j++){
                if (j == aux){
                    diagonal[1] = diagonal[1] + matriz[i][j];
                }
            }    
        }
        System.out.println("La diagonal secundaria suma: " + diagonal[1]);
        System.out.println("");
//bucle que compare las filas, columnas y diagonales entre si
        
        boolean esMagica = true;
        
        while (esMagica == true && aux < 2){
          for (int i = 0; i < 3;i++){
            aux = i;
                if ((vecColumnas[i] != vecFilas[i]) || (vecColumnas[i] != diagonal[0]) || (vecColumnas[i] != diagonal[1]) || (vecFilas[i] != diagonal[0]) || (vecFilas[i] != diagonal[1]) || (diagonal[0] != diagonal[1])){
                    esMagica = false;	
                }
            }
        }     
        //condicional para saber si es magica o no basandose en la comparacion anterior
        if (esMagica == false){
            System.out.println("La matriz no es mágica.");
        } else {
            System.out.println("La matriz es mágica.");
        }
         
    };
    protected static void ejercicio21(){
        /*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
        3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
        dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
        se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
        que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
        la matriz M en la cual empieza el primer elemento de la submatriz P.
        *VER IMAGEN DE EJEMPLO EN LA GUIA*
        Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices:
        4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
        */
        int[][] M = new int [10][10];
        int[][] P = new int [3][3];
        Random ran = new Random();
      
        //relleno la matriz M con aleatorios
//        for (int i = 0; i < 10; i++){
//            for (int j = 0; j < 10; j++){
//                int aleatorios = ran.nextInt(101);
//                M[i][j] = aleatorios;
//            }      
//        }
        M[0][0] = 1;
        M[0][1] = 26;
        M[0][2] = 36;
        M[0][3] = 47;
        M[0][4] = 5;
        M[0][5] = 6;
        M[0][6] = 72;
        M[0][7] = 81;
        M[0][8] = 95;
        M[0][9] = 10;
        M[1][0] = 11;
        M[1][1] = 12;
        M[1][2] = 13;
        M[1][3] = 21;
        M[1][4] = 41;
        M[1][5] = 22;
        M[1][6] = 67;
        M[1][7] = 20;
        M[1][8] = 10;
        M[1][9] = 61;
        M[2][0] = 56;
        M[2][1] = 78;
        M[2][2] = 87;
        M[2][3] = 90;
        M[2][4] = 9;
        M[2][5] = 90;
        M[2][6] = 17;
        M[2][7] = 12;
        M[2][8] = 87;
        M[2][9] = 67;
        M[3][0] = 41;
        M[3][1] = 87;
        M[3][2] = 24;
        M[3][3] = 56;
        M[3][4] = 97;
        M[3][5] = 74;
        M[3][6] = 87;
        M[3][7] = 42;
        M[3][8] = 64;
        M[3][9] = 35;
        M[4][0] = 32;
        M[4][1] = 76;
        M[4][2] = 79;
        M[4][3] = 1;
        M[4][4] = 36;
        M[4][5] = 5;
        M[4][6] = 67;
        M[4][7] = 96;
        M[4][8] = 12;
        M[4][9] = 11;
        M[5][0] = 99;
        M[5][1] = 13;
        M[5][2] = 54;
        M[5][3] = 88;
        M[5][4] = 89;
        M[5][5] = 90;
        M[5][6] = 75;
        M[5][7] = 12;
        M[5][8] = 41;
        M[5][9] = 76;
        M[6][0] = 67;
        M[6][1] = 78;
        M[6][2] = 87;
        M[6][3] = 45;
        M[6][4] = 14;
        M[6][5] = 22;
        M[6][6] = 26;
        M[6][7] = 42;
        M[6][8] = 56;
        M[6][9] = 78;
        M[7][0] = 98;
        M[7][1] = 45;
        M[7][2] = 34;
        M[7][3] = 23;
        M[7][4] = 32;
        M[7][5] = 56;
        M[7][6] = 74;
        M[7][7] = 16;
        M[7][8] = 19;
        M[7][9] = 18;
        M[8][0] = 24;
        M[8][1] = 67;
        M[8][2] = 97;
        M[8][3] = 46;
        M[8][4] = 87;
        M[8][5] = 13;
        M[8][6] = 67;
        M[8][7] = 89;
        M[8][8] = 93;
        M[8][9] = 24;
        M[9][0] = 21;
        M[9][1] = 68;
        M[9][2] = 78;
        M[9][3] = 98;
        M[9][4] = 90;
        M[9][5] = 67;
        M[9][6] = 12;
        M[9][7] = 41;
        M[9][8] = 65;
        M[9][9] = 12;
        
        P[0][0] = 36;
        P[0][1] = 5;
        P[0][2] = 67;
        P[1][0] = 89;
        P[1][1] = 90;
        P[1][2] = 75;
        P[2][0] = 14;
        P[2][1] = 22;
        P[2][2] = 26;
    
        //la muestro
        System.out.println("La matriz M aleatoria es: ");
        for (int i = 0; i < 10;i++){
            for (int j = 0; j < 10 ; j++){
                System.out.print("[" + M[j][i] + "]");
            }    
            System.out.println("");
        }
        System.out.println("");
        //relleno la matriz P
//        for (int i = 0; i < 3; i++){
//            for (int j = 0; j < 3; j++){
//                int aleatorios = ran.nextInt(101);
//                P[i][j] = aleatorios;
//            }      
//        }
        //la muestro
        System.out.println("La matriz P aleatoria es: ");
        for (int i = 0; i < 3;i++){
            for (int j = 0; j < 3 ; j++){
                System.out.print("[" + P[i][j] + "]");
            }    
            System.out.println("");
        }
        System.out.println("");
        
        //recorrido de matriz P en matriz M
        
        int tamM = 10;
        for (int i = 0; i < tamM - 3; i++){
            for (int j = 0; j < tamM - 3; j++){
                boolean iguales = true;
                for (int x = i; x < i+2; x++){
                    for (int z = j; z < j+2; z++){ 
                        if (!(M[x][z] == P[x-i][z-j])){
                            iguales = false;
                            break;
                        }
                    }
                    if (iguales == false){
                        break;
                    }
                }  
                if (iguales == true){
                    System.out.println("[" + i + "], [" + j + "]");    
                }
            }      
        }
//                    
    };
    
    
    public static Scanner leer(){
        Scanner leer = new Scanner(System.in);
        return leer;
    }

    private static String Substring(String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
