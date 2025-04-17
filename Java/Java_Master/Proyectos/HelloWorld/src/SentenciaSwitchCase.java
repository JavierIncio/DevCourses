import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        char num = '3';
//        switch (num){
//            case '0':
//                System.out.println("El num es 0");
//                break;
//            case '1':
//                System.out.println("El num es 1");
//                break;
//            case '2':
//                System.out.println("El num es 2");
//                break;
//            case '3':
//                System.out.println("El num es 3");
//                break;
//            default:
//                System.out.println("Numero desconocido");
//        }
//
//        String user = "javier";
//        switch (user){
//            case "admin":
//                System.out.println("Hola Admin, bienvenido");
//                break;
//            case "javier":
//                System.out.println("Hola Javier, bienvenido");
//                break;
//            case "andres":
//                System.out.println("Hola Andrés, bienvenido");
//                break;
//            default:
//                System.out.println("Usuario desconocido");
//        }

        int mes = 0;
        String nombreMes = null;

        System.out.println("Ingresa el numero de mes de 1-12: ");
        mes = sc.nextInt();

        switch (mes){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Indefinido");
        }

    }
}
