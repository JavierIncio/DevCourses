public class PrimitivosCaracteres {
    public static void main(String[] args) {

        // CHAR
        char caracter = 'A'; // Solo un carácter
        System.out.println("caracter = " + caracter);

        char caracterNum = '9'; // Números del 0 al 9
        System.out.println("caracterNum = " + caracterNum);

        char caracterUnicode = '\u0040'; // Caracteres unicode
        System.out.println("caracterUnicode = " + caracterUnicode);

        char caracterDecimal = 64; // Caracteres en notación html
        System.out.println("caracterDecimal = " + caracterDecimal);

        System.out.println("caracterUnicode == caracterDecimal: " + (caracterUnicode == caracterDecimal));

        char caracterSimbolo = '@';
        System.out.println("caracterSimbolo = " + caracterSimbolo);

        System.out.println("caracterUnicode == caracterSimbolo: " + (caracterUnicode == caracterSimbolo));
        System.out.println("------------------------------------------------");

        // VAR
        //Las variables dinámicas son de tipo int por defecto (double si es un valor punto flotante)
        var caracter2 = '\u0040';
        System.out.println("caracter2 = " + caracter2);
        System.out.println("\t"+((Object)caracter2).getClass());
        var caracterNum2 = 64; // Devuelve el int, no '@'
        System.out.println("\ncaracterNum2 = " + caracterNum2);
        System.out.println("\t"+((Object)caracterNum2).getClass());
        System.out.println("------------------------------------------------");

        System.out.println("El tipo char corresponde en bytes a " + Character.BYTES);
        System.out.println("El tipo char corresponde en bits a " + Character.SIZE);
        System.out.println("El valor máximo de un tipo char es " + Character.MAX_VALUE);
        System.out.println("El valor mínimo de un tipo char es " + Character.MIN_VALUE);

        // Caracteres especiales
        System.out.println("------------------------------------------------");
        char espacio = ' '; // '\u0020'
        System.out.println("12345" + espacio + "67890");
        System.out.println("12345\u002067890");
        System.out.println("------------------------------------------------");
        char retroceso = '\b';
        System.out.println("12345" + retroceso + "67890");
        System.out.println("12345\b67890");
        System.out.println("------------------------------------------------");
        char tabulador = '\t';
        System.out.println("12345" + tabulador + "67890");
        System.out.println("12345\t67890");
        System.out.println("------------------------------------------------");
        char nuevaLinea = '\n';
        System.out.println("12345" + nuevaLinea + "67890");
        System.out.println("12345\n67890");
        System.out.println("------------------------------------------------");
        char retornoCarro = '\r';
        System.out.println("12345" + retornoCarro + "67890");
        System.out.println("12345\r67890");
        System.out.println("------------------------------------------------");
        System.getProperty("line-separator"); // Devuelve la secuencia de escape (o combinación de secuencias) necesaria para saltar de línea en nuestro Sistema Operativo
        System.lineSeparator();
    }
}
