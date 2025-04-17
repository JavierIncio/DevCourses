
public class OperadoresIncrementales {
    public static void main(String[] args) {
//        PRE-INCREMENTO
        int i = 1;
        System.out.println("valor inicial de i = " + i);
        int j = ++i; // i = i + 1; j = i; (Se incrementa y después se asigna a 'j')
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("------------------------------------------------");

//        POST-INCREMENTO
        i = 2;
        System.out.println("valor inicial de i = " + i);
        j = i++; // j = i; i = i + 1; (Se asigna a 'j' y después se incrementa)
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("------------------------------------------------");

//        PRE-DECREMENTO
        i = 3;
        System.out.println("valor inicial de i = " + i);
        j = --i; // i = i - 1; j = i; (Se incrementa y después se asigna a 'j')
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("------------------------------------------------");

//        POST-DECREMENTO
        i = 4;
        System.out.println("valor inicial de i = " + i);
        j = i--; // j = i; i = i - 1; (Se asigna a 'j' y después se incrementa)
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("------------------------------------------------");

        int k = 1;
        System.out.println("valor inicial de k = " + k);
        System.out.println("(++k) = " + (++k)); // Se incrementa y se asigna / imprime.
        System.out.println("k = " + k);
        System.out.println("(k++) = " + (k++)); // Se asigna / imprime y se incrementa.
        System.out.println("valor final de k = " + k);
    }
}
