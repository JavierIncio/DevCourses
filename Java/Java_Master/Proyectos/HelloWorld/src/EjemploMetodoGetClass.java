import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "Hola, ¿qué tal?";
        Class strClass = texto.getClass();

        System.out.println("strClass = " + strClass); // class java.lang.String
        System.out.println("strClass.getName() = " + strClass.getName()); // java.lang.String
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName()); // String
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName()); // java.lang
        System.out.println("=========================================================================================");

//        for (Method metodo: strClass.getMethods()){
//            System.out.println("metodo.getName() = " + metodo.getName());
//        }

        System.out.println("=========================================================================================");
        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("intClass = " + intClass); // class java.lang.String
        System.out.println("intClass.getName() = " + intClass.getName()); // java.lang.String
        System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName()); // String
        System.out.println("intClass.getPackageName() = " + intClass.getPackageName()); // java.lang
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass()); // class java.lang.Number
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass().getSuperclass()); // class java.lang.Object
        System.out.println("=========================================================================================");
        
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("objClass = " + objClass);

        for (Method metodo: objClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }
    }
}
