import java.util.Arrays;
import java.util.Collections;

public class EjemploArraysForOrdenaminetoBurbuja {

    public static void ordenarBurbuja(Object[] vector){
        int total = vector.length;
        int cont = 0;

        for (int i = 0; i < total - 1; i++){

            for (int j = 0; j < total -1 -i; j++){

                if ( ((Comparable)vector[j+1]).compareTo(vector[j]) < 0 ){ // Para cambiar a orden ascendente, sustituir '<' por '>'
                    Object aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
                cont++;
            }
        }
        System.out.println("cont = " + cont);
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

        int total = productos.length;

        ordenarBurbuja(productos);

        for (int i = 0; i < total; i++){
            System.out.println("Para índice " + i + ", valor: " + productos[i]);
        }

        System.out.println("=========================================================================================");

        Integer[] numeros = new Integer[4];
        int total2 = numeros.length;

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;

        ordenarBurbuja(numeros);

        for (int i = 0; i < total2; i++){
            System.out.println("Para índice " + i + ", valor: " + numeros[i]);
        }
    }
}
