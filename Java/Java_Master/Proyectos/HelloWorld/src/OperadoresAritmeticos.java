import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;

        System.out.println("i + j = " + suma);
        System.out.println("i + j = " + i + j);
        System.out.println("i + j = " + (i + j));

        int resta = i - j;
        System.out.println("i - j = " + resta);
//        System.out.println("i + j = " + i - j); // El String solo reconoce el operador '+'.
        System.out.println("i + j = " + (i - j));

        int multi = i * j;
        System.out.println("i * j = " + multi);

        int div = i / j;
        System.out.println("i / j = " + div); // Resultado redondeado porque 'div' es un int
        float div2 = (float)i / j;
        System.out.println("div2 = " + div2);

        int resto = i % j;
        System.out.println("i % j = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        if (numero % 2 == 0){
            System.out.println("numero par = " + numero);
        }else  {
            System.out.println("numero impar = " + numero);
        }
    }
}
