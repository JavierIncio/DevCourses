public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] edad = { 10, 11, 12 };
        System.out.println("Iniciamos el método main");
        System.out.println();

        System.out.println("Antes de llamar al método test: ");
        for (int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println();

        test(edad); // Se pasa la referencia al objeto.

        System.out.println("Después de llamar al método test: ");
        for (int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println();

        System.out.println("Finaliza el método main con los datos del Array modificados");
    }

    public static void test(int[] edadArr){
        System.out.println("Iniciamos el método test");
        for (int i = 0; i < edadArr.length; i++){
            edadArr[i] = edadArr[i] + 20;
        }
        System.out.println();

        System.out.println("Finaliza el método test");
        System.out.println();
    }
}
