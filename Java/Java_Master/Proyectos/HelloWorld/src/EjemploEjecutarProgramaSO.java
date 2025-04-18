
public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        String os = System.getProperty("os.name").toLowerCase();
        Runtime rt = Runtime.getRuntime();
        Process proceso;

        try {
            if (os.contains("win")){
                proceso = rt.exec("notepad");
            } else if (os.contains("mac")){
                proceso = rt.exec("open -a TextEdit");
            } else if ( os.contains("nux") || os.contains("nix") || os.contains("aix") ){
                proceso = rt.exec("gedit");
            } else {
                System.err.println("Sistema operativo no compatible");
                proceso = rt.exec("gedit"); // Para que no de error
            }

            proceso.waitFor(); // Si hay un notepad abierto previamente, no funciona

        } catch (Exception e) {
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
