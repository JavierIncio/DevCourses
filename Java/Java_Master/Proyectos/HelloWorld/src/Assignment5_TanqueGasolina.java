import java.util.Scanner;

public class Assignment5_TanqueGasolina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double MAX_CAPACIDAD = 70.0;
        double capacidad_actual;
        String mensaje;
        
        System.out.println("Introduce la capacidad actual del tanque de gasolina (en litros): ");
        capacidad_actual = sc.nextInt();

        capacidad_actual = (capacidad_actual > MAX_CAPACIDAD) ? MAX_CAPACIDAD : capacidad_actual; // Evita que se verifique un número mayor que 70

        if (capacidad_actual == MAX_CAPACIDAD){
            mensaje = "Tanque lleno";
        } else if (capacidad_actual >= 60) {
            mensaje = "Tanque casi lleno";
        } else if (capacidad_actual >= 40) {
            mensaje = "Tanque 3/4";
        } else if (capacidad_actual >= 35) {
            mensaje = "Medio tanque";
        } else if (capacidad_actual >= 20) {
            mensaje = "Suficiente";
        } else if (capacidad_actual > 0) {
            mensaje = "Insuficiente";
        }else {
            mensaje = "Tanque vacío";
        }

        System.out.println("Estado del tanque = " + mensaje);
        sc.close();
    }
}
