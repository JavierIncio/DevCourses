import java.util.Arrays;

public class EjemploArraysForInverso {
    public static void main(String[] args) {

        String productos[] = {
                "Kingston Pendrive 64GB",
                "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo",
                "Asus Notebook",
                "Macbook Air",
                "Chromecast 4ª generación",
                "Monitor Omen 24\""
        };

        int cont = productos.length;

        Arrays.sort(productos);

        System.out.println("----------------------------------- USANDO FOR ------------------------------------------");
        for (int i = 0; i < cont; i++){
            System.out.println("Para índice " + i + ", valor: " + productos[i]);
        }

        System.out.println("----------------------------- USANDO FOR INVERSO (1) ------------------------------------");
        for (int i = 0; i < cont; i++){
            System.out.println("Para índice " + (cont-1-i) + ", valor: " + productos[cont-1-i]);
        }

        System.out.println("----------------------------- USANDO FOR INVERSO (2) ------------------------------------");
        for (int i = cont - 1 ; i >= 0; i--){
            System.out.println("Para índice " + i + ", valor: " + productos[i]);
        }
    }
}
