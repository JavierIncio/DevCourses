
public class OperadoresUnarios {
    public static void main(String[] args) {
        int i = -5;
        System.out.println("i = " + i);

        int j = +i; // j = (1)*i => -5
        System.out.println("j = +i: " + j);

        int k = -i; // k = (-1)*i => 5
        System.out.println("k = -i: " + k);

        System.out.println("------------------------------------------------");

        i = 6;
        System.out.println("i = " + i);

        j = +i; // j = (1)*i => 6
        System.out.println("j = +i: " + j);

        k = -i; // k = (-1)*i => -6
        System.out.println("k = -i: " + k);
    }
}
