import javax.swing.*;

public class SentenciaForArray {
    public static void main(String[] args) {

        String[] nombres = {"Andrés", "María", "Juan", "Ana", "Marcos", "Pepe"};
        int cont = nombres.length;

        for (int indice = 0; indice < cont; indice++) {
            if ( nombres[indice].equalsIgnoreCase("Andrés") ||
                    nombres[indice].toLowerCase().contains("ANA".toLowerCase()) ){
                continue;
            }
            System.out.println(indice + " - " + nombres[indice]);
        }
        System.out.println("------------------------------------------");

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre a buscar (por ejemplo, \"Pepe\" o \"María\"):");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < cont && !encontrado; i++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado.");
        } else{
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema.");
        }
    }
}
