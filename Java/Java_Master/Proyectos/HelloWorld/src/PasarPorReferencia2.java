class Persona {
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Javier");

        System.out.println("Iniciamos el método main");
        System.out.println();

        System.out.println("Antes de llamar al método test: ");
        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        System.out.println();

        test(persona); // Se pasa la referencia al objeto.
        System.out.println();

        System.out.println("Después de llamar al método test: ");
        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        System.out.println();

        System.out.println("Finaliza el método main con los datos de la persona modificados");
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el método test");
        persona.modificarNombre("Juan");
        System.out.println();
        System.out.println("Finaliza el método test");
    }
}
