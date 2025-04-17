public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(128);
        Integer num2 = num1; // Misma instancia

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("¿num1 y num2 son el mismo objeto? --> " + (num1==num2)); // true
        System.out.println("¿num1 y num2 tienen el mismo valor? --> " + (num1.equals(num2))); // true

        System.out.println("=========================================================================================");

        num2 = 128; // Mismo valor, pero distinta instancia
        // Si es 127 o menos, Java compara siempre por valor y no por instancia

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("¿num1 y num2 son el mismo objeto? --> " + (num1==num2)); // false
        System.out.println("¿num1 y num2 tienen el mismo valor? --> " + (num1.equals(num2))); // true
//        System.out.println("¿num1 y num2 tienen el mismo valor? --> " + (num1.intValue() == num2.intValue()));
    }
}
