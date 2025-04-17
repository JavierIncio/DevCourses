public class SentenciaFor {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++){
            System.out.println("i = " + i);
        }
        System.out.println("------------------------------------------");

        for (int j = 10; j >= 0; j--){
            System.out.println("j = " + j);
        }
        System.out.println("------------------------------------------");

        for (int i = 1, j = 10; i < j; i++, j--){
            System.out.println(i + " - " + j);
        }
        System.out.println("------------------------------------------");

        for (int i = 0; i <= 10 ; i++){
            if (i % 2 == 0){
                continue; // Si el número es par, lo salta y continúa la siguiente iteración.
            }
            System.out.println("i = " + i);
        }

//        int i = 0;
//
//        for (;  ;){
//            if (i > 5){
//                break;
//            }
//            System.out.println("i = " + i);
//            i++;
//        }
//        System.out.println("i = " + i); // i = 6
    }
}
