import java.util.*;

public class Assignment10_MenuOpcionesIterativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        String[] opciones = {
                "\n1 - Actualizar",
                "2 - Eliminar",
                "3 - Agregar",
                "4 - Listar",
                "5 - Salir",
        };

        do {
            for (String opc : opciones){
                System.out.println(opc);
            }

            System.out.println("\nIngresa un numero (1-5): ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("\nUsuario actualizado correctamente");
                    break;
                case 2:
                    System.out.println("\nUsuario eliminado correctamente");
                    break;
                case 3:
                    System.out.println("\nUsuario agregado correctamente");
                    break;
                case 4:
                    System.out.println("\nMostrando lista de usuarios...");
                    break;
                case 5:
                    System.out.println("\nSaliendo...");
                    break;
                default:
                    System.out.println("\nLa opción introducida no es válida.");
            }
        }while(opcion != 5);

        System.out.println("\nHas salido con exito!");
        sc.close();
        System.exit(0);
    }
}
