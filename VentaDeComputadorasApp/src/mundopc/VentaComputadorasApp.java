package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {

        Raton ratonLenovo = new Raton("Bluetooth","Lenovo");
        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
        Monitor monitoLenovo = new Monitor("Lenovo", 27.0);
        Computadora computadoraUno = new Computadora( "Lenovo", monitoLenovo,ratonLenovo,tecladoLenovo);

        Raton ratonDell = new Raton("USB","Dell");
        Teclado tecladoDell = new Teclado("USB", "Dell");
        Monitor monitoDell = new Monitor("Dell", 27.0);
        Computadora computadoraDos = new Computadora( "Dell", monitoDell,ratonDell,tecladoDell);

        Raton ratonMac = new Raton("Bluetooth","Dell");
        Teclado tecladoMac = new Teclado("Bluetooth", "Mac");
        Monitor monitoMac = new Monitor("Mac", 27.0);
        Computadora computadoraTres = new Computadora( "Dell", monitoMac,ratonMac,tecladoMac);

        System.out.println("\n-------------------------------------------------------------");

        Orden ordenUno = new Orden();

        ordenUno.agregarComputadora(computadoraUno);
        ordenUno.agregarComputadora(computadoraDos);

        ordenUno.mostrarOrden();

        System.out.println("\n-------------------------------------------------------------\n\n");


        Orden ordenDos = new Orden();

        ordenDos.agregarComputadora(computadoraUno);
        ordenDos.agregarComputadora(computadoraDos);
        ordenDos.agregarComputadora(computadoraTres);

        ordenDos.mostrarOrden();

        System.out.println("\n-------------------------------------------------------------\n\n");
    }
}