import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            // Se intenta abrir un archivo llamado config.properties que se encuentra en la carpeta src.
            FileInputStream archivo = new FileInputStream("src/config.properties");
            // Se crea un objeto Properties que copia todas las propiedades actuales del sistema.
            Properties p = new Properties(System.getProperties());
            // Se cargan las propiedades desde el archivo config.properties al objeto p.
            p.load(archivo);
            // Se añade (o sobrescribe) una propiedad personalizada al objeto p.
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto Properties"); // ("nombre", "valor")
            // Se actualizan las propiedades del sistema con el objeto p.
            System.setProperties(p);

            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(\"mi.propiedad.personalizada\") = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println("System.getProperty(\"config.puerto.servidor\") = " + System.getProperty("config.puerto.servidor"));
            System.out.println("System.getProperty(\"config.autor.nombre\") = " + System.getProperty("config.autor.nombre"));
            System.out.println("System.getProperty(\"config.autor.email\") = " + System.getProperty("config.autor.email"));
            System.out.println("System.getProperty(\"config.texto.ambiente\") = " + System.getProperty("config.texto.ambiente"));

            System.out.println("\n=====================================================================================");
            // Se imprimen todas las propiedades actuales del sistema en la consola, incluida la que acabamos de agregar.
            ps.list(System.out);
            System.out.println("=====================================================================================");

        } catch (Exception e) {
            System.err.println("No existe el archivo: " + e); // Muestra el texto de error en rojo
            System.exit(1); // Se sale del sistema tras lanzar la excepción (!= 0)
        }
    }
}
