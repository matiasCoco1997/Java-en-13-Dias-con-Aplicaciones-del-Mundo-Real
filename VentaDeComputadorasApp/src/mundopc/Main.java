package mundopc;

import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;

public class Main {
    public static void main(String[] args) {

        Raton ratonLenovo = new Raton("Bluetooth","Lenovo");

        System.out.println(ratonLenovo);

        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");

        System.out.println(tecladoLenovo);

        Monitor monitoLenovo = new Monitor("Lenovo", 27.0);

        System.out.println(monitoLenovo);
    }
}