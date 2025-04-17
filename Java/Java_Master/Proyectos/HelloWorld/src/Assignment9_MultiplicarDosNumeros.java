import java.util.Scanner;

/**
 * Multiplicar dos números sin usar el símbolo de multiplicación.
 */
public class Assignment9_MultiplicarDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int total = 0;

        System.out.println("Introduce un primer número: ");
        num1 = sc.nextInt();

        System.out.println("Introduce un segundo número: ");
        num2 = sc.nextInt();

        for (int i = 0; i < Math.abs(num2); i++) {
            total += Math.abs(num1);
        }

        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
            total = -total;
        }

        System.out.println(num1 + " * " + num2 + " = " + total);
    }
}
