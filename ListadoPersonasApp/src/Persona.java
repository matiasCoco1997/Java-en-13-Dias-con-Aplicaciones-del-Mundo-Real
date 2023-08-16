public class Persona {

    private Integer id;
    private String nombre;
    private  String telefono;
    private String email;
    private static Integer numeroPersonas = 0;

    public Persona() {
        this.id = ++numeroPersonas;
    }

    public Persona(String nombre, String telefono, String email) {
        this(); //Esta linea invoca al constructor vacio de persona para asignar el valor de id
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Persona persona1 = new Persona("Matias Coco", "12345678", "prueba@gmail.com");

        System.out.println(persona1.toString());

        Persona persona2 = new Persona("Rocio Coco", "12345678", "prueba2@gmail.com");

        System.out.println(persona2.toString());
    }
}


