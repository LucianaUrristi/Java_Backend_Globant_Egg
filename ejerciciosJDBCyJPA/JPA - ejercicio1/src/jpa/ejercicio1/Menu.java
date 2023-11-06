package jpa.ejercicio1;

/**
 *
 * @author lu_co
 */
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.AutorService;
import libreria.servicios.EditorialService;
import libreria.servicios.LibroService;


public class Menu {
    
    private final LibroService ls = new LibroService();
    private final AutorService as = new AutorService();
    private final EditorialService es = new EditorialService();
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
                    modificar();
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
                    System.out.print("TITULO: ");
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

                    ls.crearLibro(isbn, titulo, anio, ejemplares, ejemplaresR, ejemplaresR, Boolean.FALSE, autor, editorial);
                    System.out.println("LIBRO GUARDADO");

                } catch (Exception e) {
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
                    System.out.println("Error del sistema por \n" + e.getMessage());
                }

                break;
            case 4:
                break;
            default:
                System.out.println("OPCIÓN INVÁLIDA");
        }
    }

    private void modificar() {
        
        System.out.println("/// EDITAR DATOS ///");
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
                    libros.forEach((l) -> {
                        System.out.println("- " + l);
            });
                    
                    ls.modificarLibro();
                } catch (Exception e) {
                    System.out.println("Error del sistema por \n" + e.getMessage());
                }
                break;
            case 2:
                try {
                    System.out.println("--- LISTA DE AUTORES ---");
                    List<Autor> autores = as.listarAutores();
                    autores.forEach((a) -> {
                        System.out.println("- " + a);
            });
                    as.modificarAutor();
                    
                } catch (Exception e) {
                    System.out.println("Error del sistema por \n" + e.getMessage());
                }
                break;
            case 3:
                try {
                    System.out.println("--- LISTA DE EDITORIALES ---");
                    List<Editorial> editoriales = es.listarEditorial();
                    editoriales.forEach((e) -> {
                        System.out.println("- " + e);
            });
                    es.modificarEditorial();
                    
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
                    List<Libro> libros = ls.listarTodos(); //no tengo esto
                    libros.forEach((l) -> {
                        System.out.println("- " + l);
            });
                    System.out.print("INGRESE ID DEL LIBRO: ");
                    if (ls.eliminarLibro(leer.nextInt())) {
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
                    autores.forEach((a) -> {
                        System.out.println("- " + a);
            });
                    System.out.print("INGRESE ID DEL AUTOR: ");
                    if (as.eliminarAutor(leer.nextInt())) {
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
                    editoriales.forEach((e) -> {
                        System.out.println("- " + e);
            });
                    System.out.print("INGRESE ID DE LA EDITORIAL: ");
                    if (es.eliminarEditorial(leer.nextInt())) {
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
                    libros.forEach((l) -> {
                        System.out.println("- " + l);
            });
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
                    autores.forEach((a) -> {
                        System.out.println("- " + a);
            });
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
                    editoriales.forEach((e) -> {
                        System.out.println("- " + e);
            });
                    System.out.print("INGRESE NOMBRE DE LA EDITORIAL: ");
                    Editorial editorial = es.buscarEditorialPorNombre(leer.next());
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
                    Libro libro = ls.buscarLibroPorISBN(leer.nextLong());
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
                    Libro libro = ls.buscarLibroPorTitulo(leer.next());
                    if (libro != null) {
                        System.out.println("- " + libro);
                    } else {
                        System.out.println("LIBRO NO ENCONTRADO");
                    }
                } catch (Exception e) {
                    System.out.println("Error del sistema por \n" + e.getMessage());
                }
                break;
            case 3:
                try {
                    System.out.print("INGRESE AUTOR: ");
                    
                    
                    Libro libros = ls.buscarLibroPorAutor(as.buscarPorNombre(leer.next()));
                    if (libros != null) {

                        System.out.println("- " + 1);

                    } else {
                        System.out.println("NO SE ENCONTRARON LIBROS");
                    }
                } catch (Exception e) {
                    System.out.println("Error del sistema por \n" + e.getMessage());
                }
                break;
            case 4:
                try {
                    System.out.print("INGRESE EDITORIAL: ");
                    Libro libros = ls.buscarPorEditorial(es.buscarEditorialPorNombre(leer.next()));
                    if (libros != null) {
                        
                            System.out.println("- " + 1);
                        
                    } else {
                        System.out.println("NO SE ENCONTRARON LIBROS");
                    }
                } catch (Exception e) {
                    System.out.println("Error del sistema por \n" + e.getMessage());
                }
                break;
            case 5:
                break;
            default:
                System.out.println("OPCIÓN INVÁLIDA");
        }
    }
}    
