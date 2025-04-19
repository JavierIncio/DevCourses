import java.util.Arrays;

public class EjemploArraysFor {
    public static void main(String[] args) {

        String productos[] = new String[7];
        int cont = productos.length;

        for (int i = 0; i < cont; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ª generación";
        productos[6] = "Monitor Omen 24\"";
        
        System.out.println();

        System.out.println("----------------------------------- USANDO FOR ------------------------------------------");
        Arrays.sort(productos);
        for (int i = 0; i < cont; i++){
            System.out.println("Para índice " + i + " : " + productos[i]);
        }
        
        System.out.println("---------------------------------- USANDO FOREACH ---------------------------------------");
        for (String prod : productos){
            System.out.println("prod = " + prod);
        }

        System.out.println("---------------------------------- USANDO WHILE -----------------------------------------");
        int i = 0;
        while (i < cont){
            System.out.println("Para índice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("-------------------------------- USANDO DO WHILE ----------------------------------------");
        int j = 0;
        do {
            System.out.println("Para índice " + j + " : " + productos[j]);
            j++;
        } while (j < cont);

        System.out.println("\n=========================================================================================");

        int[] numeros = new int[10];
        int contNum = numeros.length;

        for (int k = 0; k < contNum; k++){
            numeros[k] = k*3;
        }

        for (int k = 0; k < contNum; k++){
            System.out.println("Para índice " + k + " : " + numeros[k]);
        }

    }
}
