package servicio;

import dominio.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class ServicioPeliculasLista implements IServicioPeliculas {


    private final List<Pelicula> peliculas;

    public ServicioPeliculasLista(){
        this.peliculas = new ArrayList<>();
    }

    @Override
    public void listarPeliculas() {
        System.out.println("Listado de peliculas...");
        peliculas.forEach(System.out::println);
    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.println("Se agrego la pelicula: "+ pelicula);
    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {
        var indice = peliculas.indexOf(pelicula);//el indexOf retorna el indice de la pelicula que estamos buscando, sino retorna -1

        if (indice == -1){
            System.out.println("La pelicula buscada no existe: " + pelicula);
        } else {
            System.out.println("Pelicula encontrada en el indice: " + indice);
        }


    }
}
