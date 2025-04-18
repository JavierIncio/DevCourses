import java.sql.SQLOutput;
import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {
        
        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de entorno/ambiente del sistema = " + varEnv);

        System.out.println("\n=====================================================================================");
        System.out.println("------ Listando variables de entorno del sistema ------");
        for (String key : varEnv.keySet()){
            System.out.println(key + " => " + varEnv.get(key));
        }
        System.out.println("=====================================================================================");

        String username = System.getenv("USERNAME");
        System.out.println("\nusername = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        String path2 = varEnv.get("Path"); // Al ser un mapa, hay que escribirlo tal y como está registrado en el sistema
        System.out.println("path2 = " + path2);

        String appEnv = varEnv.get("APPLICATION_ENV"); // Si creamos una nueva variable de entorno, hay que reiniciar el IDE.
        System.out.println("appEnv = " + appEnv);

        // Para crear una variable de entorno desde la terminal: > setx NOMBRE_VARIABLE "valor"

        String hola = varEnv.get("SALUDAR_HOLA");
        System.out.println("hola = " + hola);
    }
}
