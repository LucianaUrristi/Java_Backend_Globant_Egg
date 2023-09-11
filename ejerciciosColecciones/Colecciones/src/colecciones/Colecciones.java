/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author lu_co
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* ArrayList<Integer> listado = new ArrayList(); 
        TreeSet<String> trees = new TreeSet(); 
        HashMap<Integer, String> personas = new HashMap<>();
         */
        /*ArrayList<Integer> numerosA = new ArrayList();
        int x = 20;
        numerosA.add(x);
        numerosA.add(23);
        numerosA.add(34);
        numerosA.add(2);
        numerosA.add(5);
        numerosA.add(6);

        numerosA.remove(3);
        //numerosA.remove(x);//no funciona remover un objeto especifico

        HashSet<Integer> numerosB = new HashSet();
        Integer y = 21;
        numerosB.add(y);
        numerosB.add(6);
        numerosB.add(54);
        numerosB.add(3);
        numerosB.add(5);
        numerosB.add(7);

        numerosB.remove(3);

        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 34576189;
        String nombreAlumno = "Pepe";
        alumnos.put(dni, nombreAlumno);
        alumnos.put(31213214, "Juan");
        alumnos.put(12312354, "Lorenzo");
        alumnos.put(12324353, "Paula");
        alumnos.put(23452324, "Francisco");
        alumnos.put(23465432, "Martin");

        alumnos.remove(dni, nombreAlumno);
        for (Integer listaA : numerosA) {
            System.out.println(listaA);
        }
        numerosB.forEach((listaB) -> {
            System.out.println(listaB);
        });
        for (Map.Entry<Integer, String> listaAlumnos : alumnos.entrySet()) {
            System.out.println("Documento = " + listaAlumnos.getKey()
                    + ", Nombre = " + listaAlumnos.getValue());
        }
        */
       /* EJEMPLOS 
        ArrayList<String> list = new ArrayList();
        list.add("A");
        list.add("B");
        
        //creamos el iterator para recorrer la lista
        Iterator iterator = list.iterator(); // Devolvemos el iterator
        System.out.println("Elementos de la lista: ");
        
        //armamos un while, siempre que el hasnext() devuelva true
        while (iterator.hasNext()){ //Mostramos los elementos con el iterator.next()
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
       ----------------------------------------------------------------------------------------
        ELIMINAR ELEMENTOS
        LISTAS
        ArrayList<String> palabras = new ArrayList();
        Iterator <String> it = palabras.iterator();
        while (it.hasNext()){
            if (it.next().equals("Hola")){ // Borramos si está la palabra "HOLA"
                it.remove();
            }
        }
       
        CONJUNTOS
        Hashset<Integer> numerosSet = new HashSet<>();
        Iterator<Integer> it2 = numerosSet.iterator();
        while (it2.hasNext()){
            if (it2.next() == 3){
                it2.remove();
            }
        }
        ----------------------------------------------------------------------------------
        
        //DETECCION DE ERRORES
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while(it.hasNext()){
            if (it.next().equals("café")){
                it.remove();
            }
        }
        -----------------------------------------------------------------------------------------------------------
        ORDENAR CONJUNTOS
        Para ordenar colecciones se usa Collections.sort() recibe la 
        coleccion y la ordena de manera ascendente
        Los conjuntos y los mapas no pueden usar .sort()
        Los conjuntos se deben convertir en listas para poder ordenarlos
        Para ordenar los mapas, se va a compertir el HashMap en un 
        TreeMap ya que al igual que los TreeSet
        se ordenan por si mismos.
        
        EJEMPLO
        ArrayList<Integer> numeros = new ArrayList();
        Collections.sort(numeros);
        
        CONJUNTOS
        HashSet<Integer> numerosSet = new HashSet();
            Se convierte el hash a lista
        ArrayList<Integer> numerosLista = new ArrayList(numerosSet);
        Collections.sort(numerosLista);
        
        MAPAS
        HashMap<Integer, String> alumnos = new HashMap();
            Se convierte el HashMap a TreeMap
        TreeMap<Integer, String> alumnosTree = new TreeMap();
        -----------------------------------------------------
        DESORDENAR CONJUNTOS
        Collections.shuffle(coleccion que quiero desordenar);
        
      --------------------------------------------------------------------
       COMPARATOR
       LISTAS
       ArrayList<Libro> libros = new ArrayList();
       Libro libros = new Libro();
       libros.add(libro);
       
       CONJUNTOS
       HashSet<Perro> perros = new HashSet();
       Perro perro = new Perro();
       perros.add(perro);
       
       MAPAS
       HashMap<Integer, Alumno> alumnos = new HashMap();
       int dni = 38400854;
       Alumnos alumnos = new Alumno("Pepe", "honguito");
       alumnos.put(dni, alumno);
       ---------------------------------------------------
       Para mostrar los conjuntos debemos pasarlo a .toString()
       En la clase, click derecho+insertar codigo+toString y automaticamente se inserta el codigo de abajo
       @Override
       public String toString(){
            return "Libro{" + "titulo= " + titulo + "}";
        }
        ---------------------------------------------------------------------------------
       //EJERCICIO LISTA LIBROS: ¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.
       
       ArrayList<String> book = new ArrayList();
       book.add("Lord of the Rings");
       book.add("Harry Potter 1");
       book.add("Harry Potter 2");
       book.add("Harry Potter 3");
       book.add("Harry Potter 4");
       book.add("Harry Potter 5");
       book.add("Harry Potter 6");
       book.add("Harry Potter 7");
       
       for(String books: book){
           System.out.println(books);
       }
       ---------------------------------------------------------
        COMPARATOR
        public static Comparator<Perro> compararEdad = new Comparator<Perro>(){
            @Override (Cuando desde una subclase queremos utilizar un metodo de otra clase// ctrl + space lo autogenera)
            public int compare(Perro p1, Perro p2){
            return p2.getEdad().compareTo(p1.getEdad());
            }
        }
        Como el comparator se va a usar para ordenar nuestras colecciones, 
        se va a poner en el llamado de la función Collections.sort() y se 
        va a poner en la inicialización de cualquier tipo de Tree.
        
        EJEMPLO LISTAS
        ArrayList<Perro> perros = new ArrayList();
            Se llama al metodo estatico a traves de la clase y se pone la lista a ordenar
        perro.sort(Perro.compararEdad);
        
        CONJUNTOS
        HashSet<Perro> perroSet = new HashSet<>();
        ArrayList<Perro> perrosLista = new ArrayList(perrosSet);
        perrosLista.sort(Perro.compararEdad);
        -----------------------------------------------
        TREESET
        En los TreeSet necesitamos crearlos con el comparator porque como el TreeSet se ordena
        solo, necesitamos decirle al TreeSet, bajo que atributo se va a ordenar, por eso le 
        pasamos el comparator en el constructor.
        
        TreeSet<Perro> perrosConjunto = new TreeSet(Perro.compararEdad);
        Perro perro = new Perro();
        perros.add(perro);
        
        MAPAS
        HashMap<Integer, Alumno> map = new HashMap();
            Se usa una funcion de los mapas para traer todos valores
        ArrayList<Alumno> nombres = new ArrayList(map.values());
        nobres.sort(Alumno.compararDni);
        
        
        
       */
       
    }
}
