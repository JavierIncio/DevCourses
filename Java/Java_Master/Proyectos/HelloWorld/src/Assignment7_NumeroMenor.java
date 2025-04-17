import java.util.Scanner;

public class Assignment7_NumeroMenor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroValores;
        int menor;

        do {
            System.out.println("Introduce el numero de valores que quieres comparar (mínimo 10)");
            numeroValores = sc.nextInt();
        }while(numeroValores < 10);

        System.out.println("Introduce el valor 1");
        menor = sc.nextInt();

        for (int i = 2; i <= numeroValores; i++){
            int valor = 0;
            System.out.println("Introduce el valor " + i);
            valor = sc.nextInt();
            if (menor == 0 || menor > valor){
                menor = valor;
            }
        }
        System.out.println("menor = " + menor);

        if(menor < 10){
            System.out.println("¡El número menor es menor que 10!");
        } else {
            System.out.println("¡El número menor es mayor que 10!");
        }
    }
}
