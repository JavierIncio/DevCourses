public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10;

        System.out.println("Iniciamos el método main con i = " + i);
        test(i); // Se pasa el valor y no la referencia al objeto.
        System.out.println("Finaliza el método main con i (se mantiene igual) = " + i);
    }

    public static void test(int i){
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Finaliza el método test con i = " + i);
    }
}
