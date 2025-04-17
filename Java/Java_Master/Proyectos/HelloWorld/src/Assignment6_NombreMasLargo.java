import javax.swing.*;

public class Assignment6_NombreMasLargo {
    public static void main(String[] args) {

        String nombre1, nombre2, nombre3, masLargo;
        int nombre1A, nombre2A, nombre3A;

        nombre1 = JOptionPane.showInputDialog("Introduce el nombre completo de un familiar o amigo");
        nombre2 = JOptionPane.showInputDialog("Introduce el nombre completo de un familiar o amigo");
        nombre3 = JOptionPane.showInputDialog("Introduce el nombre completo de un familiar o amigo");

        nombre1A = nombre1.split(" ")[0].length();
        nombre2A = nombre2.split(" ")[0].length();
        nombre3A = nombre3.split(" ")[0].length();

        if (nombre1A > nombre2A){
            masLargo = nombre1;
        }else if (nombre2A > nombre3A){
            masLargo = nombre2;
        }else{
            masLargo = nombre3;
        }

        System.out.println(masLargo.concat(" tiene el nombre más largo."));
    }
}
