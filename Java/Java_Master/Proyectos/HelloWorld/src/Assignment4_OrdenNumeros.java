import java.util.Scanner;

public class Assignment4_OrdenNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        String ordenados;
        
        System.out.println("Introduce un número: ");
        num1 = sc.nextInt();
        System.out.println("Introduce otro número: ");
        num2 = sc.nextInt();
        
        ordenados = ( num1 > num2 ) ? num1 + " > " + num2 : num2 + " > " + num1;
        System.out.println("ordenados = " + ordenados);
    }
}
