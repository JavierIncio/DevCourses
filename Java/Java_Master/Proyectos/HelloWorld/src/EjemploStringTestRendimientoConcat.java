public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++){
            // c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1000 => 3ms, 10000 => 133ms, 100000 => 4106ms (4,1s)
            // c += a + b + "\n"; // 500 => 12ms, 1000 => 12ms, 10000 => 47ms, 100000 => 1509ms (1,5s)
            sb.append(a).append(b).append("\n"); // 500 => 0ms, 1000 => 0ms, 10000 => 2ms, 100000 => 10ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin-inicio);
        // System.out.println("sb = " + sb.toString());
    }
}
