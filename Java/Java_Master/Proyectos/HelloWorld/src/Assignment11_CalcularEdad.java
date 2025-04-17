import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *  Ingresar una fecha de nacimiento en formato string, convertirla a una fecha del tipo java.util.Date y calcular
 *  la edad de la persona de acuerdo a la fecha actual.
 */
public class Assignment11_CalcularEdad {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");

        Date fechaActual = new Date();

        try {
            Date fechaNacimiento = sdf.parse(JOptionPane.showInputDialog("Introduce tu fecha de nacimiento con formato \"dd 'de' MMMM 'de' yyyy\""));

            Calendar nacimiento = Calendar.getInstance();
            nacimiento.setTime(fechaNacimiento);

            Calendar actual = Calendar.getInstance();
            actual.setTime(fechaActual);

            int edad = actual.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);

            if (actual.get(Calendar.MONTH) < nacimiento.get(Calendar.MONTH) ||
                    (actual.get(Calendar.MONTH) == nacimiento.get(Calendar.MONTH) &&
                            actual.get(Calendar.DAY_OF_MONTH) < nacimiento.get(Calendar.DAY_OF_MONTH))) {
                edad--;
            }

            JOptionPane.showMessageDialog(null, "Tu edad es: " + edad + " años.");

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto.");
            System.exit(1);
        }
        System.exit(0);
    }
}