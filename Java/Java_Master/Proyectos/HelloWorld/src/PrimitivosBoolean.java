public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean datoLogico = true; // o 'false'
        System.out.println("datoLogico = " + datoLogico);
//        boolean datoLogico2 = Boolean.FALSE; // Objeto de tipo boolean. El valor es constante
//        System.out.println("datoLogico2 = " + datoLogico2);
        System.out.println("------------------------------------------------");

        double d = 98765.43e-3; // 98.76543
        System.out.println("d = " + d);
        float f = 1.2345e2f; // 123.45
        System.out.println("f = " + f);
        datoLogico = d > f;
        System.out.println("d > f = " + datoLogico);

        boolean esIgual = (3 - 2 == 1);
        System.out.println("3 - 2 == 1 = " + esIgual);
    }
}
