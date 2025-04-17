public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        // BOXING
        boolean primBoolean = num1 > num2; // false
        Boolean objBoolean = false;
        Boolean objBoolean2 = Boolean.valueOf(primBoolean);
        Boolean objBoolean3 = Boolean.valueOf("false");
        System.out.println("=========================================================================================");

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);
        System.out.println("objBoolean3 = " + objBoolean3);
        System.out.println("=========================================================================================");

        System.out.println("objBoolean == objBoolean2 = " + (objBoolean == objBoolean2)); // Compara usando '=='
        System.out.println("objBoolean2 == objBoolean3 = " + (objBoolean2 == objBoolean3));
        System.out.println("objBoolean.equals(objBoolean3) = " + (objBoolean.equals(objBoolean3))); // Compara usando '.equals'
        System.out.println("objBoolean2.equals(objBoolean3) = " + (objBoolean2.equals(objBoolean3)));
        System.out.println("=========================================================================================");

        // UNBOXING
        boolean primBoolean2 = objBoolean2.booleanValue();
        System.out.println("primBoolean2 = " + primBoolean2);
    }
}
