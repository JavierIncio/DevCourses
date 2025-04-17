
public class OperadorInstanceOf {
    public static void main(String[] args) {

        Boolean b1;
        String texto = "Hola, ¿qué tal?";
        Integer num = 7;
        Double decimal = 45.54;

        System.out.println("texto = " + texto);
        System.out.println("num = " + num);
        System.out.println("decimal = " + decimal);
        System.out.println("------------------------------------------------");

        b1 = texto instanceof String;
        System.out.println("¿'texto' es una instancia de 'String'? = " + b1);

//        b1 = texto instanceof Integer;

        b1 = texto instanceof Object;
        System.out.println("¿'texto' es una instancia de 'Object'? = " + b1);
        System.out.println("------------------------------------------------");

        b1 = num instanceof Integer;
        System.out.println("¿'num' es una instancia de 'Integer'? = " + b1);

//        b1 = num instanceof Long;

        b1 = num instanceof Number;
        System.out.println("¿'num' es una instancia de 'Number'? = " + b1);

        b1 = num instanceof Object;
        System.out.println("¿'num' es una instancia de 'Object'? = " + b1);
        System.out.println("------------------------------------------------");

        b1 = decimal instanceof Number;
        System.out.println("¿'decimal' es una instancia de 'Number'? = " + b1);

        b1 = decimal instanceof Object;
        System.out.println("¿'decimal' es una instancia de 'Object'? = " + b1);
        System.out.println("------------------------------------------------");

        b1 = b1 instanceof Boolean;
        System.out.println("¿'b1' es una instancia de 'Boolean'? = " + b1);
    }
}
