public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 5.5f;

        if (promedio >= 6.5){
            System.out.println("¡Felicidades, excelente promedio!");
        } else if (promedio >= 6.0){
            System.out.println("Muy buen promedio");
        } else if (promedio >= 5.5) {
            System.out.println("Buen promedio");
        } else if (promedio >= 5.0) {
            System.out.println("Regular, necesitas esforzarte más...");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente, ¡necesitas estudiar más!");
        }else {
            System.out.println("¡Suspenso!");
        }

        System.out.println("Tu promedio es " + promedio);
    }
}
