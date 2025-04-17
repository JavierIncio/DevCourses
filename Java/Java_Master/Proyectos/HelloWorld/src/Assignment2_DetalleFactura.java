import java.util.Scanner;

public class Assignment2_DetalleFactura {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        final double IMPUESTO = 0.19;
        String descripcion = null;
        double precioProducto1 = 0.0;
        double precioProducto2 = 0.0;
        double totalBruto = 0.0;
        double totalImpuesto = 0.0;
        double total = 0.0;

        System.out.println("Introduzca descripción de la factura: ");
        descripcion = sc.nextLine();
        System.out.println("Introduzca el precio del primer producto: ");
        precioProducto1 = sc.nextDouble();
        System.out.println("Introduzca el precio del segundo producto: ");
        precioProducto2 = sc.nextDouble();

        totalBruto = precioProducto1 + precioProducto2;
        totalImpuesto = totalBruto*IMPUESTO;
        total = totalBruto + totalImpuesto;

        System.out.printf("La factura %s tiene un total bruto de %.2f, con un impuesto de %.2f y el monto después " +
                "del impuesto es de %.2f", descripcion, totalBruto, totalImpuesto, total
        );
    }
}
