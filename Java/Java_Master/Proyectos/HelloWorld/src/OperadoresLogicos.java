
public class OperadoresLogicos {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        System.out.println("------------------------------------------------");

        boolean b1 = i == 3 && k > l;
        System.out.println("b1: (i == 3 && k > l) = " + b1);

        boolean b2 = i == j || k < l;
        System.out.println("b2: (i == j || k < l) = " + b2);

        boolean b3 = i == j && k > l || m == false;
        System.out.println("b3: (i == j && k > l || m == false) = " + b3);

        boolean b4 = i == j && (k > l || m == false);
        System.out.println("b4: (i == j && (k > l || m == false)) = " + b4);

        boolean b5 = i == 3 || k < l && m == true; // i == 3 || (k < l && m == true)
        System.out.println("b5: (i == 3 || k < l && m == true) = " + b5);

        boolean b6 = true || true && false; // true || (true && false)
        System.out.println("b6: (true || true && false) = " + b6);

        boolean b7 = true || false && false || false; // true || (false && false) || false
        System.out.println("b7: (true || false && false || false) = " + b7);

    }
}
