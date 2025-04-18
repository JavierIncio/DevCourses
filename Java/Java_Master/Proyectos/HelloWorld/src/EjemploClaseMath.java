public class EjemploClaseMath {
    public static void main(String[] args) {
        
        int absoluto = Math.abs(-3);
        System.out.println("Math.abs(-3) = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("Math.abs(3) = " + absoluto);
        System.out.println("=====================================================================================");

        double max = Math.max(3.5, 1.2);
        System.out.println("\nMath.max(3.5, 1.2) = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("Math.min(3.5, 1.2) = " + min);
        System.out.println("=====================================================================================");

        double techo = Math.ceil(3.5); // Redondea hacia arriba
        System.out.println("\nMath.ceil(3.5) = " + techo);

        double suelo = Math.floor(3.5); // Redondea hacia abajo
        System.out.println("Math.floor(3.5) = " + suelo);

        long entero = Math.round(Math.PI); // Redondea automáticamente y devuelve un entero
        System.out.println("Math.round(Math.PI) = " + entero);
        System.out.println("=====================================================================================");

        System.out.println("\nMath.E = " + Math.E);

        double exp = Math.exp(1); // Calcula 'E' elevado a '1', es decir, 'e¹', donde e ≈ 2.71828...
        System.out.println("Math.exp(1) = " + exp + " => Math.E^1");

        double log = Math.log(10); // Calcula la potencia a la que hay que elevar 'E' para que el resultado sea '10'
        System.out.println("Math.log(10) = " + log + " => e^" + log + " ≈ 10");
        System.out.println("=====================================================================================");

        double potencia = Math.pow(10, 3); // 10^3 = 1000
        System.out.println("\nMath.pow(10, 3) = " + potencia);

        double raiz = Math.sqrt(5); // √5 ≈ 2.24
        System.out.println("Math.sqrt(5) = " + raiz);
        System.out.println("=====================================================================================");

        double grados = Math.toDegrees(1.57); // Convierte de radianes a grados
        grados = Math.round(grados);
        System.out.println("\nMath.toDegrees(1.57) = " + grados);

        double radianes = Math.toRadians(90d); // Convierte de grados a radianes
        System.out.println("Math.toRadians(90d) = " + radianes);

        System.out.println("sin(90): " + Math.sin(radianes)); // El valor ha de estar en radianes, si se pasa (90), interpreta 90 radianes
        System.out.println("cos(90): " + Math.cos(radianes));

        radianes = Math.toRadians(180d);
        System.out.println("cos(180): " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("cos(0): " + Math.cos(radianes));
    }
}
