import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();
        var salir = false;

        while(!salir){
            mostrarMenu();

            try{
                salir = ejecutarOperacion(consola, personas);
            }

            catch (Exception e){
                System.out.println("Ocurrio un error:" + e.getMessage());
            }

            System.out.println();
        }
    }

    private static void mostrarMenu(){
        System.out.print("""
                *** Listado Personas App ***
                
                1. Agregar
                2. Listar
                3. Salir
                
                """);

        System.out.print("Selecciona una opción:");
    }

    private static boolean ejecutarOperacion( Scanner consola, List<Persona> personas){

        var opcionSeleccionada = Integer.parseInt(consola.nextLine());

        var salir = false;

        switch (opcionSeleccionada){

            case 1 -> {//Agregar persona

                System.out.print("Ingrese su nombre:");
                var nombre = consola.nextLine();

                System.out.print("Ingrese su telefono:");
                var telefono = consola.nextLine();

                System.out.print("Ingrese su email:");
                var email = consola.nextLine();

                var persona = new Persona(nombre, telefono, email);

                personas.add(persona);

                System.out.println("La lista tiene: " + personas.size() + "elementos");
            }

            case 2 -> {//Mostrar lista de personas

                System.out.println("Listado de personas:");

                personas.forEach(System.out::println); // por cada persona se va a ejecutar println eso lo hace el ::

            }

            case 3->{
                System.out.println("Hasta pronto...");
                salir=true;
            }

            default -> {
                System.out.println("Opcion erronea;");
            }
        }

        return salir;

    }
}