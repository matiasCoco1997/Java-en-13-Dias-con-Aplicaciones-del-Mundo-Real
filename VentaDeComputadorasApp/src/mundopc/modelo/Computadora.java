package mundopc.modelo;

public class Computadora {

    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Raton raton;
    private Teclado teclado;

    private static int contadorComputadoras;

    private Computadora(){
        idComputadora = ++contadorComputadoras;
    }

    public Computadora(String nombre, Monitor monitor, Raton raton, Teclado teclado) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.raton = raton;
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "\nComputadora{" +
                "\n- idComputadora=" + idComputadora +
                ", nombre='" + nombre + '\'' +
                "\n- monitor=" + monitor +
                "\n- raton=" + raton +
                "\n- teclado=" + teclado +
                "\n}";

        //el println que usamos para invocar el toString, invoca los toString de los hijos de manera automatica
    }
}
