import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número entero.");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);



        System.out.println("------------------------------------------------");

        String resultadoBinario = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        int numeroBinario = 0b111110100; // Si no ponemos '0b' al principio, se identifica como decimal.
        System.out.println("numeroBinario = " + numeroBinario); // Lo interpreta como binario y lo muestra convertido a decimal.
        System.out.println("------------------------------------------------");

        String resultadoOctal = "Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 0764; // Si no ponemos '0' al principio, se identifica como decimal.
        System.out.println("numeroOctal = " + numeroOctal);
        System.out.println("------------------------------------------------");

        String resultadoHex = "Número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);
        int numeroHex = 0x1f4; // Si no ponemos '0x' al principio, da error.
        System.out.println("numeroHex = " + numeroHex);
        System.out.println("------------------------------------------------");

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
