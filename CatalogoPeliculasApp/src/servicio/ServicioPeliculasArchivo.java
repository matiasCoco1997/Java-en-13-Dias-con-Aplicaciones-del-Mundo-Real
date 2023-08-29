package servicio;

import dominio.Pelicula;

import java.io.*;

public class ServicioPeliculasArchivo implements IServicioPeliculas{

    private final String NOMBRE_ARCHIVO = "peliculas.txt";

    public ServicioPeliculasArchivo(){
        var archivo = new File(NOMBRE_ARCHIVO);

        try {
            if(archivo.exists()){
                System.out.println("El archivo ya existe.");
            } else {
                var salida = new PrintWriter( new FileWriter(archivo));
                salida.close();
                System.out.println("Se ha creado el archivo.");
            }
        } catch (Exception e){
            System.out.println("Ocurrio un error al abrir el archivo: " + e.getMessage());
        }
    }

    @Override
    public void listarPeliculas() {

        var archivo = new File(NOMBRE_ARCHIVO);

        try{

            System.out.println("*** Listado de Peliculas ***");

            var entrada = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));

            String linea;

            linea = entrada.readLine();

            while (linea != null){

                var pelicula = new Pelicula(linea);

                System.out.println(pelicula);

                linea = entrada.readLine();
            }
            entrada.close();
        }
        catch (Exception e){
            System.out.println("Ocurrio un error al leer el archivo" + e.getMessage());
        }
    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {

        boolean anexar = false;

        var archivo = new File(NOMBRE_ARCHIVO);

        try{
            //revisamos si existe el archivo
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));

            //agregamos la pelicula con el metodo toString
            salida.println(pelicula);

            salida.close();

            System.out.println("Se agrego al archivo: " + pelicula);

        } catch (Exception e){
            System.out.println("Ocurrio un error al agregar pelicula: " + e.getMessage());
        }

    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {

        var archivo = new File(NOMBRE_ARCHIVO);

        try{
            var entrada = new BufferedReader(new FileReader(archivo));

            String lineaTexto;
            lineaTexto = entrada.readLine();

            var indice = 1;
            var encontrada = false;
            var peliculaBuscada = pelicula.getNombre();

            while (lineaTexto != null){

                if(peliculaBuscada != null && peliculaBuscada.equalsIgnorreCase(lineaTexto)){
                    encontrada=true;
                    break;
                }

                lineaTexto = entrada.readLine();
                indice++;

                if(encontrada){
                    System.out.println("Pelicula " + lineaTexto + " encontrada - linea " + indice);
                } else {
                    System.out.println("No se encontro la pelicula:  " + pelicula.getNombre());
                }

                entrada.close();
            }

        }catch (Exception e){
            System.out.println("Ocurrio un error al buscar en el archivo: " + e.getMessage());
        }

    }
}
