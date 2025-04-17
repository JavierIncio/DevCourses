public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo); // Boxing [Forma Explícita] --> Transforma un literal a objeto
        System.out.println("intObjeto = " + intObjeto);
        Integer intObjeto2 = intPrimitivo; // AutoBoxing [Forma Implícita]
        System.out.println("intObjeto2 = " + intObjeto2);
        System.out.println("=========================================================================================");

        int num = intObjeto; // [Forma Implícita] --> Transforma un objeto a primitivo
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue(); // [Forma Implícita]
        System.out.println("num2 = " + num2);
        System.out.println("=========================================================================================");

        String precioCoche = "47000";
        Integer precio = Integer.valueOf(precioCoche);
        System.out.println("precio = " + precio);
        System.out.println("=========================================================================================");

        Short shortObjeto = 32767; // Cuando se utiliza autoboxing, el valor tiene que estar dentro del rango máximo
        Short shortObjeto2 = intObjeto.shortValue(); // No da error, pero hay perdida de datos
        System.out.println("shortObjeto2 = " + shortObjeto2);
        System.out.println("=========================================================================================");

        Byte byteObjeto = -128; // Dentro del rango
        byteObjeto = intObjeto.byteValue(); // No da error, pero hay perdida de datos
        System.out.println("byteObjeto = " + byteObjeto);
        System.out.println("=========================================================================================");

        Long longObjeto = 3276890L;
        longObjeto = longObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
    }
}
