public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        for (int num: numeros){
            System.out.println("num = " + num);
        }
        System.out.println("------------------------------------------------");

        String[] nombres = {"Andrés", "María", "Juan", "Ana", "Marcos", "Pepe"};
        for (String nombre: nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
