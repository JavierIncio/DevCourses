public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");

        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2: " + esIgual);
        
        esIgual = curso.equals(curso2);
        System.out.println("\"Programación Java\".equals(\"Programación Java\"): " + esIgual);

        curso2 = "programación JAVA";
        esIgual = curso.equals(curso2);
        System.out.println("\"Programación Java\".equals(\"programación JAVA\"): " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("\"Programación Java\".equalsIgnoreCase(\"programación JAVA\"): " + esIgual);

        // Cuando se crea una String con la literal con el mismo valor que otro objeto tipo String ya creado. De esta
        // forma se optimiza memoria y no se crea un nuevo objeto, sino que se asigna la dirección de memoria del objeto
        // existente al nuevo objeto.
        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3: " + esIgual);

        // Si cambiamos el contenido de curso3, no modificamos el objeto original, sino que curso3 deja de apuntar a
        // "Programación Java" y empieza a apuntar hacia un nuevo objeto "Java".
        curso3 = "Java";
        System.out.println("curso = " + curso);
        System.out.println("curso3 = " + curso3);
        esIgual = curso == curso3;
        System.out.println("curso == curso3: " + esIgual);

        // Si volvemos a cambiar el contenido de curso3 a "Programación Java", como ya existe en la mString Pool,
        // vuelve a apuntar hacia "Programación Java" del objeto curso3. "Java" sigue existiendo en la String Pool
        // aunque ningún puntero apunte hacia la String.
        curso3 = "Programación Java";
        System.out.println("curso = " + curso);
        System.out.println("curso3 = " + curso3);
        esIgual = curso == curso3;
        System.out.println("curso == curso3: " + esIgual);
    }
}
