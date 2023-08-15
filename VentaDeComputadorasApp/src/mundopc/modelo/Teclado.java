package mundopc.modelo;

public class Teclado extends DispositivoEntrada{

    private final int idTeclado;
    private static int contadorTeclado;

    public Teclado(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada, marca);
        this.idTeclado = ++contadorTeclado;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "idTeclado=" + idTeclado +
                "} " + super.toString(); // el super invoca el metodo toString de la clase padre
    }
}
