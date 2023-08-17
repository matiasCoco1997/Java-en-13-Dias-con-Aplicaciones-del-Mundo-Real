package presentacion;

import dominio.Pelicula;
import servicio.IServicioPeliculas;
import servicio.ServicioPeliculasLista;

import java.util.Scanner;

public class CatalogoPeliculasApp {
    public static void main(String[] args) {


        Pelicula peliculaUno = new Pelicula("Batman");
        Pelicula peliculaDos = new Pelicula("Superman");
        Pelicula peliculaTres = new Pelicula("Antman");

        var salir = false;
        var consola = new Scanner(System.in);
        IServicioPeliculas servicioPeliculas = new ServicioPeliculasLista();

        while(!salir){

            try{

                mostrarMenu();
                salir = ejecutarOpciones(consola, servicioPeliculas);

            } catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }

            System.out.println("\n\n****************************************************************");
        }
    }

    private static void mostrarMenu(){

        System.out.println("""
                \n--------------------------------
                *** Catalogo de Peliculas ***
                1. Agregar pelicula
                2. Listar peliculas
                3. Buscar Pelicula
                4. Salir
                --------------------------------
                
                Seleccione una opción: """);
    }

    private static  boolean ejecutarOpciones(Scanner consola, IServicioPeliculas servicioPeliculas){

        var opcionSeleccionada = Integer.parseInt(consola.nextLine());
        var resultado = false;

        switch (opcionSeleccionada){

            case 1->{
                System.out.println("Introduce el nombre de la pelicula");

                var nombrePelicula = consola.nextLine();

                servicioPeliculas.agregarPelicula(new Pelicula(nombrePelicula));
            }

            case 2->{
                servicioPeliculas.listarPeliculas();
            }

            case 3->{
                System.out.println("Introduce el nombre de la pelicula a buscar");

                var nombrePeliculaABuscar = consola.nextLine();

                servicioPeliculas.buscarPelicula(new Pelicula(nombrePeliculaABuscar));
            }

            case 4->{
                System.out.println("Hasta pronto...");
                resultado = true;
            }

            default->{
                System.out.println("Opcion no reconocida: " + opcionSeleccionada);
            }
        }

        return resultado;
    }
}

