public class HolaMundo {
    public static void main(String[] args) {
        String saludo = "¡Hola Mundo!";
        System.out.println(saludo);
        System.out.println("saludo.toUpperCase() = " + saludo.toUpperCase());
        
        int numero = 10;
        System.out.println("numero = " + numero);// soutv

        boolean valor = true;
        if(valor){
            System.out.println("Número dentro del if = " + numero);
            int numero2 = 20;
        }
        // System.out.println("numero2 = " + numero2);

        var numero3 = "15";

        String nombre;

        if(valor){
            nombre = "Javier";
            System.out.println("nombre = " + nombre);
        }

        // System.out.println("nombre = " + nombre); // Hay que inicializarla en el mismo ámbito de aplicación

    }
}
