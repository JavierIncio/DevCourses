public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "nombre.imagen.jpeg";
        System.out.println("archivo = " + archivo);
        int i = archivo.lastIndexOf("."); // Si usamos indexOf() puede dar error si hay más '.' en el nombre
        System.out.println("archivo.lastIndexOf(\".\") = " + i);
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));
    }
}
