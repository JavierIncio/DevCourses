import java.util.Scanner;

public class Assignment8_NotasAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contMayores5 = 0;
        double sumaMayores5 = 0;

        int contMenores4 = 0;
        double sumaMenores4 = 0;

        int contNotas1 = 0;

        int contTotalNotas = 0;
        double sumaTotalNotas = 0;

        bucle: for (int i = 1; i <= 20; i++){
            double nota = 0.0;
            do {
                System.out.println("Introduce la nota " + i + " (1 - 7): ");
                nota = sc.nextDouble();
                if (nota == 0) {
                    System.out.println("Error. Finalizando el programa");
                    break bucle;
                }
            }while(nota < 1 || nota > 7);

            if (nota == 1){
                contNotas1++;
            } else if (nota > 5){
                contMayores5++;
                sumaMayores5 += nota;
            }else if (nota < 4){
                contMenores4++;
                sumaMenores4 += nota;
            }

            contTotalNotas++;
            sumaTotalNotas += nota;
        }

        if (contMayores5 > 0) {
            System.out.printf("\nPromedio de notas > 5: %.2f", (sumaMayores5 / contMayores5));
        } else {
            System.out.println("No se ingresaron notas mayores a 5.");
        }

        if (contMenores4 > 0) {
            System.out.printf("\nPromedio de notas < 4: %.2f", (sumaMenores4 / contMenores4));
        } else {
            System.out.println("No se ingresaron notas menores a 4.");
        }

        System.out.println("\nCantidad de notas 1: " + contNotas1);

        System.out.printf("Promedio total de notas: %.2f", (sumaTotalNotas / contTotalNotas));
    }
}
