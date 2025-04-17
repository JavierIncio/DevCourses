import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "javier";
        String password = "1234";

        String username2 = "admin";
        String password2 = "admin";

        System.out.println("Ingrese el nombre de usuario: ");
        String user = sc.next();
        System.out.println("Ingrese la contraseña: ");
        String pass = sc.next();

        boolean isAuthenticated = false;

        if ( username.equals(user.trim()) && password.equals(pass.trim()) ||
                username2.equals(user.trim()) && password2.equals(pass.trim()) ){
            isAuthenticated = true;
        } else {
            System.out.println("El usuario o la contraseña son incorrectos");
        }

        if (isAuthenticated){
            System.out.println("Bienvenido usuario ".concat(user));
        } else {
            System.out.println("Es necesario iniciar sesión.");
            main(args);
        }

    }
}
