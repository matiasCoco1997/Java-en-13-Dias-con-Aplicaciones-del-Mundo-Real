import dominio.Pelicula;
import servicio.IServicioPeliculas;
import servicio.ServicioPeliculasLista;

public class Main {
    public static void main(String[] args) {


        Pelicula peliculaUno = new Pelicula("Batman");
        Pelicula peliculaDos = new Pelicula("Superman");
        Pelicula peliculaTres = new Pelicula("Antman");


        IServicioPeliculas servicioPeliculas = new ServicioPeliculasLista();

        System.out.println("\n--------------------------------------------\n");
        servicioPeliculas.agregarPelicula(peliculaUno);
        System.out.println("\n--------------------------------------------\n");
        servicioPeliculas.agregarPelicula(peliculaDos);
        System.out.println("\n--------------------------------------------\n");
        servicioPeliculas.agregarPelicula(peliculaTres);
        System.out.println("\n--------------------------------------------\n");

        System.out.println("\n*******************************************");
        servicioPeliculas.listarPeliculas();
        System.out.println("*******************************************\n");

        System.out.println("\n--------------------------------------------\n");
        servicioPeliculas.buscarPelicula(peliculaDos);
        System.out.println("\n--------------------------------------------\n");
    }
}