package rec1adopcionperro;

import Entidades.Perro;
import Entidades.Persona;

public class ReC1AdopcionPerro {

    public static void main(String[] args) {
        Perro m1 = new Perro("Aneu", "Salchicha", 1, "Pequeño");
        Perro m2 = new Perro("Homero", "Golden", 8, "Mediano");
        Persona p1 = new Persona("Martin", "Piñeiro", 30, 37121231, m1);
        Persona p2 = new Persona("Luciana", "Urristi", 29, 38400854, m2);
        p1.mostrar();
        p2.mostrar();
    }
}
