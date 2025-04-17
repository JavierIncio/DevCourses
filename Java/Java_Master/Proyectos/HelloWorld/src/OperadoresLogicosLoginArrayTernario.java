import java.util.Scanner;

public class OperadoresLogicosLoginArrayTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String[] usernames = new String[2];
//        String[] passwords = new String[2];
//
//        usernames[0] = "javier";
//        passwords[0] = "1234";
//
//        usernames[1] = "admin";
//        passwords[1] = "admin";

        String[] usernames = { "javier", "admin" };
        String[] passwords = { "1234", "admin" };

        System.out.println("Ingrese el nombre de usuario: ");
        String user = sc.next();
        System.out.println("Ingrese la contraseña: ");
        String pass = sc.next();

        boolean isAuthenticated = false;

        for (int i = 0; i < usernames.length; i++){
            isAuthenticated = ( usernames[i].equals(user.trim()) && passwords[i].equals(pass.trim())) ? true : isAuthenticated;

            /*if ( usernames[i].equals(user.trim()) && passwords[i].equals(pass.trim())){
                isAuthenticated = true;
                break;
            }*/
        }

        String mensaje = isAuthenticated ? "Bienvenido usuario ".concat(user) : "El usuario o la contraseña son incorrectos";
        System.out.println(mensaje);

        /*if (isAuthenticated){
            System.out.println("Bienvenido usuario ".concat(user));
        } else {
            System.out.println("El usuario o la contraseña son incorrectos");
        }*/

    }
}
