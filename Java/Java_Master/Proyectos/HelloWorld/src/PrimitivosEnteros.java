public class PrimitivosEnteros {
    public static void main(String[] args) {

        // BYTE
        byte numByte = 127; // De -128 a 127 (2^8 = 256 bits de rango)
        System.out.println("\nnumByte = " + numByte);
        System.out.println("El tipo byte corresponde en bytes a " + Byte.BYTES);
        System.out.println("El tipo byte corresponde en bits a " + Byte.SIZE);
        System.out.println("El valor máximo de un tipo byte es " + Byte.MAX_VALUE);
        System.out.println("El valor mínimo de un tipo byte es " + Byte.MIN_VALUE);

        // SHORT
        short numShort = 32767; // De -32768 a 32767 (2^16 = 65.536 bits de rango)
        System.out.println("\nnumShort = " + numShort);
        System.out.println("El tipo short corresponde en bytes a " + Short.BYTES);
        System.out.println("El tipo short corresponde en bits a " + Short.SIZE);
        System.out.println("El valor máximo de un tipo short es " + Short.MAX_VALUE);
        System.out.println("El valor mínimo de un tipo short es " + Short.MIN_VALUE);

        // INT
        int numInt = 2147483647; // De -2147483648 a 2147483647 (2^32 = 4.294.967.296 bits de rango)
        System.out.println("\nnumInt = " + numInt);
        System.out.println("El tipo int corresponde en bytes a " + Integer.BYTES);
        System.out.println("El tipo int corresponde en bits a " + Integer.SIZE);
        System.out.println("El valor máximo de un tipo int es " + Integer.MAX_VALUE);
        System.out.println("El valor mínimo de un tipo int es " + Integer.MIN_VALUE);

        // LONG
        long numLong = 9223372036854775807L; // De -9223372036854775808 a 9223372036854775807 (2^64 = 18.446.744.073.709.551.616 bits de rango)
        System.out.println("\nnumLong = " + numLong);
        System.out.println("El tipo long corresponde en bytes a " + Long.BYTES);
        System.out.println("El tipo long corresponde en bits a " + Long.SIZE);
        System.out.println("El valor máximo de un tipo long es " + Long.MAX_VALUE);
        System.out.println("El valor mínimo de un tipo long es " + Long.MIN_VALUE);

        // VAR
        //Las variables dinámicas son de tipo int por defecto a no ser que se superen los valores mínimo/máximo
        var numVar = 127;
        System.out.println("\nnumVar = " + numVar);
        System.out.println("\t"+((Object)numVar).getClass());
        var numVar2 = 32767;
        System.out.println("\nnumVar2 = " + numVar2);
        System.out.println("\t"+((Object)numVar2).getClass());
        var numVar3 = 2147483647;
        System.out.println("\nnumVar3 = " + numVar3);
        System.out.println("\t"+((Object)numVar3).getClass());
        var numVar4 = 9223372036854775807L;
        System.out.println("\nnumVar4 = " + numVar4);
        System.out.println("\t"+((Object)numVar4).getClass());
    }
}
