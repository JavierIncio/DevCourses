import java.util.Arrays;

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("------------------------------------------------");

        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray()); // Devuelve el hash (identificador) del arreglo
        char[] array = trabalenguas.toCharArray();
        int largo = array.length;
//        for (int i = 0; i < largo; i++){
//            System.out.println("array[" + i + "] = " + array[i]);
//        }
        for (int i = 0; i < largo; i++){
            System.out.print(array[i]);
        }
        System.out.println("\n------------------------------------------------");

        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));
        String[] array2 = trabalenguas.split("a");

        System.out.println("Arrays.toString(trabalenguas.split(\"a\")) = " + Arrays.toString(array2));
        System.out.println("\n------------------------------------------------");

        String archivo = "nombre.archivo.pdf";
        System.out.println("archivo = " + archivo);

        String[] arrayArchivo = archivo.split("\\."); // "." es una palabra reservada de "regular expressions", por lo que se pone con "\\." o "[.]"
        int l = arrayArchivo.length;

        for (int j = 0; j < l; j++){
            System.out.println(arrayArchivo[j]);
        }

        System.out.println("arrayArchivo[l-1] = " + arrayArchivo[l-1]);
    }
}
