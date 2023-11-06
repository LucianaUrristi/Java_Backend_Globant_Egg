package jpa_act1;

import java.util.List;
import java.util.Scanner;
import jpa_act1.entidades.Autor;
import jpa_act1.entidades.Editorial;
import jpa_act1.entidades.Libro;
import jpa_act1.servicios.AutorServicio;
import jpa_act1.servicios.EditorialServicio;
import jpa_act1.servicios.LibroServicio;


public class Menu {
    
    private final LibroServicio ls = new LibroServicio();
    private final AutorServicio as = new AutorServicio();
    private final EditorialServicio es = new EditorialServicio();
    private final Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private int opc = -1;
    
    public void ejecucion() {
        
        do {
            System.out.println("/// LIBRERIA ///");
            System.out.println("1. CARGAR");
            System.out.println("2. EDITAR");
            System.out.println("3. ELIMINAR");
            System.out.println("4. BUSCAR");
            System.out.println("0. SALIR");
            
            opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    cargar();
                    break;
                case 2:
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    buscar();
                    break;
                case 0:
                    System.out.println("SALIENDO");
                    break;
                default:
                    System.out.println("OPCIÓN INVÁLIDA");
            }
            
            
        } while (opc != 0);

    }
    
    private void cargar() {
        
        System.out.println("/// CARGA DE DATOS ///");
        System.out.println("1. LIBRO");
        System.out.println("2. AUTOR");
        System.out.println("3. EDITORIAL");
        System.out.println("4. VOLVER");

        opc = leer.nextInt();
        
        switch (opc) {
            case 1:
                try {
                    System.out.println("/// INGRESO LIBRO ///");
                    System.out.print("ISBN: ");
                    Long isbn = leer.nextLong();
                    System.out.print("TIULO: ");
                    String titulo = leer.next();
                    System.out.print("AÑO: ");
                    Integer anio = leer.nextInt();
                    System.out.print("EJEMPLARES: ");
                    Integer ejemplares = leer.nextInt();
                    System.out.print("EJEMPLARES PRESTADOS: ");
                    Integer ejemplaresP = leer.nextInt();
                    System.out.print("EJEMPLARES RESTANTES: ");
                    Integer ejemplaresR = leer.nextInt();

                    System.out.println("AUTOR: ");
                    Autor autor = as.buscarPorNombre(leer.next());

                    if (autor == null) {
                        System.out.println("AUTOR NO ENCONTRADO, DESEA CREARLO? (Y/N)");
                        if (leer.next().equalsIgnoreCase("y")) {
                            System.out.println("/// INGRESO AUTOR ///");
                            System.out.print("INGRESE NOMBRE: ");
                            String nombre = leer.next();
                            autor = as.crearAutor(nombre);
                            System.out.println("AUTOR GUARDADO");
                        } else {
                            break;
                        }
                    }

                    System.out.println("EDITORIAL: ");
                    Editorial editorial = es.crearEditorial(leer.next());

                    if (editorial == null) {
                        System.out.println("EDITORIAL NO ENCONTRADA, DESEA CREARLA? (Y/N)");
                        if (leer.next().equalsIgnoreCase("y")) {
                            System.out.println("/// INGRESO EDITORIAL ///");
                            System.out.print("INGRESE NOMBRE: ");
                            String nombre = leer.next();
                            editorial = es.crearEditorial(nombre);
                            System.out.println("EDITORIAL GUARDADA");
                        } else {
                            break;
                        }
                    }

                    ls.crearLibro(isbn, titulo, anio, ejemplares, ejemplaresP, ejemplaresR, autor, editorial);
                    System.out.println("LIBRO GUARDADO");

                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Error del sistema por \n" + e.getMessage());
                }

                break;
                
            case 2:
                try {
                    System.out.println("/// INGRESO AUTOR ///");
                System.out.print("INGRESE NOMBRE: ");
                String nombre = leer.next();
                as.crearAutor(nombre);
                System.out.println("AUTOR GUARDADO");
                } catch (Exception e) {
                    e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                }
                
                break;
                
            case 3:
                try {
                    System.out.println("/// INGRESO EDITORIAL ///");
                    System.out.print("INGRESE NOMBRE: ");
                    String nombre = leer.next();
                    es.crearEditorial(nombre);
                    System.out.println("EDITORIAL GUARDADA");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Error del sistema por \n" + e.getMessage());
                }

                break;
            case 4:
                break;
            default:
                System.out.println("OPCIÓN INVÁLIDA");
        }
    }

    private void eliminar() {
        
        System.out.println("/// ELIMINAR DATOS ///");
        System.out.println("1. LIBRO");
        System.out.println("2. AUTOR");
        System.out.println("3. EDITORIAL");
        System.out.println("4. VOLVER");

        opc = leer.nextInt();
        
        switch (opc) {
            case 1:
                try {
                    System.out.println("--- LISTA DE LIBROS ---");
                    List<Libro> libros = ls.listarTodos();
                    for (Libro l : libros) {
                        System.out.println("- " + l);
                    }
                    System.out.print("INGRESE ISBN DEL LIBRO: ");
                    if (ls.eliminarLibro(leer.nextLong())) {
                        System.out.println("LIBRO ELIMINADO");
                    } else {
                        System.out.println("LIBRO NO ENCONTRADO");
                    }
                } catch (Exception e) {
                    System.out.println("Error del sistema por \n" + e.getMessage());
                }
                break;
            case 2:
                try {
                    System.out.println("--- LISTA DE AUTORES ---");
                    List<Autor> autores = as.listarAutores();
                    for (Autor a : autores) {
                        System.out.println("- " + a);
                    }
                    System.out.print("INGRESE ID DEL AUTOR: ");
                    if (as.eliminarPorId(leer.nextInt())) {
                        System.out.println("AUTOR ELIMINADO");
                    } else {
                        System.out.println("AUTOR NO ENCONTRADO");
                    }
                } catch (Exception e) {
                    System.out.println("Error del sistema por \n" + e.getMessage());
                }
                break;
            case 3:
                try {
                    System.out.println("--- LISTA DE EDITORIALES ---");
                    List<Editorial> editoriales = es.listarEditorial();
                    for (Editorial e : editoriales) {
                        System.out.println("- " + e);
                    }
                    System.out.print("INGRESE ID DE LA EDITORIAL: ");
                    if (es.eliminarPorId(leer.nextInt())) {
                        System.out.println("EDITORIAL ELIMINADA");
                    } else {
                        System.out.println("EDITORIAL NO ENCONTRADA");
                    }
                } catch (Exception e) {
                    System.out.println("Error del sistema por \n" + e.getMessage());
                }
                break;
            case 4:
                break;
            default:
                System.out.println("OPCIÓN INVÁLIDA");
        }
        
    }
    
    private void buscar() {
         
        System.out.println("/// BUSCAR DATOS ///");
        System.out.println("1. LIBRO");
        System.out.println("2. AUTOR");
        System.out.println("3. EDITORIAL");
        System.out.println("4. VOLVER");

        opc = leer.nextInt();
        
        switch (opc) {
            case 1:
                try {
                    System.out.println("--- LISTA DE LIBROS ---");
                    List<Libro> libros = ls.listarTodos();
                    for (Libro l : libros) {
                        System.out.println("- " + l);
                    }
                    System.out.println("");
                    System.out.println("1. BUSCAR POR ISBN");
                    System.out.println("2. BUSCAR POR TÍTULO");
                    System.out.println("3. BUSCAR POR AUTOR");
                    System.out.println("4. BUSCAR POR EDITORIAL");
                    System.out.println("5. VOLVER");
                    
                    opc = leer.nextInt();
                    buscarLibros(opc);
                    
                } catch (Exception e) {
                    System.out.println("Error del sistema por \n" + e.getMessage());
                }
                break;
            case 2:
                try {
                    System.out.println("--- LISTA DE AUTORES ---");
                    List<Autor> autores = as.listarAutores();
                    for (Autor a : autores) {
                        System.out.println("- " + a);
                    }
                    System.out.print("INGRESE NOMBRE DEL AUTOR: ");
                    Autor autor = as.buscarPorNombre(leer.next());
                    if (autor != null) {
                        System.out.println("- " + autor);
                    } else {
                        System.out.println("AUTOR NO ENCONTRADO");
                    }
                } catch (Exception e) {
                    System.out.println("Error del sistema por \n" + e.getMessage());
                }
                break;
            case 3:
                try {
                    System.out.println("--- LISTA DE EDITORIALES ---");
                    List<Editorial> editoriales = es.listarEditorial();
                    for (Editorial e : editoriales) {
                        System.out.println("- " + e);
                    }
                    System.out.print("INGRESE NOMBRE DE LA EDITORIAL: ");
                    Editorial editorial = es.buscarPorNombre(leer.next());
                    if (editorial != null) {
                        System.out.println("- " + editorial);
                    } else {
                        System.out.println("EDITORIAL NO ENCONTRADA");
                    }
                } catch (Exception e) {
                    System.out.println("Error del sistema por \n" + e.getMessage());
                }
                break;
            case 4:
                break;
            default:
                System.out.println("OPCIÓN INVÁLIDA");
        }
    }
    
    private void buscarLibros(int opc) {
        switch (opc) {
            case 1:
                try {
                    System.out.print("INGRESE ISBN: ");
                    Libro libro = ls.buscarPorIsbn(leer.nextLong());
                    if (libro != null) {
                        System.out.println("- " + libro);
                    } else {
                        System.out.println("LIBRO NO ENCONTRADO");
                    }
                } catch (Exception e) {
                    System.out.println("Error del sistema por \n" + e.getMessage());
                } 
                break;
            case 2:
                try {
                    System.out.print("INGRESE TITULO: ");
                    Libro libro = ls.buscarPorTitulo(leer.next());
                    if (libro != null) {
                        System.out.println("- " + libro);
                    } else {
                        System.out.println("LIBRO NO ENCONTRADO");
                    }
                } catch (Exception e) {
                    System.out.println("Error del sistema por \n" + e.getMessage());
                }
            case 3:
                try {
                    System.out.print("INGRESE AUTOR: ");
                    List<Libro> libros = ls.buscarPorAutor(leer.next());
                    if (!libros.isEmpty()) {
                        for (Libro l : libros) {
                            System.out.println("- " + l);
                        }
                    } else {
                        System.out.println("NO SE ENCONTRARON LIBROS");
                    }
                } catch (Exception e) {
                    System.out.println("Error del sistema por \n" + e.getMessage());
                }
            case 4:
                try {
                    System.out.print("INGRESE EDITORIAL: ");
                    List<Libro> libros = ls.buscarPorEditorial(leer.next());
                    if (!libros.isEmpty()) {
                        for (Libro l : libros) {
                            System.out.println("- " + l);
                        }
                    } else {
                        System.out.println("NO SE ENCONTRARON LIBROS");
                    }
                } catch (Exception e) {
                    System.out.println("Error del sistema por \n" + e.getMessage());
                }
            case 5:
                break;
            default:
                System.out.println("OPCIÓN INVÁLIDA");
        }
    }
    
}
