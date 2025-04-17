public class AutoboxingInteger {
    public static void main(String[] args) {

        Integer[] enteros = { Integer.valueOf(1), 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

        int sumaPares = 0;

        // FORMA EXPLÍCITA
        for (Integer i : enteros){
            if (i.intValue() % 2 == 0){
                sumaPares += i.intValue();
            }
        }
        System.out.println("sumaPares = " + sumaPares);

        System.out.println("=========================================================================================");

        // FORMA IMPLÍCITA
        // En cualquier operación aritmética que implique una clase Wrapper, el compilador de Java realiza un autoboxing
        // sin necesidad de llamar a .intValue()
        sumaPares = 0;
        for (Integer i : enteros){
            if (i % 2 == 0){
                sumaPares += i;
            }
        }
        System.out.println("sumaPares = " + sumaPares);
    }
}
