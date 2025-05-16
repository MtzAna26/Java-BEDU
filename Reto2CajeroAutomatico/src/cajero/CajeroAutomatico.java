package cajero;
import java.util.Scanner;

public class CajeroAutomatico {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        var saldo = 1000;
        int opcion;
        do{
            System.out.println("\n BIENVENIDO AL CAJERO AUTOMATICO");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("5. Elige una opción: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Tu saldo actual es: $" + saldo);
                    break;
                case 2:
                    System.out.println("¿Cuanto deseas depositar?");
                    var deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Deposito exitoso. Tu nuevo saldo es: $" +saldo);
                    break;
                case 3:
                    System.out.println("¿Cuanto deseas retirar?");
                    var retiro = scanner.nextDouble();
                    if(retiro <= saldo){
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Tu saldo actual es: $" +saldo);
                    }else{
                        System.out.println("Fondos insuficientes. Tu saldo actual es: $" +saldo);
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero automatico ¡Hasta luego!");
                    break;
            }
        }while (opcion !=4);
        scanner.close();
    }
}
