import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArraysForInversoMutable {

    public static void inverso(String[] vector){
        int cont2 = vector.length;
        int cont = vector.length;

        for (int i = 0; i < cont2; i++){
            String actual = vector[i];
            String inverso = vector[cont-1-i];
            vector[i] = inverso;
            vector[cont-1-i] = actual;
            cont2--;
        }
    }

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

        System.out.println("------------------------------------ OPCIÓN 1 -------------------------------------------");
        // Si se modifica más de la mitad, se revierten los cambios
        for (int i = 0; i < cont/2; i++){
            String actual = productos[i];
            String inverso = productos[cont-1-i];
            productos[i] = inverso;
            productos[cont-1-i] = actual;
        }
        for (int i = 0; i < cont; i++){
            System.out.println("Para índice " + i + ", valor: " + productos[i]);
        }

        System.out.println("------------------------------------ OPCIÓN 2 -------------------------------------------");
        inverso(productos);

        for (int i = 0; i < cont; i++){
            System.out.println("Para índice " + i + ", valor: " + productos[i]);
        }

        System.out.println("------------------------------------ OPCIÓN 3 -------------------------------------------");
        Collections.reverse(Arrays.asList(productos));

        for (int i = 0; i < cont; i++){
            System.out.println("Para índice " + i + ", valor: " + productos[i]);
        }

    }
}
