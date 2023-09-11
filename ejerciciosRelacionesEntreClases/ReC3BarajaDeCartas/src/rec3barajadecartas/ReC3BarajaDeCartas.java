/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rec3barajadecartas;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author lu_co
 */
public class ReC3BarajaDeCartas {

    /**
     * @param args the command line arguments Realizar una baraja de cartas
     * españolas orientada a objetos. Una carta tiene un número entre 1 y 12 (el
     * 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas).
     * Esta clase debe contener un método toString() que retorne el número de
     * carta y el palo. La baraja estará compuesta por un conjunto de cartas, 40
     * exactamente. Las operaciones que podrá realizar la baraja son: •
     * barajar(): cambia de posición todas las cartas aleatoriamente. •
     * siguienteCarta(): devuelve la siguiente carta que está en la baraja,
     * cuando no haya más o se haya llegado al final, se indica al usuario que
     * no hay más cartas. • cartasDisponibles(): indica el número de cartas que
     * aún se puede repartir. • darCartas(): dado un número de cartas que nos
     * pidan, le devolveremos ese número de cartas. En caso de que haya menos
     * cartas que las pedidas, no devolveremos nada, pero debemos indicárselo al
     * usuario. • cartasMonton(): mostramos aquellas cartas que ya han salido,
     * si no ha salido ninguna indicárselo al usuario • mostrarBaraja(): muestra
     * todas las cartas hasta el final. Es decir, si se saca una carta y luego
     * se llama al método, este no mostrara esa primera carta.
     */
    private static final Baraja baraja = new Baraja();
    public static void main(String[] args) {
        
        System.out.println("Elija la opcion deseada:");
        System.out.println("1. Barajar cartas");
        System.out.println("2. Siguiente carta");
        System.out.println("3. Ver cartas disponibles");
        System.out.println("4. Ver cartas que ya han salido");
        System.out.println("5. Dar cartas");
        System.out.println("6. Mostrar baraja");
        System.out.println("7. Salir");
        
        
        menu();
    }
    
    public static void menu() {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
        int opcion = leer.nextInt();
       
        switch (opcion) {
            case 1:
                
                baraja.barajar();
                menu();
                break;
            case 2:                
                System.out.println(baraja.siguienteCarta());       
                menu();
                break;
            case 3:
                System.out.println(baraja.cartasDisponibles());
                menu();
                break;
            case 4:
                baraja.cartasMonton();
                menu();
                break;
            case 5:
                System.out.println("Cuantas cartas desea?");
                int cantCartas = leer.nextInt();
                System.out.println(baraja.darCartas(cantCartas));
                menu();
                break;
            case 6:
                baraja.mostrarBaraja();
                menu();
                break;
            case 7:
                break;
        }
                
        
    }

}
