package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;

public class Main {
    public static void main(String[] args) {

        Raton ratonLenovo = new Raton("Bluetooth","Lenovo");

        System.out.println("\n" +ratonLenovo);

        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");

        System.out.println("\n" +tecladoLenovo);

        Monitor monitoLenovo = new Monitor("Lenovo", 27.0);

        System.out.println("\n" + monitoLenovo);

        Computadora computadora = new Computadora( "Lenovo", monitoLenovo,ratonLenovo,tecladoLenovo);

        System.out.println("\n" +computadora.toString());
    }
}