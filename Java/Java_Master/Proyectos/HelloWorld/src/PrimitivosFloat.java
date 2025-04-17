public class PrimitivosFloat {
    public static void main(String[] args) {

        // FLOAT
        float realFloat = 3.4028235e38f; // De 1.4e-45 a 3.4028235e38f (2^32 = 4.294.967.296 bits de rango)
        System.out.println("realFloat = " + realFloat);
        float realFloat2 = 1.0f;
        System.out.println("realFloat2 = " + realFloat2);
        float realFloat3 = 1.5e4f; // 15000.0f
        System.out.println("realFloat3 = " + realFloat3);
        float realFloat4 = 1.5e-10f; // 0.00000000015f
        System.out.println("realFloat4 = " + realFloat4);

        System.out.println("\nrealFloat = " + realFloat);
        System.out.println("El tipo float corresponde en bytes a " + Float.BYTES);
        System.out.println("El tipo float corresponde en bits a " + Float.SIZE);
        System.out.println("El valor máximo de un tipo float es " + Float.MAX_VALUE);
        System.out.println("El valor mínimo de un tipo float es " + Float.MIN_VALUE);

        //DOUBLE
        double realDouble = 3.4028235e39; // De 4.9e-324 a 1.7976931348623157e308 (2^64 = 18.446.744.073.709.551.616 bits de rango)
        System.out.println("realDouble = " + realDouble);

        System.out.println("\nrealFloat = " + realFloat);
        System.out.println("El tipo double corresponde en bytes a " + Double.BYTES);
        System.out.println("El tipo double corresponde en bits a " + Double.SIZE);
        System.out.println("El valor máximo de un tipo double es " + Double.MAX_VALUE);
        System.out.println("El valor mínimo de un tipo double es " + Double.MIN_VALUE);

        // VAR
        //Las variables dinámicas son de tipo int por defecto (double si es un valor punto flotante)
        var decimalVar = 3d; // Se especifica el valor entero como double
        System.out.println("\ndecimalVar = " + decimalVar);
        System.out.println("\t"+((Object)decimalVar).getClass());
        var decimalVar2 = 3.141592;
        System.out.println("\ndecimalVar2 = " + decimalVar2);
        System.out.println("\t"+((Object)decimalVar2).getClass());
        var decimalVar3 = 3.141592f;
        System.out.println("\ndecimalVar3 = " + decimalVar3);
        System.out.println("\t"+((Object)decimalVar3).getClass());
    }
}
