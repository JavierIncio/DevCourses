import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = { "azul", "amarillo", "rojo", "verde", "blanco", "negro" };

        double random = Math.random(); // Devuelve un double entre '0' y '1', sin incluir el '1'.
        System.out.println("random (0-1) = " + random);

        random *= colores.length;
        System.out.println("random (0-colores.length) = " + random);

        random = Math.floor(random);
        System.out.println("Math.floor(random) = " + random); // Para evitar sacar el índice 6
        System.out.println("colores = " + colores[(int)random]);
        
        System.out.println("=====================================================================================");

        Random randomObj = new Random();

        int randomInt = randomObj.nextInt(); // Por defecto, valor aleatorio de todo el rango de enteros (2^32)
        System.out.println("randomObj.nextInt() = " + randomInt);
        randomInt = randomObj.nextInt(7); // Devuelve un entero entre '0' y '7', sin incluir el '7'.
        System.out.println("randomObj.nextInt(7) = " + randomInt);

        randomInt = 15 + randomObj.nextInt(25-15); // Devuelve un entero entre '15' y '25', sin incluir el '25'.
        System.out.println("randomObj.nextInt(7) = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}
