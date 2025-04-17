public class ConversionDeTipos {
    public static void main(String[] args) {
        // De String a primitivos
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "TrUe"; // No es sensitive-case
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        // De primitivos a String
        int numeroInt2 = 100;
        System.out.println("numeroInt2 = " + numeroInt2);
        String numeroStr2 = Integer.toString(numeroInt2);
        System.out.println("numeroStr2 = " + numeroStr2);

        numeroStr2 = String.valueOf(numeroInt2 + 10);
        System.out.println("numeroStr2 = " + numeroStr2);

        numeroStr2 = String.valueOf(numeroStr2 + 10);
        System.out.println("numeroStr2 = " + numeroStr2);

        double realDouble2 = 1.23456e2;
        String realStr2 = Double.toString(realDouble2);
        System.out.println("realStr2 = " + realStr2);
        
        realStr2 = String.valueOf(1.23456e2f);
        System.out.println("realStr2 = " + realStr2);

        // Casting
        int i = 32768;
        long l = i; // Long es mayor que int, por lo0 que no hay perdida de datos y se convierte automáticamente.
        System.out.println("long del int 32768 = " + l);
        short s = (short)i; // Fuerza la conversión aunque haya perdida de datos
        System.out.println("short del int 32768 = " + s);
        char c = (char)i; // Devuelve el carácter asociado al valor html
        System.out.println("char del int 32768 = " + c);
        // boolean b = (boolean)i; // Da error porque no son tipos de datos compatibles
        float f = (float)i;
        System.out.println("f = " + f);
    }
}
