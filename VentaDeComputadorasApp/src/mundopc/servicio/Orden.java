package mundopc.servicio;

import mundopc.modelo.Computadora;

import java.util.ArrayList;
import java.util.List;

public class Orden {

    private final int idOrden;

    private final List<Computadora> computadoras;

    private static int contadorOrdenes;

    public Orden() {
        this.computadoras = new ArrayList<>();
        this.idOrden = ++contadorOrdenes;
    }

    public void agregarComputadora( Computadora computadora){
        this.computadoras.add(computadora);
    }

    public void mostrarOrden(){

        System.out.println("Orden #: " + idOrden);
        System.out.println("Total computadoras: " + computadoras.size());
        System.out.println();
        computadoras.forEach(System.out::println);// Lo que hace este for each con el ::, hace que se invoque el metodo println por cada objeto
    }
}
