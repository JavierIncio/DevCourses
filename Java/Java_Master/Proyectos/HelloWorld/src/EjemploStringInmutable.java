public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String alumno = "Javier Incio";

        alumno.concat(curso);
        System.out.println("alumno = " + alumno);

        String resultado = alumno.concat(curso);
        System.out.println("resultado = " + resultado);
        System.out.println("alumno == resultado: " + alumno == resultado);
        System.out.println("------------------------------------------------");

        alumno.transform((a) -> {
            return a + " realiza el curso " + curso;
        });
        System.out.println("alumno = " + alumno);

        String resultado2 = alumno.transform((a) -> {
            return a + " realiza el curso " + curso;
        });
        System.out.println("resultado2 = " + resultado2);
        System.out.println("------------------------------------------------");

        resultado.replace("a", "A");
        System.out.println("resultado = " + resultado);

        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado3 = " + resultado3);
    }
}
