import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
//        variable = condición ? si es verdadero : si es falso
//        String var = 7 == 7 ? "Es verdadero":"Es falso";

        Scanner sc = new Scanner(System.in);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double biologia = 0.0;
        double historia = 0.0;

        System.out.println("Ingrese la nota de matemáticas: ");
        matematicas = sc.nextDouble();
        System.out.println("Ingrese la nota de biología: ");
        biologia = sc.nextDouble();
        System.out.println("Ingrese la nota de historia: ");
        historia = sc.nextDouble();

        promedio = (matematicas + biologia + historia) / 3;

        estado = promedio >= 5.00 ? "Aprobado":"Suspenso";
        System.out.println("estado = " + estado);

    }
}
