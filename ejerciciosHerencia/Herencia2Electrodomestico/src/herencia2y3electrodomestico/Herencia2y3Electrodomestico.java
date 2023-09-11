/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2y3electrodomestico;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author lu_co
 */
public class Herencia2y3Electrodomestico {

    /**
     * Crear una superclase llamada Electrodoméstico con los siguientes
     * atributos: precio, color, consumo energético (letras entre A y F) y peso.
     * Los constructores que se deben implementar son los siguientes: • Un
     * constructor vacío. • Un constructor con todos los atributos pasados por
     * parámetro. Los métodos a implementar son: • Métodos getters y setters de
     * todos los atributos. • Método comprobarConsumoEnergetico(char letra):
     * comprueba que la letra es correcta, sino es correcta usara la letra F por
     * defecto. Este método se debe invocar al crear el objeto y no será
     * visible. • Método comprobarColor(String color): comprueba que el color es
     * correcto, y si no lo es, usa el color blanco por defecto. Los colores
     * disponibles para los electrodomésticos son blanco, negro, rojo, azul y
     * gris. No importa si el nombre está en mayúsculas o en minúsculas. Este
     * método se invocará al crear el objeto y no será visible. Metodo
     * crearElectrodomestico(): le pide la información al usuario y llena el
     * electrodoméstico, también llama los métodos para comprobar el color y el
     * consumo. Al precio se le da un valor base de $1000. • Método
     * precioFinal(): según el consumo energético y su tamaño, aumentará el
     * valor del precio. Esta es la lista de precios: A continuación, se debe
     * crear una subclase llamada Lavadora, con el atributo carga, además de los
     * atributos heredados. Los constructores que se implementarán serán: • Un
     * constructor vacío. • Un constructor con la carga y el resto de los
     * atributos heredados. Recuerda que debes llamar al constructor de la clase
     * padre. Los métodos que se implementara serán: • Método get y set del
     * atributo carga. • Método crearLavadora (): este método llama a
     * crearElectrodomestico() de la clase padre, lo utilizamos para llenar los
     * atributos heredados del padre y después llenamos el atributo propio de la
     * lavadora. • Método precioFinal(): este método será heredado y se le
     * sumará la siguiente funcionalidad. Si tiene una carga mayor de 30 kg,
     * aumentará el precio en $500, si la carga es menor o igual, no se
     * incrementará el precio. Este método debe llamar al método padre y añadir
     * el código necesario. Recuerda que las condiciones que hemos visto en la
     * clase Electrodoméstico también deben afectar al precio. Se debe crear
     * también una subclase llamada Televisor con los siguientes atributos:
     * resolución (en pulgadas) y sintonizador TDT (booleano), además de los
     * atributos heredados. Los constructores que se implementarán serán: • Un
     * constructor vacío. • Un constructor con la resolución, sintonizador TDT y
     * el resto de los atributos heredados. Recuerda que debes llamar al
     * constructor de la clase padre. Los métodos que se implementara serán: •
     * Método get y set de los atributos resolución y sintonizador TDT. • Método
     * crearTelevisor(): este método llama a crearElectrodomestico() de la clase
     * padre, lo utilizamos para llenar los atributos heredados del padre y
     * después llenamos los atributos del televisor. • Método precioFinal():
     * este método será heredado y se le sumará la siguiente funcionalidad. Si
     * el televisor tiene una resolución mayor de 40 pulgadas, se incrementará
     * el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
     * $500. Recuerda que las condiciones que hemos visto en la clase
     * Electrodomestico también deben afectar al precio. Finalmente, en el main
     * debemos realizar lo siguiente: Vamos a crear una Lavadora y un Televisor
     * y llamar a los métodos necesarios para mostrar el precio final de los dos
     * electrodomésticos.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lavadora lavadora1 = new Lavadora();
        
        Televisor televisor1 = new Televisor();
        
        lavadora1.crearLavadora();
        System.out.println(lavadora1.precioFinal());
       
        televisor1.crearTelevisor();
        System.out.println(televisor1.precioFinal());
        
        /*
        Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
        para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
        Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
        deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
        televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
        precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
        2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
        electrodomésticos, 2000 para lavadora y 5000 para televisor.
         */
        
        //Creacion de ArrayList
        ArrayList<Electrodomestico> electroList = new ArrayList();
        
        //Creacion y guardado de 4 electrodomesticos en la list.
        Lavadora lavadora2 = new Lavadora(20, 2000.0, "Azul", 'A', 60.0);
        Lavadora lavadora3 = new Lavadora(45, 1500.0, "Negro", 'B', 25.0);
        Televisor televisor2 = new Televisor(40, false, 3000.0, "Rojo", 'C', 50.0 );
        Televisor televisor3 = new Televisor(65, true, 2500.0, "Blanco", 'D', 80.0);
        electroList.add(lavadora2);
        electroList.add(lavadora3);
        electroList.add(televisor2);
        electroList.add(televisor3);
        
        //recorrido del array, impresion del precio final de cada objeto y suma de precios           
        Double sumaPreciosFinales = 0.0;
        for (Electrodomestico electro : electroList) {
            
            System.out.println(electro.toString());
            System.out.println(electro.precioFinal());

            sumaPreciosFinales = sumaPreciosFinales + electro.precioFinal();

        }
        System.out.println("La suma de los precios de todos los electrodomesticos es: " + sumaPreciosFinales);

    }
    
}
