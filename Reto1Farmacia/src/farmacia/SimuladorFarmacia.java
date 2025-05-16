package farmacia;
import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa nombre del medicamento: ");
        String medicamento = scanner.nextLine();

        System.out.println("Precio: ");
        double precio = scanner.nextDouble();
        System.out.println("Piezas: ");
        int piezas = scanner.nextInt();

        double total = precio * piezas;
        boolean aplicarDescuento = total > 500;
        double descuento = aplicarDescuento ? total * 0.15 : 0;
        double precioFinal = total - descuento;

        System.out.println("\nResumen de la compra");
        System.out.println("Nombre de medicamento: " + medicamento);
        System.out.println("Precio: " + precio);
        System.out.println("Piezas agregadas: " + piezas);
        System.out.println("Total a pagar: " + total);
        System.out.println("¿Aplica descuento?: " + aplicarDescuento);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total con descuento aplicado: " + precioFinal);
        scanner.close();
    }
}
