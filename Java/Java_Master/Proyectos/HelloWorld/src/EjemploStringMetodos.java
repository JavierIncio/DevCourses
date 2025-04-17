public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Javier";
        System.out.println("nombre = " + nombre);
        System.out.println("------------------------------------------------");

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("------------------------------------------------");

        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("------------------------------------------------");

        System.out.println("nombre.equals(\"Javier\") = " + nombre.equals("Javier"));
        System.out.println("nombre.equals(\"javier\") = " + nombre.equals("javier"));
        System.out.println("nombre.equalsIgnoreCase(\"javier\") = " + nombre.equalsIgnoreCase("javier"));
        System.out.println("------------------------------------------------");

        System.out.println("nombre.compareTo(\"Javier\") = " + nombre.compareTo("Javier")); // Si es '0', las cadenas son iguales
        System.out.println("nombre.compareTo(\"Andrés\") = " + nombre.compareTo("Andrés")); // Si es '>0', la cadena nombre va ordenada después que el argumento
        System.out.println("nombre.compareTo(\"Sandra\") = " + nombre.compareTo("Sandra")); // Si es '<0', la cadena nombre va ordenada antes que el argumento
        System.out.println("------------------------------------------------");

        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1)) = " + nombre.charAt(nombre.length()-1));
        System.out.println("------------------------------------------------");

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(0,4) = " + nombre.substring(0,4)); // El último índice no se incluye
        System.out.println("nombre.substring(nombre.length()-1)) = " + nombre.substring(nombre.length()-1));
        System.out.println("------------------------------------------------");
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("------------------------------------------------");

        System.out.println("trabalenguas.replace(\"a\",\"_\") = " + trabalenguas.replace("a","_"));
        System.out.println("------------------------------------------------");

        System.out.println("trabalenguas.indexOf(\"lengua\") = " + trabalenguas.indexOf("lengua")); // Primer índice donde se cumple la condición
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); // Último índice donde se cumple la condición
        System.out.println("trabalenguas.indexOf(\"z\") = " + trabalenguas.indexOf('z')); // Devuelve negativo si no existe (<0 --> No existe)
        System.out.println("------------------------------------------------");

        System.out.println("trabalenguas.contains(\"lengua\") = " + trabalenguas.contains("lengua")); // Devuelve true o false si contiene la cadena
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));
        System.out.println("------------------------------------------------");

        System.out.println("     trabalenguas   ");
        System.out.println("     trabalenguas   ".trim()); // elimina espacios a la izquierda y a la derecha.
    }
}
