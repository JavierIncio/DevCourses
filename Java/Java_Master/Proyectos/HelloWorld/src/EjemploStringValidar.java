public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean isNull = curso == null;
        System.out.println("curso == null: " + isNull);

        if (isNull){
            curso = ""; // "Programación Java";
            System.out.println("curso = " + curso);
        }

        boolean isEmpty = curso.length() == 0;
        System.out.println("curso.length() == 0: " + isEmpty);

        boolean isAlsoEmpty = curso.isEmpty();
        System.out.println("curso.isEmpty(): " + isAlsoEmpty);

        if (!isAlsoEmpty){
            System.out.println(curso.toUpperCase());
            System.out.println(curso.concat(" desde cero"));
        }

        curso = " ";

        isAlsoEmpty = curso.isEmpty();
        System.out.println("curso.isEmpty() = " + isAlsoEmpty);

        boolean isBlank = curso.isBlank(); // Desde la versión 11<
        System.out.println("curso.isBlank() = " + isBlank);

        if (!isBlank){
            System.out.println(curso.toUpperCase());
            System.out.println(curso.concat(" desde cero"));
        }
    }
}
