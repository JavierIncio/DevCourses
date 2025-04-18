import javax.swing.*;

/**
 *  Pedir el radio de un círculo y calcular su área.
 *  Utilizar la fórmula: [area = PI * r²]
 */
public class Assignment12_CalcularAreaCirculo {
    public static void main(String[] args) {
        double r = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del círculo para calcular su área:"));
        double area = Math.PI * Math.pow(r,2);
        JOptionPane.showMessageDialog(null, "El área del circulo con radio '" + r + "' es de: " + Math.round(area));
        System.exit(0);
    }
}