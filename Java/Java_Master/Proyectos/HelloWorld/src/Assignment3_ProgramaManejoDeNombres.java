import java.util.Scanner;

public class Assignment3_ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] familiares = new String[3];
        String resultado = "";

        for (int i = 0; i < familiares.length; i++){
            System.out.println("Introduce el nombre de un familiar: ");
            familiares[i] = sc.nextLine();
            resultado += familiares[i].substring(1,2).toUpperCase().concat(".".concat(familiares[i].substring(familiares[i].length()-2))) + " ";
        }

        resultado = resultado.trim().replace(" ", "_");
        System.out.println(resultado);
    }
}