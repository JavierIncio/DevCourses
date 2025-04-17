public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String alumno = "Javier Incio";
        
        String detalle = "El alumno " + alumno + " está realizando el curso " + curso;
        System.out.println(detalle);

        // Precedencia de los operadoras
        int numA = 10;
        int numB = 5;
        // Como en primer lugar se encuentra una cadena, se asume que todo lo es y se concatena.
        System.out.println(detalle + numA + numB);
        // Los paréntesis alteran el orden de precedencia, por lo que primero se suman los números y después se concatena,
        System.out.println(detalle + (numA + numB));
        // Como en primer lugar se encuentran los números, se suman y, al no poder sumar la cadena, la concatena al resultado.
        System.out.println(numA + numB + detalle);
        
        String detalle2= alumno.concat(" realiza el curso ".concat(curso)).concat(".");
        System.out.println(detalle2);
//        Utilizar el método concat es mas eficiente que usar '+' para concatenar cadenas, ya que con el '+' se
//        crean instancias de la clase StringBuilder. Con cada '+' se crea una nueva instancia.
    }
}
